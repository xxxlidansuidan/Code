import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Binary = "+ num + "\tDecimal = " + temp(num));
		printBinaryform(num);
		System.out.println();
	}
	public static int temp(int x) {
	int binary = x;
        int decimal = 0;
        int power = 0;
	if (x == 0)
		return 0;
        while(true){
            if(binary == 0){
		    break;
            } else {
                int temp = binary%10;
                decimal += Math.pow((temp * 2), power);
                binary /= 10;
                power++;
            }
        }
	return decimal;
    }
    private static void printBinaryform(int number) {
        int remainder;
        if (number <= 1) {
            System.out.print(number);
            return; // KICK OUT OF THE RECURSION
        }
        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}
