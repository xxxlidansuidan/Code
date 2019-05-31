/*
(Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings.
*/

import java.util.Scanner;
class Code {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String s1 = input.nextLine();
                String s2 = input.nextLine();
                int lol = 0;
                int index = (s1.length() < s2.length()) ? s1.length() : s2.length();
                for (int i = 0; i < index; i++) {
                        if (s1.charAt(i) == s2.charAt(i))
                                lol++;
                        else 
                                break;
                }
                if (lol > 0)
                for (int i = 0; i < lol; i++)
                        System.out.print(s1.charAt(i));
                else
                        System.out.println("No Match");
        }
}
