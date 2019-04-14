import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long start = System.currentTimeMillis();
		//converting Decimal to HexaDecimal!
		System.out.print("Enter your Decimal Value here : ")
		int decimal = sc.nextInt();
		String hex = "";
		while (decimal != 0) {
			int hexValue = decimal % 16;
			char ch = (0 <= hexValue && hexValue <= 9) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
			hex = ch + hex;
			decimal /= 16;
		}
		long end = System.currentTimeMillis();
		long test = end - start;
		System.out.println("Hexadecimal is : " + hex);
		System.out.println("Time : " + test / 1000 + " sec");
	}
}
