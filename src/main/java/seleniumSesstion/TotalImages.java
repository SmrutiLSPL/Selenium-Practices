package seleniumSesstion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		 By images=By.tagName("img");
		 List<WebElement> imageslist=driver.findElements(images);
		 System.out.println("Total Images: "+imageslist.size());
		 
		 for(WebElement e: imageslist)
		 {
			 String srcval=e.getAttribute("src");
			 String altval=e.getAttribute("alt");
			 System.out.println(srcval + " : " +altval);
			
		 }
		 
	}

}
