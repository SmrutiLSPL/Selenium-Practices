package waitCommand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		driver=new ChromeDriver();
	    driver.get("https://classic.crmpro.com/");
	    
	    //wait for the right title
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		if(wait.until(ExpectedConditions.titleContains("Free CRM")))
//		{
//			System.out.println(driver.getTitle());
//		}
	    
	    waitForTitleContains("Free CRM", 10);
	    System.out.println(driver.getTitle());
	    
	}
	
	public static String waitForTitleContains(String titleFraction,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		 if( wait.until(ExpectedConditions.titleContains(titleFraction)))
		 {
			return driver.getTitle();
		 }
		 else
		 {
		 	System.out.println(titleFraction  + " Title value is not present..");
			return null;
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(titleFraction  + " Title value is not present..");
			return null;
		}
	}
	
	public static String waitForTitleIs(String titleValue,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		 if( wait.until(ExpectedConditions.titleContains(titleValue)))
		 {
			return driver.getTitle();
		 }
		 else
		 {
		 	System.out.println(titleValue  + " Title value is not present..");
			return null;
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(titleValue  + " Title value is not present..");
			return null;
		}
	}
	public static String waitForUrlContains(String urlFraction,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		 if( wait.until(ExpectedConditions.titleContains(urlFraction)))
		 {
			return driver.getCurrentUrl();
		 }
		 else
		 {
		 	System.out.println(urlFraction  + " URL value is not present..");
			return null;
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(urlFraction  + " URL value is not present..");
			return null;
		}
	}
	
	public static String waitForUrlToBe(String URlValue,int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		 if( wait.until(ExpectedConditions.titleContains(URlValue)))
		 {
			return driver.getCurrentUrl();
		 }
		 else
		 {
		 	System.out.println(URlValue  + " URL value is not present..");
			return null;
		 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(URlValue  + " URL value is not present..");
			return null;
		}
	}
	
		
}
	
	


