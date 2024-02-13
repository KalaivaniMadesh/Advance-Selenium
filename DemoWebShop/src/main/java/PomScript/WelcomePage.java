package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage{
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Register")
	private WebElement reglink;

	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcartlink;
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistlink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy(xpath = "//div[@class='header-links']/child::ul/child::li/child::a[@class='account']")
	private WebElement regieteredMailLink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitaldownloadsLink;
	//Getters
	public WebElement getRegLink() {
		return reglink;
	}
	public WebElement getLogLink() {
		return loginlink;
	}
	public WebElement getShopLink() {
		return shoppingcartlink;
	}
	public WebElement getWishlistLink() {
		return wishlistlink;
	}
	public WebElement getLogoutlink() {
		return logoutlink;
	}
	public WebElement getRegisteredMailLink() {
		return regieteredMailLink;
	}
	public WebElement getDigitaldownloadsLink() {
		return digitaldownloadsLink;
	}
	
	
}
