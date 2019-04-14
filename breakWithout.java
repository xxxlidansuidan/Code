import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long start = System.currentTimeMillis();
		//converting Decimal to HexaDecimal!
		System.out.print("Enter your Decimal Value here : ");
		int num = sc.nextInt();
		boolean flag = false;
		int factor = 2;
		while (factor <= num && !flag) {
			if (num % factor == 0)
				flag = true;
			factor++;
		}
		long end = System.currentTimeMillis();
		long test = end - start;
		System.out.println(factor);
		System.out.println("Time : " + test / 1000 + " sec");
	}
}
