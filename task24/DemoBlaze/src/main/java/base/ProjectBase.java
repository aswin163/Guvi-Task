package base;
//Base class for the project
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utilities.Utility;

public class ProjectBase extends Utility {
	
	@Parameters({"browser","url"})  // Getting the browser and url as parameters from tesng xml file
	@BeforeMethod // BeforeMethod Annotation executes before @Test, so no need to call browser launch in each test case
	public void browserLaunch(String browser, String url) {
		launchBrowser(browser, url);	// Calling the method in utility class and passing browser and url as arguments
	}
	
	public void browserClose() {  //A common method to close the browser
		closeBrowser();	 //calling the method in utility package
	}
	
	@DataProvider(name = "ReadExcel")  // @Dataprovider annotation used to get data from excel sheet for data driven testing
	public String[][] getExcelData() throws IOException {
		String [][] data = readExcel(excelFile, excelSheet);  //Calling the read excel method in utility class and passing excelfile name and sheet numbers as arguments
		return data; // returning the  data taken from excel
	}

}

