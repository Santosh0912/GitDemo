package ExtentReports;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Test2 extends Base {
	WebDriver driver;
//	ExtentReports extent;
//	
//	@BeforeTest
//	public void config() {
//		String path=System.getProperty("user.dir")+"\\reports\\index.html";
//		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
//		reporter.config().setReportName("Web Automation Results");
//		reporter.config().setDocumentTitle("Test Results");
//		
//		
//		extent=new ExtentReports();
//		extent.attachReporter(reporter);
//		extent.setSystemInfo("Tester","Santhosh Reddy");
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	@Test	
	public void YahooDemo() {
		
		//extent.createTest("Initial Demo");
		
//		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
		driver=getdriver();
		
		driver.get("https://www.yahoo.com.au/");
		String Title=driver.getTitle();
		System.out.println("Title : "+Title);
		//extent.flush();
		driver.close();
	}

}
