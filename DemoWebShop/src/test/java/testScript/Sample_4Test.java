package testScript;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sample_4Test {

	@Test
	public void testCase() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String ss_Image = driver.getScreenshotAs(OutputType.BASE64);
		
        ExtentSparkReporter esr = new ExtentSparkReporter("C:\\Selenium Class\\DemoWebShop\\ExtendReport\\report.html");
		
		ExtentReports er = new ExtentReports();
		
		er.attachReporter(esr);
		
		ExtentTest et = er.createTest("Sample_4Test");
		
		et.log(Status.INFO, "Test Case Successfully attached the report");
		
		et.addScreenCaptureFromBase64String(ss_Image);
		
		er.flush();
	}
}
