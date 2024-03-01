package pages;
// Class for signup page
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectBase;

public class SignUpPage extends ProjectBase {
	
	@FindBy(id = "sign-username")   // Locating the username filed using @FindBy annotation and storing it in webelement
	WebElement usernameField;  
	
	@FindBy(id = "sign-password")  // Locating the password filed using @FindBy annotation and storing it in webelement
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@onclick='register()']")  // Locating the sign up button using @FindBy annotation and storing it in webelement
	WebElement signupbutton;
	
	public SignUpPage(WebDriver driver) {  // Constructor, getting the driver as argument from testcase
		this.driver = driver;  
		PageFactory.initElements(driver, this);  // Initializing the webelements using pagefactory
	}
	
	public SignUpPage email(String email) {  //Method to enter email address
		sendkeys(usernameField, email);  //calling the sendkeys method in utility class and Passing the webelement and email address
		return this;
	}
	
	public SignUpPage password(String password) {  // Method to enter password
		sendkeys(passwordField, password);  //calling the sendkeys method in utility class and Passing the webelement and password
		return this;
	}
	
	public SignUpPage submit() throws InterruptedException {  // Method to click Sign up button
		click(signupbutton); // Calling the click method in utility class and passing the  webelement as arugement
		Thread.sleep(3000);		
		Alert alert = driver.switchTo().alert();  // An alert is displayed when sign up button is clicked, so switching to the alert
		
		String actual = alert.getText();  // Getting the text present in alert for verification 
		String expected = "Sign up successful.";
		Assert.assertEquals(actual, expected);  // Assertion, comparing the actual text and expected test. It will return true if both matches else will return false
		
		Thread.sleep(3000);
		alert.accept(); // Accepting the alert, clicking Ok in alert
		
		return this;
	}

}
