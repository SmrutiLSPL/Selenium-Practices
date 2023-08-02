package actionsExample;


import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class neelam {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");

		Thread.sleep(3000);

		String category = "Bakery, Cakes & Dairy";

		String subMenuName = "Dairy";

		WebElement shopByCategory = driver.findElement(By.xpath("//a[@qa='categoryDD']"));

		Actions action = new Actions(driver);

		action.moveToElement(shopByCategory).build().perform();

		Thread.sleep(2000);

		List<WebElement> levelList1 = driver
				.findElements(By.xpath("//ul[@id='navBarMegaNav']//a[text()='" + category + "']"));

		for (WebElement e1 : levelList1) {

			String text = e1.getText();

			System.out.println(text);

		}
		
		WebElement subMenu = driver.findElement(By.xpath("//mega-nav-template[@bb-lazy-load='vm.readyToShow']//a[text()='Dairy']"));
		Thread.sleep(2000);
		action.moveToElement(subMenu).build().perform();

		Thread.sleep(2000);

		List<WebElement> levelList2 = driver.findElements(By.xpath("//ul[@class='nav nav-pills nav-stacked']/li"));

		for (WebElement e2 : levelList2) {

			String text2 = e2.getText();

			System.out.println(text2);

		}

		Thread.sleep(2000);

		List<WebElement> levelList3 = driver.findElements(By.xpath("//ul[@class='list-unstyled']/li"));

		for (WebElement e3 : levelList3) {

			String text3 = e3.getText();

			System.out.println(text3);

		}

	}

}
