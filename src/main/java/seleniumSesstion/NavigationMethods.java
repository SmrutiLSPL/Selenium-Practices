package seleniumSesstion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());	
		
		driver.navigate().to("https://vrmanaged1.com/");
		System.out.println(driver.getTitle());	
		
		driver.navigate().back();
		System.out.println(driver.getTitle());	
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());	
		
		driver.navigate().back();
		System.out.println(driver.getTitle());	
		
		driver.navigate().refresh();

	}
	
	 

}
