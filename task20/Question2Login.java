package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2Login {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();   // Launching the browser
		 
		driver.get("https://www.guvi.in/");  // loading the url
		
		driver.manage().window().maximize();  // Maximizing browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Adding implicit wait
		
		driver.findElement(By.xpath("//a[@class='nav-link  text-primary text-center px-4']")).click(); // Clicking the login button
		
		String email = "aswinkumar_r@outlook.com"; // storing the email address in string for verification purpose
		
		driver.findElement(By.id("email")).sendKeys(email); // Locating the email address field and passing the email address
		 
		driver.findElement(By.id("password")).sendKeys("Daredevil@16"); // Locating the password field and passing the password
		
		driver.findElement(By.id("login-btn")).click(); // Clicking the login button
		
		driver.findElement(By.className("gravatar")).click(); // After logging in, clicking the my account button to verify whether it is logged in successfully
		
		String actualemail = driver.findElement(By.xpath("//small[@class='email-wrap text-secondary']")).getText(); // getting the email address present in the my account field and storing it in a string variable
		 
		if(actualemail.equals(email)) {
			System.out.println("Logged in successfully");  // Comparing both emails to verify that user is logged in successfully and printing it
		}
		
		driver.close();  // Closes the browser window

	}

}
