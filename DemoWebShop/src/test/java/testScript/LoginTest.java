package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GentricUtility.BaseClass;
import GentricUtility.ReadExcelUtility;
import PomScript.LoginPage;
import PomScript.WelcomePage;

public class LoginTest extends BaseClass{
	WelcomePage wp;
	LoginPage lp;
	@Test(dataProvider = "Credential")
	public void testCase01(String email, String password) {
		wp = new WelcomePage(driver);
		wp.getLogoutlink().click();
		wp.getLogLink().click();
		lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys(email);
		lp.getPasswordTextField().sendKeys(password);
		lp.getLoginButton().click();
		Reporter.log("Logged in Successfully", true);
	}
	
	@DataProvider(name = "Credential")
	public Object[][] loginData() throws EncryptedDocumentException, IOException {
		return ReadExcelUtility.fetchAllData("Sheet2");
	}
}
