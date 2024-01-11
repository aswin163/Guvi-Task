package task10;

import java.util.Scanner;

// Class with constructor and getter


class Person { // Class
	
	String name; // Instance variables
	int age;
	
	public Person(String a, int b) { // Constructor which gets the value for attributes and assign them at the time of object creation
		
		name = a; // Getting the value from constructor attributes and storing it in the instance variables
		age = b;
	}
	
	public void getN1() { //getter method which prints the value stored in the variables
		
		System.out.println("Name is : " +name); // Printing the values stored in the instance variables
		System.out.println("Age is : " +age);
	}
	
}
public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Initiation of scanner method
		
		System.out.println("Enter Name : ");
		String n = sc.nextLine();
		
		System.out.println("Enter Age : ");
		int age1 = sc.nextInt();
		
		Person obj = new Person(n, age1); // Creation of object for the class and passing the attributes to the constructor
		
		obj.getN1(); // Calling the getter method using object
		

	}

}
