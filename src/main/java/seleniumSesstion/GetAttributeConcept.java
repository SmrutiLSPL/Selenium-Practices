package seleniumSesstion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By forgotpass= By.linkText("Forgotten Password");
		By firstname= By.id("input-firstname");
		By logoImg= By.className("img-responsive");
		
//		String forgotpass_href =driver.findElement(forgotpass).getAttribute("href");
//		System.out.println(forgotpass_href);
//		
//		String firstname_placeholder =driver.findElement(firstname).getAttribute("placeholder");
//		System.out.println(firstname_placeholder);
//		
//		
//		WebElement logo_Image =driver.findElement(logoImg);
//		String srcVal= logo_Image .getAttribute("src");
//		String titleVal= logo_Image .getAttribute("title");
//		String altVal= logo_Image .getAttribute("alt");
//		System.out.println(srcVal);
//		System.out.println(titleVal);
//		System.out.println(altVal);
//		
		
		String srcVal= getElementAttribute(logoImg,"src");
		String titleVal=getElementAttribute(logoImg,"title");
		String altVal= getElementAttribute(logoImg,"alt");
		String firstname_placeholder =getElementAttribute(firstname,"placeholder");
		String forgotpass_href = getElementAttribute(forgotpass,"href");
		
		
		System.out.println(srcVal);
		System.out.println(titleVal);
		System.out.println(altVal);
		System.out.println(firstname_placeholder);
		System.out.println(forgotpass_href);
	}
	
	
	public static String  getElementAttribute(By locator,String attrName)
	{
		return getElement(locator).getAttribute(attrName);
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

}
