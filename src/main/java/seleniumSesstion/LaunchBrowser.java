package seleniumSesstion;


import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// open the Browser
		ChromeDriver driver = new ChromeDriver();
		// Enter the Browser
		driver.get("https://google.com");

		// get the title
		String actualTitle = driver.getTitle();
		System.out.println("Actual title : " +actualTitle);
		//verify the title
		if(actualTitle.equals("Google"))
		{
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("InCorrect title");
		}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().contains("Google"));
		driver.quit();
	}

}
