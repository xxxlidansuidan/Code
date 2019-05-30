/*
(Occurrence of max numbers) Write a program that reads integers, finds the largest
of them, and counts its occurrences. Assume that the input ends with number
0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
is 5 and the occurrence count for 5 is 4.
(Hint: Maintain two variables, max and count. max stores the current max number,
and count stores its occurrences. Initially, assign the first number to max
and 1 to count. Compare each subsequent number with max. If the number is
greater than max, assign it to max and reset count to 1. If the number is equal to
max, increment count by 1.)
*/

import java.util.Scanner;
class Code {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int num;        // hold future number
                int count = 1;  // Assign 1 to count
                int max = input.nextInt(); // Assign the first number to max 
                do {
                        num = input.nextInt();
                        if (max < num) {
                                max = num;
                                count = 1;
                        } 
                        if (max == num)
                                count++;
                } while (num != 0);
                System.out.println("Max: " + max + " occur : " + count + " time's");
        }
}
