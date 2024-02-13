package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GentricUtility.BaseClass;
import GentricUtility.JavaScriptUtility;
import GentricUtility.ReadExcelUtility;
import PomScript.CheckOutPage;
import PomScript.DigitalDownloadsPage;
import PomScript.LoginPage;
import PomScript.ShoppingCartPage;
import PomScript.WelcomePage;

public class ShoppingCartTest extends BaseClass{
	WelcomePage wp;
	@Test
	public void testCase01() throws InterruptedException {
		wp = new WelcomePage(driver);
		wp.getDigitaldownloadsLink().click();
		DigitalDownloadsPage dp = new DigitalDownloadsPage(driver);
		dp.getProduct1Link().click();
		Thread.sleep(7000);
		wp.getShopLink().click();
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.getTermsandcondCheckbox().click();
		sp.getCheckoutButton().click();
		

		CheckOutPage cp = new CheckOutPage(driver);
//		cp.getFirstnameTextField().clear();
//		cp.getLastnameTextField().clear();
//		cp.getEmailTextField().clear();
//		cp.getFirstnameTextField().sendKeys("Peter");
//		cp.getLastnameTextField().sendKeys("P");
//		cp.getEmailTextField().sendKeys("Petter4372102@gmail.com");
//		
//		Select s = new Select(cp.getCoutryDropDown());
//		s.selectByVisibleText("India");
//		cp.getCityTextField().sendKeys("Banglore");
//		cp.getAddress1TextField().sendKeys("Karnataka");
//		cp.getAddress2TextField().sendKeys("Karnataka");
//		cp.getPincodeTextField().sendKeys("560005");
//		cp.getPhoneNumberTextField().sendKeys("1234567890");
		
		cp.getContinueButton1().click();
		
		JavaScriptUtility.scrollBy(0, 200);
		
		Reporter.log("Navigated to Shipping Address", true);
//		cp.getPickupCheckbox().click();
//		cp.getContinueButton2().click();
		
		cp.getPaymentRadioButton().click();
		cp.getContinueButton2().click();
		
		JavaScriptUtility.scrollBy(0, 70);
		Thread.sleep(4000);
		
		cp.getContinueButton3().click();
		//To order
		JavaScriptUtility.scrollBy(0, 120);
		Thread.sleep(4000);
		
		cp.getConfirmButton().click();
		Thread.sleep(7000);
		Reporter.log("Product got ordered Successfully", true);
	}
}
	