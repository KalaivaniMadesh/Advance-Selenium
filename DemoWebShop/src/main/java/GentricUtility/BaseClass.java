package GentricUtility;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import PomScript.LoginPage;
import PomScript.WelcomePage;

public class BaseClass extends WebdriverUtility{
	@BeforeSuite
	public void connectServer() {
		Reporter.log("Connection to Server", true);
	}
	@BeforeTest
	public void connectDB() {
		Reporter.log("Connection to DB", true);
	}
	@BeforeClass
	public void openBrowser() throws IOException {
		driver = new FirefoxDriver();
		maximize();
		implicitWait();
		String url = PropertyFileUtility.propertyData("url");
		
		//We can pass the url in run time also with the help of maven command like..,
//		String URL= System.getProperty("URL");
//		driver.get(URL);
		getUrl(url);
		Reporter.log("Opened the Browser", true);
	}
	@BeforeMethod()
	public void toLogin() throws IOException {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLogLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(PropertyFileUtility.propertyData("email"));
		lp.getPasswordTextField().sendKeys(PropertyFileUtility.propertyData("password"));
		lp.getLoginButton().click();
		
	}
	@AfterMethod
	public void toLogout() {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLogoutlink().click();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Closed the browser", true);
	}
	@AfterTest
	public void disConnectDB() {
		Reporter.log("Disconnection to DB", true);
	}
	@AfterSuite
	public void disConnectServer() {
		Reporter.log("Disconnection to Server", true);
	}

}
