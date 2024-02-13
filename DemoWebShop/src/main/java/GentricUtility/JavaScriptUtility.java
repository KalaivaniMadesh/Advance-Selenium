package GentricUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends WebdriverUtility{
	/**
	 * This method is used to scroll the webpage according to x and y axis
	 * @param x
	 * @param y
	 */
	public static void scrollBy(int x, int y) {
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	/**
	 * This method is used to the scroll the page until the element is visible
	 * @param b
	 */
	public static void scroll_IntoView(int index, boolean b, WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments["+index+"].scrollIntoView("+b+");, "+element+"");
	}
	/**
	 * This method is used to scroll the webpage from the resume point
	 * @param x
	 * @param y
	 */
	public static void scroll_To(int x, int y) {
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
	/**
	 * This method is used to click the disable element
	 */
	public static void clickDisable(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arugments[0].click();,"+element+"");
	}
}
