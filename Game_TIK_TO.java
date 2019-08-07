import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		String[][] board = getBoard();
		String[] tokens = {" X ", " O "};
		int result;
		do {
			print(board);
			int[] cell = getCell(board, tokens[0]);
			placeTokens(board, cell, tokens[0]);
			result = gameStatus(board, tokens[0]);
			if (result == 2)
				swap(tokens);
		} while (result == 2);
		print(board);
		if (result == 0)
			System.out.println(tokens[0] + " player has Won");
		else
			System.out.println("Both player has Won");
	}
	public static String[][] getBoard() {
		String[][] m = new String[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				m[i][j] = "   ";
		return m;
	}
	public static int[] getCell(String[][] m, String t) {
		Scanner input = new Scanner(System.in);
		int[] cell = new int[2];
		do {
			System.out.print("Enter a row(0. 1. or 2) for player " + t + ": ");
			cell[0] = input.nextInt();
			System.out.print("Enter a column(0. 1. or 2) for player " + t + ": ");
			cell[1] = input.nextInt();
		} while (!isValidCell(m, cell));
		return cell;
	}
	public static boolean isValidCell(String[][] m, int[] cell) {
		for (int i = 0; i < cell.length; i++)
			if (cell[i] < 0 || cell[i] >= 3)
				return false;
		if (m[cell[0]][cell[1]] != "   ")
			return false;
		return true;
	}
	public static void placeTokens(String[][] m, int[] cell, String t) {
		m[cell[0]][cell[1]] = t;
	}
	public static int gameStatus(String[][] m, String t) {
		if (isWon(m, t))
			return 0;
		else if (isDraw(m))
			return 1;
		else
			return 2;
	}
	public static boolean isWon(String[][] m, String t) {
		return isHorizontalWon(m, t) || isVerticalWon(m, t) || isDiagonalWon(m, t);
	}
	public static boolean isDiagonalWon(String[][] m, String t) {
		int count = 0;
		for (int i = 0; i < m.length; i++)
			if (m[i][i] == t)
				count++;
		if (count == 3)
			return true;
		count = 0;
		for (int i = 0, j = m[i].length - 1; j >= 0; i++, j--)
			if (m[i][j] == t)
				count++;
		if (count == 3)
			return true;
		return false;
	}
	public static boolean isVerticalWon(String[][] m, String t) {
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == t)
					count++;
			}
			if (count == 3)
				return true;
		}
		return false;
	}
	public static boolean isHorizontalWon(String[][] m, String t) {
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == t)
					count++;
			}
			if (count == 3)
				return true;
		}
		return false;
	}
	public static boolean isDraw(String[][] m) {
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				if (m[i][j] == "   ")
					return false;
		return true;
	}
	public static void print(String[][] m) {
		System.out.println("\n-------------");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("|" + m[i][j]);
			}
		System.out.println("|\n-------------");
		}
	}
	public static void swap(String[] t) {
		String temp = t[0];
		t[0] = t[1];
		t[1] = temp;
	}
}
