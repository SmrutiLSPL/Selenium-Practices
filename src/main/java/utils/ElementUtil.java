package utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import customeException.FrameworkException;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendKeys(By locator, String value) {
		if (value == null) {
			System.out.println("Value can not be null while using sendkeys method");
			throw new FrameworkException("VALUECANNOTBENULL");
		}
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("Element text is  : " + eleText);
		return eleText;
	}

	public boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public String getElementAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public boolean checkElementIsDisable(By locator) {
		String disabledvalue = getElement(locator).getAttribute("disabled");
		if (disabledvalue.equals("true")) {
			return true;
		}
		return false;

	}

	public void clearTextField(By locator) {
		getElement(locator).clear();
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * List<WebElement> Utils
	 */
	public int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

	// ***************************** WaitUtils**********************************//
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does notnecessarily mean that the element is visible.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that isgreater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */

	public WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that the title contains a case-sensitive substring
	 * @param titleFraction
	 * @param timeOut
	 * @return
	 */

	public String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			} else {
				System.out.println(titleFraction + " Title value is not present..");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(titleFraction + " Title value is not present..");
			return null;
		}
	}

	/**
	 * An expectation for checking that the title contains a case-sensitive substring
	 * @param titleValue
	 * @param timeOut
	 * @return
	 */
	public String waitForTitleIs(String titleValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.titleContains(titleValue))) {
				return driver.getTitle();
			} else {
				System.out.println(titleValue + " Title value is not present..");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(titleValue + " Title value is not present..");
			return null;
		}
	}

	/**
	 * An expectation for the URL of the current page to contain specific text.

	 * @param urlFraction
	 * @param timeOut
	 * @return
	 */
	public String waitForUrlContains(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			} else {
				System.out.println(urlFraction + " URL value is not present..");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(urlFraction + " URL value is not present..");
			return null;
		}
	}
/**
 * An expectation for the URL of the current page to be a specific url.
 * @param URlValue
 * @param timeOut
 * @return
 */
	public String waitForUrlToBe(String URlValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			if (wait.until(ExpectedConditions.urlToBe(URlValue))) {
				return driver.getCurrentUrl();
			} else {
				System.out.println(URlValue + " URL value is not present..");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(URlValue + " URL value is not present..");
			return null;
		}
	}
	/**
	 *An expectation for the alert JS to be appeared on the page
	 * @param timeOut
	 * @return
	 */

	public  Alert waitForJSAlert(int timeOut)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}


}
