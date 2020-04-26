package StepDefinition;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Listeners implements ITestListener {
	ExtentTest test;
	ExtentReports extent=ExtentReporterNG.extentReportGenerator();
	
	//Optional step if we need to run scenarios in Parallel
	//private static ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
		//extentTest.set(test);
	}


	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"Pass");
		//extentTest.get().log(Status.PASS,"Pass");
	}

	
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		//extentTest.get().fail(result.getThrowable());
	}

	
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
