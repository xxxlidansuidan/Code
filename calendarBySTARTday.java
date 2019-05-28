/*
(Display calendars) Write a program that prompts the user to enter the year and
first day of the year and displays the calendar table for the year on the console. For
example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
your program should display the calendar for each month in the year, as follows:
									January 2013
							Sun Mon Tue Wed Thu Fri Sat
							 			1   2   3   4   5
							 6   7   8   9  10  11  12
							13  14  15  16  17  18  19
							20  21  22  23  24  25  26
							27  28  29  30  31
*/
import java.util.Scanner;
class Code {
        public static void main(String... args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter Year: ");
                int year = input.nextInt();
                System.out.print("Enter First Day Of Year(e.g. 2==Tuesday): ");
                int days = input.nextInt();
                String output;
                for (int month = 0; month < 12; month++) {
                    String[] monthName = {"Jnuary ", "February ", "March ", "April ", "May ", "June ", "July ", "Augest ", "September ", "October ", "November ", "December "};
                    output = "" + monthName[month];
                    int lastDay = 0;
                    /** here for equal to array[] in monthName we decrrement each month num like now January is on array[0] index */
                    if (month == 0 || month == 2 || month == 4 || month == 6 ||month == 7 || month == 9 || month == 11) {
                            lastDay += 31; 
                    } else if (month == 1) {
                            if (year % 400 == 0 || (year % 4 == 0 && month % 100 != 0)) {
                                    lastDay += 29; 
                            } else 
                                    lastDay += 28; 
                    } else 
                            lastDay += 30; 
                    System.out.println("\t " + output + "" + year);
                    System.out.println("-----------------------------");
                    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
                    for (int i = 0; i < days; i++)
                            System.out.print("    ");
                    for (int i = 1; i <= lastDay; i++) {
                            if (i < 10) 
                                    System.out.print("   " + i); 
                            else
                                    System.out.print("  " + i); 
                            if ((i +  days) % 7 == 0)
                                    System.out.println();
                    }
                    System.out.println();
                    days = (days + lastDay) % 7;
        	}
    	}
}
