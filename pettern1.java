/*(Display pyramid) Write a program that prompts the user to enter an integer from
1 to 15 and displays a pyramid, as shown in the following sample run:

Enter the number = 7 
7 6 5 4 3 2 1 2 3 4 5 6 7
6 5 4 3 2 1 2 3 3 4 5 6
5 4 3 2 1 2 3 4 5
4 3 2 1 2 3 4
3 2 1 2 3
2 1 2
1
*/
import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = num; i >= 1; i--) {
			for (int j = i; j >= 2; j--) {
				System.out.print(j + " ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
			num--;
		}

	}
}
