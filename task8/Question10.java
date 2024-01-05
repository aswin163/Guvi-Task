package task8;

import java.util.Scanner;

//Program to count number of digits in an integer
public class Question10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number with multiple digits" );
		int n = sc.nextInt();
		int count = 0;
		while(n !=0) {
			n = n/10;
			count++;
		}
		System.out.println("Number of digits in the entered number are " +count);

	}

}
