package pages;
// Class for login page
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectBase;

public class LoginPage extends ProjectBase {
	
	@FindBy(id = "loginusername")  // Locating the username filed using @FindBy annotation and storing it in webelement
	WebElement usernameField;
	
	@FindBy(id = "loginpassword")  // Locating the password filed using @FindBy annotation and storing it in webelement
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@onclick='logIn()']")   // Locating the Login button using @FindBy annotation and storing it in webelement
	WebElement loginbutton;
	
	@FindBy(id = "nameofuser")  // Once login is successful, it will display "Welcome 'email-id' in top of the page where login button was present, locating that element for assertion purpose
	WebElement verify;
	
	public LoginPage(WebDriver driver) {  // Constructor, getting the driver as argument from testcase
		this.driver = driver;
		PageFactory.initElements(driver, this);  // Initializing the webelements using pagefactory
	}
	
	public LoginPage email(String email) {  // Method to enter email address
		sendkeys(usernameField, email);    // calling the sendkeys method in utility class and Passing the webelement and email address
		return this;
	}
	
	public LoginPage password(String password) {  // Method to enter password
		sendkeys(passwordField, password);  //calling the sendkeys method in utility class and Passing the webelement and password
		return this;
	}
	
	public LoginPage submit(String email) throws InterruptedException {  // Method to click login button
		click(loginbutton);   // Calling the click method in utility class and passing the  webelement as arugement
		Thread.sleep(3000);
		
		String actual = verify.getText();   // Getting the text present in the webelement
		String expected = "Welcome "+email;
		Assert.assertEquals(actual, expected);  // Comparing the expected and actual result, it will return true if both matches, else it will return false
		
		return this;
	}

}
