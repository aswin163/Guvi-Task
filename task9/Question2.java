package task9;
//Q2. Program to reverse a given string and print it
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String str = sc.nextLine();
		String rstr = "";
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			rstr=ch+rstr;
				}
		System.out.println("Reversed Word: " +rstr);

	}
}

