package task9;

import java.util.Scanner;

//Q6. Program to calculate hotel tariff
public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the month :");
		int month = sc.nextInt();
		float rent = 1500.00f;
		System.out.println("Enter the number of days stayed :");
		int stay = sc.nextInt();
		double bill;
		float per = 0.20f;
		float hike = per*rent;
		
		switch(month) {
		
		case 1,2,3,7,8,9,10:
			bill = stay*rent;
		System.out.println("Your total Bill is: " +bill);
		break;
		
		case 4,5,6,11,12:
			bill=stay*(hike+rent);
		System.out.println("Your total Bill is: " +bill);
		break;
		
			
		}
	}

}
