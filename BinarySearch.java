import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = {{11,1,12},{0,13,2},{4,3,8},{9,10,20}};
		int key = sc.nextInt();
		System.out.println("Find in Index : " + binarySearch(a, key));
	}
	public static int binarySearch(int[][] x, int key) {
		sortArr(x);	
		int lower = 0;
		int higher = x.length - 1;
		while (lower <= higher) {
			int midd = (lower + higher) / 2;
			for (int j = 0; j <= higher; j++)
			if (x[midd][midd] > key) 
				higher = midd - 1;
			else if (x[midd][midd] == key)
				return midd;
			else
				lower = midd + 1;
		}
		return -lower - 1;
	}
	public static void sortArr(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int k = 0; k < x[i].length; k++) {
				for (int j = 0; j < x.length - 1; j++) {
					for (int t = 0; t < x[i].length - 1; t++) {
						if (x[j][t] > x[j + 1][t + 1]) {
							int temp = x[j][t];
							x[j][t] = x[j + 1][t + 1];
							x[j + 1][t + 1] = temp;
						}
					}
				}
			}
		}
		System.out.println("After Sorting Array : ");
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}
}
