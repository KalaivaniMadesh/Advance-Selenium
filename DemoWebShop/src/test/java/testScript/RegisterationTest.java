package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GentricUtility.BaseClass;
import GentricUtility.ReadExcelUtility;
import PomScript.RegisterPage;
import PomScript.WelcomePage;

public class RegisterationTest extends BaseClass{
	
	@Test(dataProvider = "Cred")
	public void testCase01(String fn, String ln, String email, String pw, String conPW) {
		WelcomePage wp = new WelcomePage(driver);
		wp.getLogoutlink().click();
		wp.getRegLink().click();
		RegisterPage rp = new RegisterPage(driver);
		rp.getFemaleRadioButton().click();
		rp.getFirstnameTextfield().sendKeys(fn);
		rp.getLastnameTextfield().sendKeys(ln);
		rp.getEmailTextfield().sendKeys(email);
		rp.getPasswordTextfield().sendKeys(pw);
		rp.getConfirmpwTextfield().sendKeys(conPW);
		rp.getRegisterButton().click();
		Reporter.log("Registered Successfully", true);
		}
	
	
	@DataProvider(name = "Cred")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		return ReadExcelUtility.fetchAllData("Sheet3");
	}	
}
