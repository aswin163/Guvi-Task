package task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();  // Launching the browser
		
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Maximizing browser window
		driver.manage().window().maximize();
		
		// Passing the url
		driver.get("https://www.demoblaze.com/");
		
		// Locating the element
		driver.findElement(By.linkText("Laptops")).click();
		
		// Adding sleep
		Thread.sleep(3000);
		
		// Locating the element
		driver.findElement(By.partialLinkText("i5")).click();
		
		// Locating the element		
		driver.findElement(By.linkText("Add to cart")).click();
		
		System.out.println("Product added to cart successfully");
		

	}

}
