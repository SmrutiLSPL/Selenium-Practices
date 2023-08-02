package seleniumSesstion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessConcept {

	public static void main(String[] args) {
		
		ChromeOptions co =new ChromeOptions();
		FirefoxOptions fo=new FirefoxOptions();
		EdgeOptions ed=new EdgeOptions();
		
		ed.addArguments("--headless");
		fo.addArguments("--headless");
		co.addArguments("--headless=new");
		
		WebDriver driver=new EdgeDriver(ed);
		
		driver.get("https://vrmanaged1.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
		   
	}

}
