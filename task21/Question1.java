package task21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  // Launching the web browser
		
		driver.get("https://the-internet.herokuapp.com/iframe");  // Loading the url
		   
		driver.manage().window().maximize(); // Maximizing the browser window
		
		WebElement frame = driver.findElement(By.cssSelector("iframe#mce_0_ifr")); // Locating the iframe using css selector and storing it in a web element
		
		driver.switchTo().frame(frame); // Switching to the frame using the stored web element 
		
		WebElement element = driver.findElement(By.tagName("p")); // Locating the 'p' tag inside the frame and storing it in a web element
		
		element.clear(); // A default pre-text is available in the 'p' tag, clearing it to enter the data
		
		element.sendKeys("Hello People"); // Entering the data
		
		driver.close(); // Closing the browser window
		;
		
	}

}
