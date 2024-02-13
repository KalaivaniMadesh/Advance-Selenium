package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindAll({@FindBy(id = "Email"),@FindBy(name = "Email")})
	//We can use @FindAll annotation also..its work like OR operator
	private WebElement emailTextField;
	
	@FindBy(name = "Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Business Logic
	public void loginFunction() {
		emailTextField.sendKeys("Peterrr24@gmail.com");
		passwordTextField.sendKeys("Peter@123");
		loginButton.click();
	}

}
