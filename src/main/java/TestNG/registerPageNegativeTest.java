package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registerPageNegativeTest {
	
	
	//data driven approach: drive the data from source: method, excel
	//test parameterization
	WebDriver driver;
	
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	@DataProvider
	public Object[][] registerTestData()
	{
		return new Object[][] {
			{"Smruti","Parekh","smruti@","785","123","1234"},
			{"Smruti","Parekh","smruti@gmail","9898989898","12345","1234"},
			{" "," "," "," "," "," "},
			{"Smruti","Parekh","smruti@","9898989898"," ","1234"},
		};
	}
	@Test(dataProvider = "registerTestData")
	public void registerWithWrongDataTest(String firstname,String lastname,String email,String phone,String password,String confirmpass)
	{
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(confirmpass);
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		String errorMsg = 
				driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
		
		System.out.println(errorMsg);
		Assert.assertTrue(errorMsg.contains("Warning: No match for E-Mail Address and/or Password"));
		
	}
	
}
