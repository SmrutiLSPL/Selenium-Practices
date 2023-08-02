package actionsExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		Thread.sleep(1000);
		WebElement parentMenu = driver.findElement(By.className("menulink"));
		Actions act = new Actions(driver);
//		//act.moveToElement(parentMenu);//not valid
//		//act.moveToElement(parentMenu).build();//not valid
		act.moveToElement(parentMenu).perform();
		Thread.sleep(1500);
		driver.findElement(By.linkText("COURSES")).click();
	}

}
