package task8;
//Q1. If statement
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a:");
		int a = sc.nextInt();
		System.out.println("Enter value for b:");
		int b = sc.nextInt();
		System.out.println("Enter value for c:");
		int c = sc.nextInt();
		System.out.println("Enter value for d:");
		int d = sc.nextInt();
		
		if(a+b > c+d) {
			System.out.println("Sum of a&b is greater that sum of c&d ");
		}

	}

}
