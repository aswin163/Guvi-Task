package task21;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();  // Launching the web browser
		
		driver.get("https://the-internet.herokuapp.com/windows");  // Loading the url
		   
		driver.manage().window().maximize(); // Maximizing the browser window
		
		String parentwindow = driver.getWindowHandle(); // Original Window. Getting the ID of the window
		System.out.println("Original window ID : " + parentwindow); // Printing the ID of the original window
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click(); // Locating and clicking the 'click here' button to open the new window
		
		Set<String> windowhandles = driver.getWindowHandles(); // Getting the available window handles as set
		List<String> tabs = new ArrayList<String>(windowhandles); // converting the set to array list
		
		driver.switchTo().window(tabs.get(1)); // Switching to the new window using the window index
		
		String title = driver.getTitle(); // Getting the tile of the new window
		
		if(title.equals("New Window")) {
			System.out.println("New tab is present in the browser"); // To verify whether the new window is opened by comparing the title of the new window
		}
		
		String childwindow = driver.getWindowHandle();
		System.out.println("New window ID : " + childwindow); // Getting and printing the window ID of the new window
		
		Thread.sleep(3000); // Operation happens too quick, so using thread.sleep to check the new window
		
		driver.close(); // this closes only the newly opened window
		 
		driver.switchTo().window(tabs.get(0)); // switching back to the original window using index
		 
		String currentwindow = driver.getWindowHandle();
		System.out.println("Current window ID : " + currentwindow); // Getting and printing the window ID of the current window
		
		if(currentwindow.equals(parentwindow)) {
			System.out.println("!!!Original window is present!!!"); // Comparing the current window ID with the parent window ID to verify that parent window is present 
		}
	}

}
