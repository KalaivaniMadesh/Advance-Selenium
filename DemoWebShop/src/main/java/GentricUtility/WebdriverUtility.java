package GentricUtility;

import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author kalai
 *
 */

public class WebdriverUtility {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select s;
	public static Actions a;
	public static JavascriptExecutor js;
	public static Properties p;
	
	/**
	 * This method is used to navigate to the application
	 * @param url
	 */
	public static void getUrl(String url) {
		driver.get(url);
	}
	/**
	 * This method is used to get the current url of the webpage
	 * @return
	 */
	public static String currentUrl() {
	return driver.getCurrentUrl();
	}
	/**
	 * This method is used to get the source code of the webpage
	 * @return
	 */
	public static String pageSource() {
		return driver.getPageSource();
	}
	/**
	 * This method is used to get title of the webpage
	 * @return
	 */
	public static String title() {
		return driver.getTitle();
	}
	/**
	 * This method is used to load the Webpage
	 */
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	/**
	 * This method is used to close the current window
	 */
	public static void closeWindow() {
		driver.close();
	}
	/**
	 * This method is used to close the all the windows opened by selenium
	 */
	public static void quitWindow() {
		driver.quit();
	}
	/**
	 * This method is used to get the current window id
	 * @return
	 */
	public static String currentWindow() {
		return driver.getWindowHandle();
	}
	/**
	 * This method is used to get the all the window id's which is opened by selenium
	 * @return
	 */
	public static Set<String> allWindow() {
		return driver.getWindowHandles();
	}
	/**
	 * This method is used to maximize the browser
	 */
	public static void maximize() {
		driver.manage().window().maximize();
	}
	/**
	 * This method is used to minimize the browser
	 */
	public static void minimize() {
		driver.manage().window().minimize();
	}
	/**
	 * This method is used to go forward 
	 */
	public static void forward() {
		driver.navigate().forward();
	}
	/**
	 * This method is used to go backward
	 */
	public static void back() {
		driver.navigate().back();
	}
	/**
	 * This method is used to refresh the webpage
	 */
	public static void refresh() {
		driver.navigate().refresh();
	}
	/**
	 * This method is used to navigate to the application
	 * @param url
	 */
	public static void toUrl(String url) {
		driver.navigate().to(url);
	}
	/**
	 * This method is used to wait until the element is visible
	 * @param element
	 */
	public static void explicitWait(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method is used to select the dropdown option by using index value
	 * @param index
	 * @param element
	 */
	public static void dropDown(int index, WebElement element) {
		s = new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * This method is used to select the dropdown option by using Visible text
	 * @param text
	 * @param element
	 */
	public static void dropDown(String text, WebElement element) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}
	/**
	 * This method is used to select the dropdown option by using attribute value 
	 * @param element
	 * @param value
	 */
	public static void dropDown(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}
	/**
	 * This method is used to move the cursor to the targeted webelement
	 * @param element
	 */
	public static void moveToElement(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * This method is used to perform click action on the targeted webelement
	 * @param element
	 */
	public static void clickElement(WebElement element) {
		a = new Actions(driver);
		a.click(element).perform();
	}
	/**
	 * This method is used to perform double click action on the targeted webelement
	 * @param element
	 */
	public static void doubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	/**
	 * This method is used to perform drag a the source element and place in to the destination point
	 * @param source
	 * @param target
	 */
	public static void dragandDrop(WebElement source, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	/**
	 * This method is used to perform right click action on the targeted webelement
	 * @param element
	 */
	public static void rightClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();
	}
	/**
	 * This method is used to perform click action anywhere in the webpage
	 */
	public static void click() {
		a = new Actions(driver);
		a.click().perform();
	}
	
}
