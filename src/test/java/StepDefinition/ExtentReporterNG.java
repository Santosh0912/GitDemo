	package StepDefinition;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		
		Date now = new Date();	
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MMMM_yyyy - hh-mm-ss aa");
		String FolderName = dateFormat.format(now);	        
		File dir = new File(".\\reports\\"+FolderName+"_PWC");
		
		
		String path=System.getProperty("user.dir")+dir+"\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Reports");
		
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester",System.getProperty("user.name"));
		extent.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		return extent;
	}

}
