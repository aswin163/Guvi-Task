package utilities;
//Class for extent report
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DemoBlazeExtentReport {
	
	public static ExtentReports getReport() {
		String path = "E:\\JAT-Guvi\\DemoBlaze\\Report\\DemoBlazeReport.html";   // Setting the path for the report file
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); //Initializing the reporter
		reporter.config().setReportName("DemoBlaze Report");  // Setting the name/Title for the report
		
		//Add automation data to physical report
		ExtentReports extent = new ExtentReports();  // Initializing the extent report
		extent.attachReporter(reporter);  // Attaching the report to the created file
		return extent;
	}

}
