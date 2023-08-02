package seleniumSesstion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {
static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By RegisterHeader= By.tagName("h1");
		By forgotpass= By.linkText("Forgotten Password");

//		System.out.println(doElementGetText(RegisterHeader));
//		System.out.println(doElementGetText(forgotpass));
		
		if(checkElementIsDisplayed(RegisterHeader))
		{
			System.out.println("RegisterHeader is Displayed");
			
			String regHeader=doElementGetText(RegisterHeader);
			if(regHeader.equals("Register Account"))
			{
				System.out.println("Register Account -- PASS");
			}
			else
			{
				System.out.println("Register Account -- Fail");
			}
			
		}
		
	}

	public static boolean checkElementIsDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
	
	public static String doElementGetText(By locator)
	{
		String eleText=getElement(locator).getText();
		System.out.println("Element text is  : "+eleText);
		return eleText;
	}
	public static WebElement getElement(By locator)
	{
		WebElement element=null;
		try {
			element=driver.findElement(locator);

		}
		catch(Exception e)
		{
			System.out.println("getting element exception ... Please check your locator again");
			e.printStackTrace();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e1)
			{
				e1.printStackTrace();
			}
			
			element=driver.findElement(locator);
		}
		
		return element;
	}
	
}
