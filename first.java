import java.util.Scanner;
class Code {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int max = 122;
		int min = 97;
		int range = max - min + 1;
		for (int i = 0; i < 175; i++) {
			char ch = (char)(int) ((Math.random() * range) + min);
			if ((i + 1) % 25 == 0)
				System.out.println(ch);
			else
				System.out.print(ch + " ");
		}
	}
}
