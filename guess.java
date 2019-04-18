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
