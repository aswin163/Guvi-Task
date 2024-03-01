package utilities;
// Listener class
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectBase;

public class Listener extends ProjectBase implements ITestListener{
	
	ExtentReports extent = DemoBlazeExtentReport.getReport();  // Getting the report from Extent report class
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) { // Method that will run when the test starts
		test = extent.createTest(result.getMethod().getMethodName());  //This will create separate filed in report for each test run with the method name of the particular test
	}

	@Override
	public void onTestSuccess(ITestResult result) {  // This method will execute when the assertion of the testcase returns true
		test.log(Status.PASS, "Test Pass"); // This will log the status as pass in the report
		String filepath=null;
		try {  // Taking the screenshot of the result page, since it deals with file, surrounding it wit try catch
			filepath = getScreenshot("Test1");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(filepath,"TestPass");
	}

	@Override
	public void onTestFailure(ITestResult result) {  // This method will execute when the assertion of the testcase returns false
		test.fail(result.getThrowable());  // This will log the status as pass in the report and will also log the exception details
		String filepath=null;
		try {   // Taking the screenshot of the result page, since it deals with file, surrounding it wit try catch
			filepath = getScreenshot("Test");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(filepath,"TestFail");
	}

	@Override
	public void onFinish(ITestContext context) {  //this method will execute at the end of the test
		extent.flush();  // closing the extend report
	}
	
	

}
