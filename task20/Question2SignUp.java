package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question2SignUp {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();   // Launching the browser
		 
		driver.get("https://www.guvi.in/register");  // loading the url
		
		driver.manage().window().maximize();  // Maximizing browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Adding implicit wait
		
		driver.findElement(By.id("name")).sendKeys("Aswin Kumar"); //Locating fullname field and passing the value
		
		driver.findElement(By.id("email")).sendKeys("aswinkumar_r@outlook.com"); // locating the email address field and passing the value
		
		driver.findElement(By.id("password")).sendKeys("Daredevil@16"); // Locating the password field and passing the value
		
		driver.findElement(By.id("mobileNumber")).sendKeys("7010778832"); // Locating the mobile nummber field and passing the value
		
		driver.findElement(By.xpath("//a[@id='signup-btn']")).click(); // Clicking the sign up button
	}

}