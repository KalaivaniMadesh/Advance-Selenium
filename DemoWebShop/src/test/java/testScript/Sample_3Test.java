package testScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sample_3Test {

	@Test
	public void testCase() {
		ExtentSparkReporter esr = new ExtentSparkReporter("C:\\Selenium Class\\DemoWebShop\\ExtendReport\\report.html");
		
		ExtentReports er = new ExtentReports();
		
		er.attachReporter(esr);
		
		ExtentTest et = er.createTest("Sample_3Test");
		
		et.log(Status.INFO, "Test Case Successfully attached the report");
		
		er.flush();
		
       }
}
