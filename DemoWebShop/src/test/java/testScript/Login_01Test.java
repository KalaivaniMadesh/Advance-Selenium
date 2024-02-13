package testScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GentricUtility.BaseClass;
import PomScript.LoginPage;
import PomScript.WelcomePage;

public class Login_01Test extends BaseClass{

	WelcomePage wp;
	LoginPage lp;
	@Test()
	public void testCase01() {
		wp = new WelcomePage(driver);
		wp.getLogoutlink().click();
		wp.getLogLink().click();
		lp = new LoginPage(driver);
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		lp.getEmailTextField().sendKeys(username);
		lp.getPasswordTextField().sendKeys(password);
		lp.getLoginButton().click();
		Reporter.log("Logged in Successfully", true);
		
		Reporter.log(username, true);
		Reporter.log(password, true);
	}
}
