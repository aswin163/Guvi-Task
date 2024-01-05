package task8;

import java.util.Scanner;

//Q6. Program to print the factorial of the given number
public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n = sc.nextInt();
		int fact = 1;
		int i = 1;
		while(i <= n) {
			fact = fact*i;
			i++;
				}
		System.out.println("Factorial of " +n+ " is " +fact);
	
	}

}
