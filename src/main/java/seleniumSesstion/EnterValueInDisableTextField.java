package seleniumSesstion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterValueInDisableTextField {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		driver.findElement(By.id("pass")).getAttribute("disabled");

	}

	public static boolean checkElementIsDisable(By locator) {
		String disabledvalue = getElement(locator).getAttribute("disabled");
		if (disabledvalue.equals("true")) {
			return true;
		}
		return false;
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(null);
	}

}
