package TestNG;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ElementUtil;

public class SearchTest {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@DataProvider //We can use @DataProvider(name="searchData")
	public Object[][] searchTestData()
	{
		return new Object[][]
		{
			{"macbook",3},
			{"imac",1},
			{"samsung",2},
			{"Canon",1},
			{"Smruti",0}
		};
	}

	@Test(dataProvider="searchTestData")
	public void searchTest(String searchkey,int expSearchCount) throws InterruptedException
	{
		ElementUtil eleutil=new ElementUtil(driver);	
		
		By searchBox=By.name("search");
		By searchclick=By.cssSelector("div#search button");
		By actTitle =By.cssSelector("div#content h1");
		
		eleutil.clearTextField(searchBox);
		eleutil.doSendKeys(searchBox, searchkey);
		eleutil.doClick(searchclick);
		
		String header=eleutil.doElementGetText(actTitle);
		Assert.assertTrue(header.contains(searchkey));
		
		
		By searchCount=By.cssSelector("div.product-layout");
		int actSearchCount= eleutil.getElementsCount(searchCount);
		System.out.println(searchkey + "Count --> " + actSearchCount);
		Assert.assertEquals(actSearchCount, expSearchCount);
		
	    By producttitle=By.xpath("//div[@class='caption']//h4//a");

		List<WebElement>totalproducttitle=eleutil.getElements(producttitle);
		ArrayList<String> links = new ArrayList<>();
		for(WebElement e: totalproducttitle)
		{
			//1. way
//			System.out.println("Title "+ e.getText());
//			e.click();
//			By titleName=By.tagName("h1");
//			System.out.println("Procut Title : "+driver.findElement(titleName).getText());
//			driver.navigate().back();
			
			//2. way
			String href = e.getAttribute("href");
            links.add(href);
     
		}
		for(String e1:links)
		{
			driver.get(e1);
		}

	}
}






