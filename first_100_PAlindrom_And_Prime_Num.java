/*(Palindromic prime) A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and 757.
Write a program that displays the first 120 palindromic prime numbers. Display
10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929*/

class Code {
	public static void main(String... args) {
		final int NUMBER_OF_PALENDROMIC_PRIME = 100;
		final int NUMBER_PER_LINE = 10;
		int count = 0;
		int n = 2;
		while (count < NUMBER_OF_PALENDROMIC_PRIME) {
			if (isPrime(n)) {
				count++;
				System.out.print(count % NUMBER_PER_LINE == 0 ? n + "\n" : n + " ");
			}
			n++;
		}
	}
	public static boolean isPrime(int num) {
		if (isPalindrom(num)) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
		}
		return false;
	}
	public static boolean isPalindrom(int num) {
		return num == reverse(num) ? true : false;
	}
	public static int reverse(int num) {
		String reverse = "";
		String str = num + "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return Integer.parseInt(reverse);
	}
}
