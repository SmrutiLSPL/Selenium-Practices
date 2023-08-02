package seleniumSesstion;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtils {
	static WebDriver driver;
	public static void main (String []args)
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
		By images=By.tagName("img");
		By Links=By.tagName("a");
		/*
		 * System.out.println("Total Images : " + getElementsCount(images));
		 * System.out.println("Total Links : " + getElementsCount(Links));
		 */
		
		
//		List<String> actElementTextList=getElementTextList(Links);
//		System.out.println(actElementTextList);
//		if(actElementTextList.contains("Privacy Policy"))
//		{
//			System.out.println("Privacy Policy -- PASS");
//		}
//		if(actElementTextList.contains("My Account"))
//		{
//			System.out.println("My Account -- PASS");
//		}
//		
//		
		List<String> actAttributsTextList= getAttributsList(images,"alt");
		System.out.println(getElementsCount(images));
		System.out.println(actAttributsTextList);
		
	}
	
	
	public static List<String> getAttributsList(By locator,String attribusName)
	{
		List<WebElement> attributeList= getElements(locator);
		List<String> totalAttribus=new ArrayList<String>();
 		for(WebElement e:attributeList )
		{
			String Attribus=e.getAttribute(attribusName);
			totalAttribus.add(Attribus);
		}
 		return totalAttribus;
	}
	
	
	
	public static List<String> getElementTextList(By locator)
	{
		List<WebElement> eleList=getElements(locator);
		List<String> eleTextList=new ArrayList<String>();
		for(WebElement e:eleList)
		{
			String text=e.getText();
			if(!text.isEmpty())
			{
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	public static int getElementsCount(By locator)
	{
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}

}
