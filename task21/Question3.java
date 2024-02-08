package task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		
		// Launches the web browser
		WebDriver driver = new ChromeDriver();  
		
		//Loads the url
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//maximizes the browser window
		driver.manage().window().maximize();
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Switching top frame
		WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(topframe);
		
		//Verifying the number(count) of frames inside top frame
		int frameCount = driver.findElements(By.tagName("frame")).size();
        System.out.println("Number of frames in top frame: " + frameCount);
		
        //Switching to left frame
		WebElement leftframe = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(leftframe);
		
		//Verifying the text present in the left frame
		WebElement lefttag = driver.findElement(By.tagName("body"));
		String lefframetext = lefttag.getText();
		System.out.println("Text present in left frame is : " + lefframetext);
		
		//Switching to top frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(topframe);
		
		//Switching to  middle frame
		WebElement middleframe = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(middleframe);
		
		//Verifying the text present in the middle frame
		WebElement middletag = driver.findElement(By.tagName("body"));
		String middleframetext = middletag.getText();
		System.out.println("Text present in middle frame is : " + middleframetext);
		
		//Switching to top frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(topframe);
		
		//Switching to right frame
		WebElement rightframe = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(rightframe);
		
		//Verifying the text present in the right frame
		WebElement righttag = driver.findElement(By.tagName("body"));
		String rightframetext = righttag.getText();
		System.out.println("Text present in right frame is : " + rightframetext);
		
		//Switching out of top frame
		driver.switchTo().defaultContent();
		
		//Switching to bottom frame
		WebElement bottomframe = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(bottomframe);
		
		//Verifying the text present in the right frame
		WebElement bottomtag = driver.findElement(By.tagName("body"));
		String bottomframetext = bottomtag.getText();
		System.out.println("Text present in bottom frame is : " + bottomframetext);
	
	}

}
