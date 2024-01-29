package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  // Launching the browser
		
		driver.navigate().to("https://www.demoblaze.com"); // Passing the url
		
		driver.manage().window().maximize(); // Maximizing the window
		
		String title = driver.getTitle(); // Getting the title of the webpage
		
		if(title.equals("STORE")) { // comparing the title of the webpage to see if it is opened correctly
			System.out.println("Page landed on correct website");  // Printing the result
		}else {
			System.out.println("Page not landed on correct website");
		}

	}

}
