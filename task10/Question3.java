package task10;

import java.util.Scanner;

//Q3. Program to calculate circumference of a circle using constructors

class Circle {
	int radius;  // Instance variables
	double pi;
	double circum1;
	
	public Circle(int r, double p) {  //Constructor with 2 arguments
		radius = r;  // storing the values from arguments into instance variables
		pi = p;
	}
	
	public double circum() { // Method to calculate the circumference
		circum1 = pi*2*radius;
		return circum1;
		
	}
}

public class Question3 {

	public static void main(String[] args) {
		
		//Getting radius as input from user
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the radius of the circle : ");
		int rad = sc.nextInt();;
		
		Circle obj1 = new Circle(rad, 3.14); // Passing the values to constructor via arguments
		obj1.circum(); // Calling the function using the object
		System.out.println("Circumference is :" + obj1.circum1); // Printing the result
	}

}
