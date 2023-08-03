package utils;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import customeException.FrameworkException;
/**
 * 
 * @author SmrutiParekh
 *
 */
public class BrowserUtil {
	private WebDriver driver;
/** 
 * This method is used to initialize in driver on the basis of giver browser name.
 * valid browser : chrome/firefox/edge.
 * @param browserName
 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("Your BrowserName is :" + browserName);
		if (browserName == null) {
			System.out.println("Browser cannot be null");
			throw new FrameworkException("Browser cannot be null");
		}
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right beowser name..." + browserName);
			throw new FrameworkException("Not Valid Browser");
		}
		return driver;
	}
/**
 * 
 * @param url
 */
	public void enterURl(String url) {
		if (url.contains("http")) {
			driver.get(url);
		} else {
			throw new FrameworkException("URL should have http(s)");
		}
	}

	public void enterURl(URL url)
	{
		if (String.valueOf(url).contains("http")) {
			driver.navigate().to(url);
		} else {
			throw new FrameworkException("URL should have http(s)");
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.close();
	}

}
