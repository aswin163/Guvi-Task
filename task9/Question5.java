package task9;
//Q5. Anna University grading system
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Mark: ");
		int mark = sc.nextInt();
		
		if(mark == 100) {
			System.out.println("Your Grade is S");
		}if(mark < 100 && mark > 90) {
			System.out.println("Your Grade is A");
		}if(mark < 90 && mark > 80) {
			System.out.println("Your Grade is B");
		}if(mark < 80 && mark > 70) {
			System.out.println("Your Grade is C");
		}if(mark < 70 && mark > 60) {
			System.out.println("Your Grade is D");
		}if(mark < 60 && mark > 50) {
			System.out.println("Your Grade is E");
		}if(mark < 50) {
			System.out.println("Your Grade is F");
		}if(mark > 100 || mark == 0) {
			System.out.println("Invalid Input");
		}
		

	}

}
