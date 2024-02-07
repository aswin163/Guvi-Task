package task19;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();   // Launching the browser
		 
		driver.get("https://www.guvi.in/register");  // loading the url
		
		driver.manage().window().maximize();  // Maximizing browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Adding implicit wait
		
		// 1. Locators for "Login Button"
		
		// Using Classname
//		 driver.findElement(By.className("login")).click();
		 
		// Using linktext
//		 driver.findElement(By.linkText("Login")).click();
		 
		 // Using Xpath
//		 driver.findElement(By.xpath("//a[@class='login']")).click();
		 
		// Using CSSSelector
//		 driver.findElement(By.cssSelector("a.login")).click();
		
		
		
		
		// 2. Locators for Full Name field
		
		// Using ID
		driver.findElement(By.id("name")).sendKeys("Test");
		
		// Using Xpath
//		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Test");
		
		// Using CSSSelector
//		driver.findElement(By.cssSelector("input#name")).sendKeys("Test");
		
		// Using tag name
		List<WebElement> ele = driver.findElements(By.tagName("input"));  // Creating a list of webelements, locating and getting all elements with tag name input and storing it in the list
//		
//		for(WebElement str : ele) {
//			
//			String attribute = str.getAttribute("id");
//			
//			if(attribute.equals("name")) {
//				str.sendKeys("Test");
//			}
//		}
		
		
		
		
		// 3. Locators for Email Address field
		
		// Using ID
//		driver.findElement(By.id("email")).sendKeys("Test@test.com");
		
		// Using Xpath
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Test@test.com");
		
		// Using CSSSelector
//		driver.findElement(By.cssSelector("input#email")).sendKeys("Test@test.com");
		
		// Using Tag name
//		for(WebElement str : ele) {
//			
//			String attribute = str.getAttribute("id");
//			
//			if(attribute.equals("email")) {
//				str.sendKeys("Test@test.com");
//			}
//		}
		
		
			
		
		// 4. Locators for Password field
		
		// Using ID
//		driver.findElement(By.id("password")).sendKeys("Test@123");
		
		// Using xpath
//		driver.findElement(By.xpath("//input[@class='form-control password-err']")).sendKeys("Test@123");
		
		//Using CSS Selector
		driver.findElement(By.cssSelector("input#password")).sendKeys("Test@123");
		
		// Using Tag name
//		for(WebElement str : ele) {
//			
//			String attribute = str.getAttribute("id");
//			
//			if(attribute.equals("password")) {
//				str.sendKeys("Test@123");
//			}
//		}
		
		
		
		
		
		// 5. Locators for Mobile number field
		
		// Using ID
//		driver.findElement(By.id("mobileNumber")).sendKeys("1234567890");
		
		//Using  xpath 
//		driver.findElement(By.xpath("//input[@class='form-control countrycode-left']")).sendKeys("1234567890");
		
		//Using CSS Selector
//		driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("1234567890");
		
		// Using tag name   
		for(WebElement str : ele) {  // Iterating using for each loop for all possible elements with tag input
			
			String attribute = str.getAttribute("id");  // Getting the attribute "id" insite the input tag
			
			if(attribute.equals("mobileNumber")) {  // Comparing the attribute to get to the desired field
				str.sendKeys("1234567890");
			}
		}
		
	}

}
