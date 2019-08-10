import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long start = System.currentTimeMillis();
		String s = sc.next();
		int low = 0;
		int high = s.length() - 1;
		boolean isPalindrom = true;
		while (low < high && isPalindrom) { //isPalindrom = true; going without break;
			if (s.charAt(low) != s.charAt(high)) {
				isPalin = false;
			}
			low++;
			high--;
		}
		System.out.println(s + " is " + (isPalindrom ? "" : "not") + " Palindrom");
		long end = System.currentTimeMillis();
		long test = end - start;
		System.out.println("Time : " + test / 1000 + " sec");
	}
}
