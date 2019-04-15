import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long start = System.currentTimeMillis();
		String s = sc.next();
		int low = 0;
		int high = s.length() - 1;
		boolean isPalin = false;
		while (low < high) {
			if (s.charAt(low) != s.charAt(high)) {
				isPalin = true;
				break;
			}
			low++;
			high--;
		}
		if (!isPalin)
			System.out.println("is PalinDrom");
		else
			System.out.println("is NOT PalinDrom");
		long end = System.currentTimeMillis();
		long test = end - start;
		System.out.println("Time : " + test / 1000 + " sec");
	}
}
