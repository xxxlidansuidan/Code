import java.util.Scanner;
class Code {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter How many student's : ");
		int num = sc.nextInt();
		int maxNum = 0, minNum = 0, secMinNum = 0, secMaxNum = 0;
		String maxName = "", minName = "", secMinName = "", secMaxName = "";
		for (int i = 0; i < num; i++) {
			System.out.print("Enter " + (i + 1) + " no. Studednt name : ");
			String name = sc.next();
			System.out.print("Enter " + (i + 1) + " no. Studednt Number : ");
			int number = sc.nextInt();
			if (i == 0) {
			//here 1st input holding on...
				maxNum = number;
				maxName = name;
			}
			else if (i == 1 && number > maxNum) {
				secMaxNum = maxNum; //here it's holding high score for next! if condition(True)
				maxNum = number; //high getting new one Becuz condition(True)
				secMaxName = maxName;	//now holding name;
			        maxName = name;	
			}
			else if (i == 1) {
				//if i == 1 && number !> maxnum, than lastOne is secHigh;
				secMaxNum = number;
				secMaxName = name;
			}
			else if (i > 1 && number > maxNum && number > secMaxNum) {
				//if i > 1, and highScore & 2ndHigh both are smaller, then change;
				secMaxNum = maxNum;
				maxNum = number;
				secMaxName = maxName;
				maxName = name;
			}
			else if (i > 1 && number > secMaxNum) {
				//if only 2ndHighScore is lower, then change it ;
				secMaxNum = number;
				secMaxName = name;		
			}
			else 
				;
			//Minimum......
			if (i == 0) {
				minNum = number;
				minName = name;
			}
			else if (i == 1 && number < minNum) {
				secMinNum = minNum;
				minNum = number;
				secMinName = minName;
			        minName = name;	
			}
			else if (i == 1) {
				secMinNum = number;
				secMinName = name;
			}
			else if (i > 1 && number < minNum && number < secMinNum) {
				secMinNum = minNum;
				secMinName = minName;
				minNum = number;
				minName = name;
			}
			else if (i > 1 && number < secMinNum) {
				secMinNum = number;
				secMinName = name;		
			}
			else
				;
		}
		System.out.println("Max is : " + maxName + "\t" + maxNum);
		System.out.println("Min is : " + minName + "\t" + minNum);
		System.out.println("2nd Maximum is : " + secMaxName + "\t" + secMaxNum);
		System.out.println("2nd Minimum is : " + secMinName + "\t" + secMinNum);
	}
}
