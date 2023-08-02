package seleniumSesstion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BrowserUtil;
import utils.ElementUtil;

public class RegistrationTest {

	public static void main(String[] args) {
		
		
	BrowserUtil brUtil=new BrowserUtil();
	WebDriver driver= brUtil.launchBrowser("chrome");
	
	brUtil.enterURl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	System.out.println(brUtil.getPageTitle());
	
	ElementUtil eleUtil=new ElementUtil(driver);
	
	By firstName=By.id("input-firstname");
	By LastName=By.id("input-lastname");
	By emailId=By.id("input-email");
	By phoneNo=By.id("input-telephone");
	By passID=By.id("input-password");
	By cPassID=By.id("input-confirm");
	By PrivacyPolicy=By.xpath("//input[@name='agree']");
	By continueclick=By.xpath("//input[@class='btn btn-primary']");
	
	eleUtil.doSendKeys(firstName, "Smruti");
	eleUtil.doSendKeys(LastName, "Parekh");
	eleUtil.doSendKeys(emailId, "parekhsmruti@gmail.com");
	eleUtil.doSendKeys(phoneNo, "9898989898");
	eleUtil.doSendKeys(passID, "smruti@123");
	eleUtil.doSendKeys(cPassID, "smruti@123");
	eleUtil.doClick(PrivacyPolicy);
	eleUtil.doClick(continueclick);
	//brUtil.quitBrowser();
	
	}

}
