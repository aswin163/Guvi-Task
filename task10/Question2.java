package task10;
// Q2. Program for employee salary details and hike
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Employee obj = new Employee(); // Object created for the class
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID : "); // Getting inputs from the user
		int eid = sc.nextInt();
		
		System.out.println("Enter First Name : ");
		String fname = sc.nextLine();
		
		System.out.println("Enter Last Name : ");
		String lname = sc.nextLine();
		
		System.out.println("Enter Salary : ");
		int s = sc.nextInt();
		
		System.out.println("Enter hike % :");
		int h = sc.nextInt();
		
		
		obj.getID(eid); // Passing the input to method via Argument
		System.out.println("Employee ID : " + obj.getID(obj.EmpID));
		
		obj.getFirstName(fname); // Passing the input to method via Argument
		obj.getLastName(lname);
		System.out.println("Full Name : " + obj.getName()); // Printing the return value of the method
		obj.getSalary(s); // Passing the input to method via Argument
		System.out.println("Monthly salary : " + obj.Salary);
		System.out.println("Annual Salary is : " + obj.getAnnualSalary());
		obj.raiseSalary(h); // Passing the input to method via Argument
		System.out.println("Salary per month after Raise : " +obj.hiked);
	}

}

class Employee {
	
	int EmpID;        // declaration of instance variables
	String FirstName;
	String LastName;
	String Name;
	int Salary;
	int ctc;
	int raise;
	int hiked;
	String BasicDetails;
	
	public int getID(int i) { //Method to get employee ID from user and to store it to instance variable
		EmpID = i;
		return EmpID;
	}
	
	public void getFirstName(String f) { //Method to get first name from user and to store it to instance variable
		FirstName = f;
		
	}
	
	public void getLastName(String l) { //Method to get last name from user and to store it to instance variable
		LastName = l;
	}
	
	public String getName() { // Method to merge first name and last name
		Name = FirstName + LastName;
		return Name;
	}
	
	public void getSalary(int s1) { //Method to get Salary from user and to store it to instance variable
		Salary = s1;
	}
	
	public int getAnnualSalary() { //Method to calculate annual salary of the employee
		ctc = Salary*12;
		return ctc;
	}
	
	public int raiseSalary(int h1) { //Method to calculate the Salary raise 
		raise = (Salary*h1)/100;
		hiked = raise+Salary;
		return hiked;
		
	}
	
}
