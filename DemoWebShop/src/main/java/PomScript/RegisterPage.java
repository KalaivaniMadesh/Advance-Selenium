package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage{
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(name = "FirstName")
	private WebElement firstnameTextfield;
	
	@FindBy(name = "LastName")
	private WebElement lastnameTextfield;
	
	@FindBy(id = "Email")
	private WebElement emailTextfield;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	private WebElement confirmpwTextfield;
	
	@FindBy(name = "register-button")
	private WebElement registerButton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstnameTextfield() {
		return firstnameTextfield;
	}

	public WebElement getLastnameTextfield() {
		return lastnameTextfield;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getConfirmpwTextfield() {
		return confirmpwTextfield;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	//Business Logic
	public void registerFunction() {
		femaleRadioButton.click();
		firstnameTextfield.sendKeys("Spoorthi");
		lastnameTextfield.sendKeys("S");
		emailTextfield.sendKeys("Spoorthi459@gmail.com");
		passwordTextfield.sendKeys("Spoorthi@123");
		confirmpwTextfield.sendKeys("Spoorthi@123");
		registerButton.click();
	}
	
	
	
}
