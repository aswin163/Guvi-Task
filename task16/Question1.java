package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();  // Launches the firefox browser
		
		driver.manage().window().maximize(); // Maximizes the browser window
		
		driver.navigate().to("http://google.com"); // Pass the url
		
		System.out.println("URL of the currentt page is : ");
		System.out.println(driver.getCurrentUrl());  // Prints the current url
		
		driver.navigate().refresh();  //Reload or refresh the web page
		
		driver.close(); // Closes the browser
		
		
	}

}
