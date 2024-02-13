package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement firstnameTextField;
	
	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lastnameTextField;
	
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement emailTextField;
	
	@FindBy(id = "BillingNewAddress_Company")
	private WebElement companyTextField;
	
	@FindBy(xpath = "//select[@id ='BillingNewAddress_CountryId']")
	private WebElement coutryDropDown;
	
	@FindBy(xpath = "//select[@id ='BillingNewAddress_StateProvinceId']")
	private WebElement stateDropDown;
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTextField;
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement Address1TextField;
	
	@FindBy(id = "BillingNewAddress_Address2")
	private WebElement Address2TextField;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement pincodeTextField;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNumberTextField;
	
	@FindBy(id = "BillingNewAddress_FaxNumber")
	private WebElement faxNumberTextField;
	
	@FindBy(xpath = "(//input[@title='Continue'])[1]")
	private WebElement continueButton1;

	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getCoutryDropDown() {
		return coutryDropDown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getAddress1TextField() {
		return Address1TextField;
	}

	public WebElement getAddress2TextField() {
		return Address2TextField;
	}

	public WebElement getPincodeTextField() {
		return pincodeTextField;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getFaxNumberTextField() {
		return faxNumberTextField;
	}

	public WebElement getContinueButton1() {
		return continueButton1;
	}
	
	//Shipping Address
	@FindBy(id="shipping-address-select")
	private WebElement addressDropDown;
	
	
	@FindBy(xpath = "(//input[@value='Continue'])[2]")
	private WebElement continueButton2;

	public WebElement getAddressDropDown() {
		return addressDropDown;
	}

	public WebElement getContinueButton2() {
		return continueButton2;
	}
	
	//Payment Method
	@FindBy(xpath = "//label[text()='Check / Money Order (5.00)']")
	private WebElement paymentRadioButton;

	public WebElement getPaymentRadioButton() {
		return paymentRadioButton;
	}
	
	//payment information

	@FindBy(xpath = "(//input[@value='Continue'])[3]")
	private WebElement continueButton3;
	
	public WebElement getContinueButton3() {
		return continueButton3;
	}
	//confirm order
	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement confirmButton;
	
	public WebElement getConfirmButton() {
		return confirmButton;
	}
	
	
	
}
