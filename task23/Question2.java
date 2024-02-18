package task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question2 {

	public static void main(String[] args) throws SQLException {
		
		String db_url = "jdbc:mysql://localhost:3306/employee";  // URL to the database
		String username = "root"; // username
		String password = "root"; //password
		
		Connection connection = DriverManager.getConnection(db_url, username, password); // Establishes the connected between java and Database
		
		Statement stmt = connection.createStatement(); // to create statements in database
		
		String create = "create table empl1 ( empcode int, empname varchar(25), empage int, esalary int)";  // Query to create table and  storing it as string
		stmt.execute(create); // executing the query stored in create which creates the table in the current database 
		
		// Inserting the data into the created table using insert into query
		String insert = "insert into empl1 values (101,'Jenny',25,10000),(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,80000), (105,'Shameer',25,90000)";
		stmt.execute(insert);
		
		// Using the select query to view the data inside the table
		String select = "select * from empl1";
		ResultSet rs = stmt.executeQuery(select);
		
		// Since the table have multiple data, using while loop to iterate through the table and get the values, while loop will be executed as long as the next iteration returns no data
		while(rs.next()) { 
			System.out.println(rs.getInt("empcode") +" "+ rs.getString("empname") +" "+ rs.getInt("empage") +" "+ rs.getInt("esalary"));  // Printing the data in the table
		}
							
	}
}