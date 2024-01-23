package com.example.hrtest; // Second package
  
import com.example.hr.Employee;  // Importing first package
  
public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee obj = new Employee();  // Instantiating or creating object for class that is present in another package
		
		obj.printID(12345);  // calling the methods available inside the Employee class of another package and passing values as arguments
		obj.printName("Aswin Kumar Ravichandran");
		obj.printSalary(25000);	
		
	}

}
