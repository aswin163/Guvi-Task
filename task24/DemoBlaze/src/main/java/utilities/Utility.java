package utilities;
//Utility class contains all common methods for the project 
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utility {
	
	public static WebDriver driver;  // Declaring the driver
	public String excelFile; // Declaring variable for Excelfile    
	public int excelSheet;  // Declaring variable for excelsheet number 
	
	
	public void launchBrowser(String browser, String url) {  // Method that launches the browser
		
		if(browser.equals("chrome")) {         
			driver = new ChromeDriver();
		}else if(browser.equals("edge")) {
			driver = new EdgeDriver();                // Launching the browser based on the browser value received from xml
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver();
		}
		driver.get(url);    // Loading the url
		driver.manage().window().maximize();   // Maximizing the browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Adding implicit wait
		
	}
	
	public void click(WebElement ele) {   // A common method to perform 'Click' action on a web element
		ele.click();
	}
	
	public void sendkeys(WebElement ele, String attributevalue) {   // A common method to perform sendkeys action on a web element
		ele.sendKeys(attributevalue);
	}
	
	public String[][] readExcel(String excelFile, int excelSheet) throws IOException {  // Method to read data from excel
		XSSFWorkbook book = new XSSFWorkbook("E:\\JAT-Guvi\\DemoBlaze\\src\\main\\resources\\"+excelFile+".xlsx");  // Excelfile name will be passed from Testcase as it may differ for each test case
		XSSFSheet sheet = book.getSheetAt(excelSheet); // Sheet number which needs to be read is also passed from testcase as it may differ for each test case
		 
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowcount][columncount];
		
		for(int i=1; i<=rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0; j<columncount; j++) {
				
				XSSFCell cell = row.getCell(j);
				
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		book.close();
		return data;
	}
	
		public String getScreenshot(String ssname) throws IOException {  // Method to take screenshot
		
		String path = "E:\\JAT-Guvi\\DemoBlaze\\Snap\\"+ssname+".png";  // Getting the screenshot name from Listener class as it differs for each test case
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(source, dest);
		
		return path;
	}

	
	public void closeBrowser() {  // Method to close the browser
		driver.close();
	}
}
