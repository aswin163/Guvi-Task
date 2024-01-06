package task9;

import java.util.Scanner;

//Q1. Program to check whether the given string is Palindrome or not
public class Question1 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter the word:");
		String str = sc.nextLine();
		String rstr = "";
		int length = str.length();
		
		for(int i=(length-1); i>=0; --i) {
			rstr = rstr + str.charAt(i);
		}if(str.equals(rstr)) {
			System.out.println("Given word is palindrome");
		}else {
			System.out.println("Given word is not a palindrome");
			
		}

	}
}

