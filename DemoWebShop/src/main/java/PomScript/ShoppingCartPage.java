package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}
	
//	@FindBy(xpath = "//input[@type='checkbox' and @name = 'termsofservice']")
//	private WebElement termsandcondCheckbox;
	@FindBy(id = "termsofservice")
	private WebElement termsandcondCheckbox;

	@FindBy(id = "checkout")
	private WebElement checkoutButton;


	public WebElement getTermsandcondCheckbox() {
		return termsandcondCheckbox;
	}


	public WebElement getCheckoutButton() {
		return checkoutButton;
	}

}
