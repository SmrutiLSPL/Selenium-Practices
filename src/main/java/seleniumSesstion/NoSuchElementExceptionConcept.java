package seleniumSesstion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionConcept {

	public static void main(String[] args)
	{
	WebDriver driver =new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	By forgott=By.linkText("Forgotten Password1");
	try {
		driver.findElement(forgott).click();

	}
	catch(Exception e)
	{
		System.out.println("getting element exception ... Please check your locator again");
		e.printStackTrace();
	}
	System.out.println(driver.getTitle());
	}
}
