package task9;
//Q7. Program to find largest number among 3 numbers

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num :");
		int a = sc.nextInt();
		System.out.println("Enter 2nd num :");
		int b = sc.nextInt();
		System.out.println("Enter 3rd num :");
		int c = sc.nextInt();
		int Largest;
		Largest = Math.max(Math.max(a,b),c);
		System.out.println("The largest number is : " +Largest);
		
	}

}
