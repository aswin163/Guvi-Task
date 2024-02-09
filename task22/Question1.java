package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question1 {

	public static void main(String[] args) throws IOException {
		
		// Launches the web browser
		WebDriver driver = new ChromeDriver();
		
		// Loading the URL
		driver.get("https://phptravels.com/demo/");
		
		// Maximizing the browser window
		driver.manage().window().maximize();
		
		// Locating first name field and passing the value
		driver.findElement(By.name("first_name")).sendKeys("Aswin");
		
		// Locating last name field and passing the value
		driver.findElement(By.name("last_name")).sendKeys("Kumar");
		
		// Locating business name field and passing the value
		driver.findElement(By.name("business_name")).sendKeys("Guvi");
		
		// Locating email field and passing the value
		driver.findElement(By.name("email")).sendKeys("aswinkumar_r@outlook.com");
		
		// Page asks for a sum verification, so locating and getting the values of the elements
		// getText() returns string, hence storing the values as string
		String s1 = driver.findElement(By.id("numb1")).getText();
		String s2 = driver.findElement(By.id("numb2")).getText();
		
		// Since addition operation cannot be done on string, converting both to integer
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		
		// Performing the operation
		int add = num1+num2;
		
		// Result of the operation has to be sent to the website, since SendKeys sends String, converting the result to string
		String result = Integer.toString(add);
		
		// Passing the result
		driver.findElement(By.id("number")).sendKeys(result);
		
		// Clicking submit button
		driver.findElement(By.id("demo")).click();
		
		// After clicking submit, form gets submitted, a new page loads and a message appears
		WebElement message = driver.findElement(By.xpath("//h2[@class='text-center cw mt-3']"));
		
		// The message takes few seconds to load, so adding explicit wait to wait for the element to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(message));
		
		// Verifying whether form is submitted by taking the text from the page and comparing it
		if(message.getText().equals("Thank you!")) {
			System.out.println("Message displayed is : " + message.getText());
			System.out.println("Form submitted successfully");
		}
		
		
		// Taking screenshot of the result page
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\kumar\\eclipse-workspace\\SeleniumTasks\\src\\main\\java\\task22\\Q1OutputScreenshot.png");
		FileUtils.copyFile(source, dest);

	}

}
