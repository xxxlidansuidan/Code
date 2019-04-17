/*(Financial application: compute future tuition) Suppose that the tuition for a uni-
versity is $10,000 this year and increases 6% every year. In one year, the tuition
will be $10,600. Write a program that computes the tuition in ten years and the total
cost of four years’ worth of tuition after the tenth year.*/
import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Present Tuition Fees : ");
		int presentFee = sc.nextInt();
		System.out.print("for how many Year : ");
		int year = sc.nextInt();
		System.out.print("Rent for 1 year in Percent(%) : ");
		int rentPerYear = sc.nextInt();
		double rent = (double)rentPerYear / 100.0;
		int totalCost = 0;
		int total = 0;
		for (int i = 1; i <= 14; i++) {
			presentFee += (presentFee * rent); 
			if (i > year)
				totalCost += presentFee;
			if (i == year)
				total = presentFee;
		}
		System.out.println("Tuition in " + year + " year is : " + total);
		System.out.println("Total cost for 4th year, Worth of Tuition is : " + totalCost);
	}
}
