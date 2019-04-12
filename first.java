import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = (int)(100000 + (Math.random() * 1000000000));
		int num2 = (int)(100000 + (Math.random() * 1000000000));
			if  (num1 < num2) {
				int tempu = num1;
				num1 = num2;
				num2 = tempu;
			}
		System.out.println("What is : " + num1 + " - " + num2 + " ?");
		int num = sc.nextInt();
		System.out.println("your Answer is " + ((num1 + num2 == num) ? "Right" : "Wrong-try again"));
		while (num1 - num2 != num) {
		System.out.print("See Answer/paly again? [Y/n] :");
		char ch = sc.next().charAt(0);
		if (ch == 'N' || ch == 'n') { 
			System.out.println("What is : " + num1 + " - " + num2 + " ?");
			num = sc.nextInt();
		}
		else if (ch == 'Y' || ch == 'y') {
			System.out.println("Answer is : " + num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		}
		else {
			System.out.println("Invaild Option!");
			break;
		}
		}		
	}
}
