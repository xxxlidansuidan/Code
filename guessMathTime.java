import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		final int NUM_OF_QUE = 5;
		int count = 0;
		int correctcount = 0;
		long startTime = System.currentTimeMillis();
		String output = null;
		Scanner sc = new Scanner(System.in);
		while (count < NUM_OF_QUE) {
			int num1 = (int)(10 + (Math.random() * 100));
			int num2 = (int)(10 + (Math.random() * 100));
			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			System.out.print("What is (" + num1 + " - " + num2 + ") = ? : ");
			int answer = sc.nextInt();
			if (num1 - num2 == answer) {
				System.out.println("your Answer : (" + num1 + " - " + num2 + ") = " + answer + " is Correct!");
				correctcount++;
			} else 
				System.out.println("Wrong Answer : (" + num1 + " - " + num2 + ") should be = " + (num1 - num2));
			count++;
			output += "\n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2 == answer) ? " Correct" : " Wrong!");
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("Corrent count is " + correctcount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
	} 
}
