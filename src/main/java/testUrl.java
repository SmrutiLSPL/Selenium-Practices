import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testUrl {
	@Test
	public void editURL() {
	WebDriver driver;
	
	driver = new ChromeDriver();
	String  test="1149854";
	driver.get("https://vrmanaged1.com/");
	
	

	driver.get("https://www.vrbo.com/"+test);
	
	
	}
}
