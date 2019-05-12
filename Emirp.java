/*(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so
17 and 71 are emirps. Write a program that displays the first 120 emirps. Display
10 numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389*/

class Code {
        public static void main(String... args) {
                final int NUMBER_OF_PALENDROMIC_PRIME = 120;
                final int NUMBER_PER_LINE = 10; 
                int count = 0;
                int n = 2;
                while (count < NUMBER_OF_PALENDROMIC_PRIME) {
                        if (isEmp(n)) {
                                count++;
                                System.out.print(count % NUMBER_PER_LINE == 0 ? n + "\n" : n + " ");
                        }
                        n++;
                }
        }
        public static boolean isEmp(int num) {
                /**here is an Important topic: therefore It have to be
                 * true for Both And false for one in Same Time*/
                return isPrime(num) && !isPalindrome(num) && isPrime(reverse(num));
        }   
        public static boolean isPrime(int num) {
                for (int i = 2; i <= num / 2; i++) {
                        if (num % i == 0)
                                return false;
                }
                return true;
        }        
        public static boolean isPalindrome(int number) {
                return number == reverse(number) ? true : false;
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
