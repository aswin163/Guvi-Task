package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();  // Launching the browser
		
		driver.navigate().to("https://www.wikipedia.org");  // Passing the url
		
		driver.manage().window().maximize(); // Maximizing the window
		
		driver.findElement(By.name("search")).sendKeys("Artificial Intelligence"); // Searching for Artificial Intelligence
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click(); //Clicking the search button
		
		driver.findElement(By.id("toc-History")).click(); // Clicking history button
		
		String text = driver.findElement(By.xpath("//a[@title=\"History of artificial intelligence\"]")).getText();  // Getting the title of the section and storing it in a variable
		System.out.println("Title of the section is :");
		System.out.println(text);  // Printing the title of the section
		
	}

}
