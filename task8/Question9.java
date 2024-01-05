package task8;

import java.util.Scanner;

//Q9. Program to check whether the person is senior citizen or not
public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age:");
		int age = sc.nextInt();
		if(age >= 65) {
			System.out.println("This person is a senior citizen");
		}else {
			System.out.println("This person is not a senior citizen");
		}

	}

}
