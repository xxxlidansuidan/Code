import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		/*this about generate random between 0 & 1;
		 */
		Scanner sc = new Scanner(System.in);
		int num = random();
		System.out.println(num);
	}
	public static int random() {
		return (Math.random() > 0.5) ? 0 : 1;
	}
}
