package seleniumSesstion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By firstName= By.id("input-firstname");
		//By lastName= By.id("input-lastname");
		
		
		doSendkey(firstName,"Smruti");
		//driver.findElement(firstName).sendKeys("Smruti");
		String value = doGetAttribute(firstName,"value");
		
	//	String value=driver.findElement(firstName).getAttribute("value");
		System.out.println(value);
		
		
	}
	public static String  doGetAttribute(By locator,String attrName)
	{
		return getElement(locator).getAttribute(attrName);
	}
	
	public static void doSendkey(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

}
