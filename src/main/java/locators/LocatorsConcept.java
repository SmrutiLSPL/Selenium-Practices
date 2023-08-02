package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ElementUtil;

public class LocatorsConcept {

	static WebDriver driver ;
	
	
	public static void main(String[] args) {
	
		// Create a webelement + perform action(Click,sendkeys,gettext,isDisplayed )
		
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1.
		
//		driver.findElement(By.id("input-email")).sendKeys("Naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("123456789");
		
		//2. 
		
//		WebElement emailid=driver.findElement(By.id("input-email"));
//		WebElement password=driver.findElement(By.id("input-password"));
//		emailid.sendKeys("Naveen@gmail.com");
//		password.sendKeys("123456789");
		
//		//3.By Locator: 
		
//		By email_id =By.id("input-email");
//		By pass_id =By.id("input-password");
		
//		WebElement emailid=	driver.findElement(email_id);
//		WebElement password= driver.findElement(pass_id);
		
//		emailid.sendKeys("Naveen@gmail.com");
//		password.sendKeys("123456789");
		
		
		
		//4.By locator with web element generic method:
		
//		By email_id =By.id("input-email");
//		By pass_id =By.id("input-password");
//		getElement(email_id).sendKeys("Naveen@gmail.com");
//		getElement(pass_id).sendKeys("Naveen@123");
		
		//5. By locator with web element and action generic method:
//		
//		By email_id =By.id("input-email");
//		By pass_id =By.id("input-password");
//		
//		doSendKeys(email_id,"Naveen@gmail.com");
//		doSendKeys(pass_id,"Naveen@123");
		
		
		//6. By locator with web element and action generic method in a utility class
		
//		By email_id =By.id("input-email");
//		By pass_id =By.id("input-password");
//		
//		ElementUtil eleutil=new ElementUtil(driver);
//		
//		eleutil.doSendKeys(email_id, "Naveen@gmail.com");
//		eleutil.doSendKeys(pass_id, "Naveen@123");
		
		//7. By locator with web element and action generic method in a utility class with a test/called class with bruitl and eleutil
	}
	
	

	
	
}
