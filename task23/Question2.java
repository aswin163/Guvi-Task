package task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question2 {

	public static void main(String[] args) throws SQLException {
		
		String db_url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "root";
		
		Connection connection = DriverManager.getConnection(db_url, username, password);
		
		Statement stmt = connection.createStatement();
		
		String create = "create table empl1 ( empcode int, empname varchar(25), empage int, esalary int)";
		stmt.execute(create);
		String insert = "insert into empl1 values (101,'Jenny',25,10000),(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,80000), (105,'Shameer',25,90000)";
		stmt.execute(insert);
		String select = "select * from empl1";
		ResultSet rs = stmt.executeQuery(select);
		
		while(rs.next()) {
			System.out.println(rs.getInt("empcode") +" "+ rs.getString("empname") +" "+ rs.getInt("empage") +" "+ rs.getInt("esalary"));
		}
							
	}
}