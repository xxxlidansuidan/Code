/* (Find the factors of an integer) Write a program that reads an integer and displays
all its smallest factors in an increasing order. For example, if the input integer is
120 , the output should be as follows: 2 , 2 , 2 , 3 , 5 .*/

import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				num /= i;
			}
			else
				i++;
		}
		System.out.println();
	}
}
