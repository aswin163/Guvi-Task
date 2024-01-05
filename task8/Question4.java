package task8;
//Q4. Program to Swap to variables
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for A:");
		int A = sc.nextInt();
		System.out.println("Enter value for B:");
		int B = sc.nextInt();
		System.out.println("Before Swap:");
		System.out.println("A=" +A);
		System.out.println("B=" +B);
		
		int temp;
		temp = A;
		A = B;
		B = temp;
		System.out.println("After Swap:");
		System.out.println("A=" +A);
		System.out.println("B=" +B);
			
	}

}
