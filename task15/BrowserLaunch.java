package task15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;   // importing the selenium and webdriver packages
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// To open Chrome browser and launch the google url and search for something
		
		ChromeDriver driver = new ChromeDriver(); // Setup the driver and launch the browser
		
		driver.get("https://www.google.com/"); //  Load the url
		
		driver.manage().window().maximize(); // Maximizing the window
		
		driver.findElement(By.name("q")).sendKeys("Selenium Browser Driver", Keys.ENTER);  // It finds the search bar using the name, enter the value provided and click Search button
		
		//driver.close();
	}

}

