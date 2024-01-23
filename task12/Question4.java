// Program to convert list to array

import java.util.LinkedList; // Importing List class
import java.util.List;

public class Question4 {	
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>(); // Creating a emply list
		
		list.add("Welcome"); // Adding elements to the list
		list.add("To");
		list.add("Guvi");
		
		System.out.println("Printing the list : ");
		System.out.println(list);                       // Printing the list
		System.out.println();
		
		String[] arr = list.toArray((new String[0]));  // Converting the list to array using toArray method
		System.out.println("After Converting to Array");
		
		for(String x : arr) {  // Using for each to print the array
			
			System.out.print(x + " ");
		}
	}

}
