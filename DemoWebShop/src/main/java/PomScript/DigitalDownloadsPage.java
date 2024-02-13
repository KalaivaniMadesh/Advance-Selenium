package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalDownloadsPage extends BasePage{

	public DigitalDownloadsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='3rd Album']/../../..//input[@value='Add to cart']")
	private WebElement product1Link;
	
	@FindBy(xpath = "(//a[text()='Music 2'])[2]/../../..//input[@value='Add to cart']")
	private WebElement product2Link;
	
	@FindBy(xpath = "(//a[text()='Music 2'])[3]/../../..//input[@value='Add to cart']")
	private WebElement product3Link;

	public WebElement getProduct1Link() {
		return product1Link;
	}

	public WebElement getProduct2Link() {
		return product2Link;
	}

	public WebElement getProduct3Link() {
		return product3Link;
	}
	
}
