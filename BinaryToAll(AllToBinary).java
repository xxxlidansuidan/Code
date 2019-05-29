/*
(Decimal to binary) Write a program that prompts the user to enter a decimal
integer and displays its corresponding binary value. Don’t use Java’s Integer
.toBinaryString(int) in this program.
*/
import java.util.Scanner;
public class Exercise_05_37 {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a decimal integer
		System.out.print("Enter a decimial interger: ");
		int decimal = input.nextInt();

		// Convert the decimal number to a binary number
		String binary = "";	// Holds the binary value
		for (int i = decimal; i > 0; i /= 2) {
			binary = (i % 2) + binary; 
		}
		// Display the corresponding binary value of the decimal integer
		System.out.println(
			"The binary value of the decimial \"" + decimal + "\" is: " + binary);
	}
}
/*
(Decimal to octal) Write a program that prompts the user to enter a decimal
integer and displays its corresponding octal value. Don’t use Java’s Integer
.toOctalString(int) in this program.
*/
import java.util.Scanner;

public class Exercise_05_38 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter a decimal integer
		System.out.print("Enter a decimal integer: ");
		int decimal = input.nextInt();

		// Convet decimal to octal
		String octal = "";							// Hold octal value
		for (int i = decimal; i > 0; i /= 8) {
			octal = i % 8 + octal;
		}

		// Display results
		System.out.println("The octal of " + decimal + " is " + octal);
	}
}



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
