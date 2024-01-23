import java.util.ArrayList;

// Program to create a ArrayList and to remove the elements inside the list
import java.util.List; // importing the list class

public class Question2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // Declaring the ArrayList
		list.add("Aswin");
		list.add("Kumar");				// Adding elements to the list
		list.add("Guvi");
		list.add("Automation");
		list.add("Java");
		
		System.out.println("Before removing");

		System.out.println(list);   // printing the list with elements 
		
		System.out.println("After Removing");
		
		list.clear();   // It clears all elements inside the list
		
		System.out.println(list); // Printing the list after removing
  
	}

}
