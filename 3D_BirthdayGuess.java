/**
Listing 4.3, GuessBirthday.java, gives a program that guesses a birthday. The program can be
simplified by storing the numbers in five sets in a three-dimensional array and it prompts the
user for the answers using a loop, as given in Listing 8.6. The sample run of the program can
be the same as given in Listing 4.3.
**/
import java.util.Scanner;
class Code {
        public static void main(String[] args) {
                int day = 0;
                int answer;
                int[][][] dates =  
                        {{{ 1, 3, 5,7},
                        { 9, 11, 13,15},
                        {17, 19, 21,23},
                        {25, 27, 29,31}},
                        {{ 2, 3, 6,7},
                        {10, 11, 14,15},
                        {18, 19, 22,23},
                        {26, 27, 30,31}},
                        {{ 4, 5, 6,7},
                        {12, 13, 14,15},
                        {20, 21, 22,23},
                        {28, 29, 30,31}},
                        {{ 8, 9, 10,11},
                        {12, 13, 14,15},
                        {24, 25, 26,27},
                        {28, 29, 30,31}},
                        {{16, 17, 18,19},
                        {20, 21, 22,23},
                        {24, 25, 26,27},
                        {28, 29, 30,31}}};
                        
                Scanner input = new Scanner(System.in);
                
                for (int i = 0; i < 5; i++) {
                System.out.println("Is your birthday in Set" + (i + 1) + "?");
                for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++)
                System.out.printf("%4d", dates[i][j][k]);
                System.out.println();
                }
                System.out.print("\nEnter 0 for No and 1 for Yes: ");
                answer = input.nextInt();
                if (answer == 1)
                day += dates[i][0][0];
                }
              System.out.println("Your birthday is " + day);
        }
}
