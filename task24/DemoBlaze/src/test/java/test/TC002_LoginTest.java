package test;
// Testcase for login test
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectBase;
import pages.HomePage;

public class TC002_LoginTest extends ProjectBase {
	
	@BeforeTest  // It will run before the test starts   
	public void setup() {
		
		excelFile = "TestData";  // Providing the name of the excel file where data is present
		excelSheet = 1;   // Providing the sheet number inside the excel file where data is present
	}

	@Test(dataProvider = "ReadExcel")  // @Test from where the test begins and it reads data from the excel and passes it as argument to the method
	public void LoginTest(String email, String password) throws InterruptedException {  // receiving email and password from excel sheet as arguments from @DataProvider 
		
		HomePage obj = new HomePage(driver);   // Creating object from HomePage class and passing driver as argument
		obj.loginButton().email(email).password(password).submit(email);  // Calling the methods to perform test
	}

}
