/*********************************************************************************
* (Explore matrix) Write a program that prompts the user to enter the length of  *
* a square matrix, randomly fills in 0s and 1s into the matrix, prints the       *
* matrix, and finds the rows, columns, and diagonals with all 0s or 1s.  
* Exercise_08_14: input-output sample :
Enter the size for the matrix: 4
0111
0000
0100
1111
All 0s on row 2
All 1s on row 4
No same numbers on a column
No same numbers on the major diagonal
No same numbers on the sub−diagonal
*********************************************************************************/
import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] ch = new int[n][n];
		for (int i = 0; i < ch.length; i++) 
			for (int j = 0; j < ch[i].length; j++)
				ch[i][j] = input.nextInt();
		getRow(ch);
		getColm(ch);
		getMajor(ch);
		getSub(ch);
	}
	public static void getSub(int[][] a) {
		boolean flag = true;
		for (int i = 1; i < a.length; i++) {
			if (a[i-1][a.length - i - 1] != a[i][a.length - i]) {
				flag = false;
				break;
			}
		}
		if (flag) System.out.println("All " + a[0][a.length - 1] + "s on sub Diagonal");
		else System.out.println("No same numbers on sub Diagonal");
	}
	public static void getMajor(int[][] a) {
		boolean flag = true;
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j++) {
				if (i == j) {
					if (a[i-1][j-1] != a[i][j]) {
						flag = false;
						break;
					}
				}
			}
		}
		if (flag) System.out.println("All " + a[0][0] + "s on major Diagonal");
		else System.out.println("No same numbers on major Diagonal");
	}
	public static void getRow(int[][] a) {
		boolean k = true;
		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = 1; j < a[i].length; j++) {
				if (a[i][j-1] != a[i][j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
			       System.out.println("All " + a[i][0] + "s on row " + (i+1));
			       k = false;
			}
		}
		if (k) System.out.println("No same numbers on row");
	}
	public static void getColm(int[][] a) {
		boolean k = true;
		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			for (int j = 1; j < a[i].length; j++) {
				if (a[j-1][i] != a[j][i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
			       System.out.println("All " + a[0][i] + "s on column " + (i+1));
			       k = false;
			}
		}
		if (k) System.out.println("No same numbers on column");
	}
}
