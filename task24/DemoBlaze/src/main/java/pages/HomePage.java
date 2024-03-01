package pages;
// Class for HomePage
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectBase;

public class HomePage extends ProjectBase {
	
	@FindBy(id = "signin2")  // Locating the sign up button
	WebElement signup;
	
	@FindBy(id = "login2")  // Locating the login button
	WebElement login;   
	
	public HomePage(WebDriver driver) {  // Constructor, getting driver as argument
		this.driver=driver;
		PageFactory.initElements(driver, this);  // Initializing the webelements using pagefactory
	}
	
	public SignUpPage signUpButton() {  // Methood to click signup button
		click(signup);  // Calling the click method in utility and passing the webelement as argument
		return new SignUpPage(driver);  // directing the execution to the signup page and passing driver as argument 
	}
	
	public LoginPage loginButton() {  // Methood to click signup button
		click(login);  // Calling the click method in utility and passing the webelement as argument
		return new LoginPage(driver);  // directing the execution to the signup page and passing driver as argument
	}

}
