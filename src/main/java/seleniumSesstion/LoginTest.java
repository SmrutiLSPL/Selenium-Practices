package seleniumSesstion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.BrowserUtil;
import utils.ElementUtil;

public class LoginTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		BrowserUtil brutil=new BrowserUtil();
	    driver= brutil.launchBrowser("chrome");
		brutil.enterURl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(brutil.getPageTitle());

		By email_id =By.id("input-email");
		By pass_id =By.id("input-password");
		
//		//ElementUtil eleutil=new ElementUtil(driver);
//		eleutil.doSendKeys(email_id, "Naveen@gmail.com");
//		eleutil.doSendKeys(pass_id, "Naveen@123");
//		
		brutil.quitBrowser();
	}

	public static void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
}
