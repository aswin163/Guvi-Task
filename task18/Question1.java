package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  // Launching the browser
		
		driver.get("https://www.facebook.com/");  // loading the url
		
		driver.manage().window().maximize(); // maximizing the browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Adding implicit wait
		
		String title = "Facebook – log in or sign up";  // setting the Title of the web site
		 
		String actualtitle = driver.getTitle(); // Getting the tile of the web site using getTitle method
		 
		if(title.equals(actualtitle)) {  // verifying the web page loaded successfully by comparing the title
		
		System.out.println("Website redirected to FaceBook homepage successfully");
		}
		
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();  //Locating and clicking Create New Account button
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aswin"); // Locating First Name field and passing the value
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar"); // Locating Last Name field and passing the value
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("aswinkumarr64@gmail.com"); // Locating the email address field passing the value
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("aswinkumarr64@gmail.com"); // Reconfirming the email address
		 
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Daredevil@16"); // Locating password field and passing the value
		 
		WebElement day = driver.findElement(By.name("birthday_day")); 
		WebElement month = driver.findElement(By.name("birthday_month"));  // Birthday fileds are available under Select tag, so getting the tags and storing in webelement variables
		WebElement year = driver.findElement(By.name("birthday_year"));  
		
		Select selday = new Select(day);
		Select selmonth = new Select(month);  // Initializing Select class for day, month and year 
		Select selyear = new Select(year);
		
		selday.selectByVisibleText("11");
		selmonth.selectByVisibleText("May"); // Selecting the day, month and year using Select class
		selyear.selectByVisibleText("1985"); 
		
		driver.findElement(By.xpath("//label[text()='Male']")).click(); // Locating and clicking Male button
		
		driver.findElement(By.name("websubmit")).click();  // Clicking the submit button after entering all the details
		

	}

}
