package com.example.hr; // Package

public class Employee { // Employee Class
	
	String name;  // Instance variable declaration
	int eid;
	double salary;
	
	public void printID(int eid) { // Method to print ID
		this.eid = eid;  // This keyword used to mention that the variable is the local variable 
		System.out.println("Employee ID : " +eid);
	}
	
	public void printName(String name) {  // Method to print Name
		this.name = name;
		System.out.println("Empployee Name : " +name);
	}
	
	public void printSalary(double salary) { // Method to print Salary
		this.salary = salary;
		System.out.println("Employee Salary : " +salary);
	}

}
