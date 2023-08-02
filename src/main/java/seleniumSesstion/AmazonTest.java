package seleniumSesstion;

import utils.BrowserUtil;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName="chrome";
		BrowserUtil browser=new BrowserUtil();
		browser.launchBrowser(browserName);
		browser.enterURl("https://www.amazon.in/");
		String acttitle= browser.getPageTitle();
		System.out.println(acttitle);
		if(acttitle.contains("Amazon"))
		{
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("In-Correct title");
		}
		
		String acturl=browser.getPageURL();
		System.out.println(acturl);
		if(acturl.contains(""))
		{
			System.out.println("Correct URl");
		}
		else
		{
			System.out.println("In-Correct URl");
		}
		browser.quitBrowser();
	}

}
