package waitCommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingWaitConcept {

	public static void main(String[] args) {
		//default polling/interval time is =500 (0.5 sec)
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email=By.id("input-email");
		
		WebDriverWait  wait =new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("Tesrt");
	}

}
