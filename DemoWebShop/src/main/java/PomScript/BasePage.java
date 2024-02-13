package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Instead of write  PageFactory.initElements(driver, this); in all the page classes, we just create one Base
	//page in that create one constructor and wherever we want just call super(driver).. it will call the parent
	//class constructor -- reduce the number of times writing same thing.
}
