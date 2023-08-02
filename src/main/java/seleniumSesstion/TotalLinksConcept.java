package seleniumSesstion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	public static void main(String[] args) {
		WebDriver driver;
		//Open any link
		//Get the count of links on the page
		//print the text of each link on the console 
		//but ignore blank text
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		By links=By.tagName("a");
		List<WebElement>listlink=driver.findElements(links);
        int totallink=listlink.size();
        System.out.println("Total link = " +totallink);
       //1. Index based loop:
//        for(int i=0;i<totallink;i++)
//        {
//        	String text=listlink.get(i).getText();
//        	if(!text.isEmpty())
//        	{
//        		System.out.println(i + ":" +text);
//        	}
//        }
        //2. for each loop
        int count=0;
        for(WebElement e:listlink)
        {
        	String text=e.getText();
        	if(!text.isEmpty())
        	{
        		System.out.println(count + ":" +text);
        	}
        	String hreftext=e.getAttribute("href");
        	System.out.println(hreftext);
        	count++;
        }
	}

}
