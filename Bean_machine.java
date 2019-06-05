/**
 * Chapter 7 Exercise 21:
 *
 *      (Game: bean machine) The bean machine, also known as a quincunx
 *      or the Galton box, is a device for statistics experiments named after
 *      English scientist Sir Francis Galton. It consists of an upright board
 *      with evenly spaced nails (or pegs) in a triangular form.
 *      Each ball takes a random path and falls into a slot.
 *
 *      Balls are dropped from the opening of the board. Every time a ball hits a nail,
 *      it has a 50% chance of falling to the left or to the right. The piles of balls
 *      are accumulated in the slots at the bottom of the board.
 *      Write a program that simulates the bean machine. Your program should prompt the user
 *      to enter the number of the balls and the number of the slots in the machine.
 *      Simulate the falling of each ball by printing its path.
 *
 *      (Hint: Create an array named slots. Each element in slots stores the number of balls
 *      in a slot. Each ball falls into a slot via a path. The number of Rs in a path is the
 *      position of the slot where the ball falls. For example, for the path LRLRLRR, the ball
 *      falls into slots[4], and for the path is RRLLLLL, the ball falls into slots[2].)
 */

import java.util.Scanner;
class Exercise_07_21 {
	/** Main method */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create a Scanner

		// Prompt the user to enter the number of the balls
		System.out.print("Enter the number of balls to drop: ");
		int drops = input.nextInt();

		// Prompt the user to enter the number of slots
		System.out.print("Enter the number of slots in the bean machine: ");
		int nails = input.nextInt() - 1;

		String[] paths = new String[nails * drops]; // Path of each ball
		int[] balls = new int[nails]; // The slot of each ball 

		int numberOfRs = 0; // The number of Rs in a path
		for (int i = 0; i < paths.length; i++) {
			paths[i] = getRandomPath();

			// If if ball path is right increament numberOfRs
			if (paths[i] == "R") {
				numberOfRs++; 
			}

			// Count the number of balls in each slot
			if ((i + 1) % nails == 0) {
				balls[numberOfRs]++; 
				numberOfRs = 0;
			}
		}	

		// Display the path of the balls
		print(paths, nails);
		
		// Display the the final buildup of the balls in the slots in a histogram 
		print(balls);

	}

	/** getRandomPath returns the string L or R randomly */
	public static String getRandomPath() {
		if ((int)(Math.random() * 2) == 0)
			return "L";
		else
			return "R";
	}

	/** print displays the elements the list n elements per row */
	public static void print(String[] list, int n) {
		System.out.println();
		for (int i = 0; i < list.length; i++)
			System.out.print(((i + 1) % n == 0) ? list[i] + "\n" : list[i]);
	}

	/** print overloaded displays a histogram of the data in a list */
	public static void print(int[] list) {
		int max = max(list);

		while (max > 0) {
			System.out.println();
			for (int i = 0; i < list.length; i++) {
				if (list[i] >= max) {
					System.out.print("O");
				}
				else
					System.out.print(" ");
			}
			max--;
		}
		System.out.println();
	}

	/** max returns the largest integer in a list */
	public static int max(int[] list) {
		int max = list[0];

		for (int i = 1; i < list.length; i++) {
			if (list[i] > max)
				max = list[i];
		}
		return max;
	}
}
