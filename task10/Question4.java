package task10;
// Q4. Program for bank account 
import java.util.Scanner;

class Account{ // Account class
	float balance;  // Declaring instance variables
	float deposit;
	float withdraw;
	
	public Account() { // Defining Default constructor and assigning a value to instance variable
		balance = 2500.00f;
	}
	
	public Account(float a, float b) { // Constructor with two parameters
		balance = 2500.00f;
		deposit = a; //getting values from parameters and storing in instance variables
		withdraw = b;
	}
	
	public void withdraw() { // Method to do withdraw
		balance = balance - withdraw;
		System.out.println("Balance aftet withdrawal is : " +balance);
		
	}
	
	public void deposit() { // Method to do deposit
		balance = balance + deposit;
		System.out.println("Balance after deposit : " +balance);
	}
}



public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account obj = new Account(); // Creating object for default constructor
		
		System.out.println("Current balance is : " +obj.balance);
		
		System.out.println("Enter deposit : "); // Getting input via scanner class
		float d = sc.nextFloat();
		
		System.out.println("Enter withdraw : ");
		float w = sc.nextFloat();
		
		Account obj1 = new Account(d,w); // Creating object for parameterized constructor and passing value for arguments
		
		// Calling the methods
		
		obj1.deposit();
		
		
		obj1.withdraw();
		
		

	}

}
