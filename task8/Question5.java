package task8;
//Q5. Program to check whether the number is prime or not
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= num/2; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count > 1) {
			System.out.println("This is not a prime number");
		}else {
			System.out.println("This is a prime nnumber");
		}

	}

}
