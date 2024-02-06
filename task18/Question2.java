package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  // Launches the browser
		
		driver.get("https://jqueryui.com/droppable/");  // loads the Url
		
		driver.manage().window().maximize();  // Maximizes the browser window
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));  // Target element is available inside iframe, so locating the frame and storing it in webelement variable 
		
		driver.switchTo().frame(frame); // Switching to frame using webelement variable
		
		WebElement source = driver.findElement(By.id("draggable")); // Locating the source element and storing in variable
		
		WebElement destination = driver.findElement(By.id("droppable")); // Locating the destination element and storing in variable
		
		String colorbeforedrag = destination.getCssValue("background-color");  // Getting the background color of the destination element
		
		String textbeforedrag = destination.getText();  // Getting the text of the destination element
		
		System.out.println("Before Drag");
		System.out.println("Background color is : " + colorbeforedrag);  // Printing the element details before drag
		System.out.println("Text is : " + textbeforedrag);
		
		Actions mouse = new Actions(driver);  // Initializing the Actions class
		
		mouse.dragAndDrop(source, destination).perform();  // Performing the drag and drop action using action class
		 
		String colorafterdrag = destination.getCssValue("background-color");  // Getting the background color of the destination element
		
		String textafterdrag = destination.getText();  // Getting the text of the destination element
		
		System.out.println();
		System.out.println("After Drag");
		System.out.println("Background color is : " + colorafterdrag);  // Printing the element details after drag
		System.out.println("Text is : " + textafterdrag);
		System.out.println();
		
		if(colorafterdrag != colorbeforedrag && textafterdrag != textbeforedrag) {  // checking whether the drag operation is successful by comparing the background color &  text before and after drag operation
			System.out.println("!!! Drag and drop operation is successful !!!");
		}
		
		
	}

}
