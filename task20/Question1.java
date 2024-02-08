package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//datepicker

public class Question1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  // Launches the browser
		
		driver.get("https://jqueryui.com/datepicker/");  // Loads the url
		
		driver.manage().window().maximize();  // Maximizes the browser window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Adding implicit wait
		  
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));  // Locating the frame and storing it in a web element
		
		driver.switchTo().frame(frame); // Switcing to the frame using web element
		
		driver.findElement(By.id("datepicker")).click(); // Locating and clicking the datepicket field
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Clicking the next month arrow
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr[4]//td[6]")).click(); // Locating and selecting the date from the table
		
		String date = driver.findElement(By.xpath("//a[@data-date='22']")).getText(); // Getting the date that is selected
		
		System.out.println("Date selected is : " + date); // Printing the date	
		
		driver.close();  // Closes the browser window

	}

}
