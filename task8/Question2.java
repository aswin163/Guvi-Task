package task8;
//Q2. Program to find whether number is even number of not
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("Entered value is a even number");
		}else {
			System.out.println("Entered value is not a even number");
		}
				

	}

}
