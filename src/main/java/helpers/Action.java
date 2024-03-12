package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import basePackage.BasePo;

public class Action extends BasePo {
	private static final int maxRetryAttempts = 3;

	public static void clearTextInLocatorAndTypeText(By locator, String text, int index) throws Exception {
		Waiters.waitForElementToBeVisible(locator);
		WebElement element = ElementUtils.getElementByLocator(locator, index);
		element.clear();
		element.sendKeys(text);
	}

	public static void clickByLocator(By locator, int index) throws Exception {
		WebElement pageElement = ElementUtils.getElementByLocator(locator, index);
		int retryCount = 0;

		while (retryCount < maxRetryAttempts) {
			try {
				Waiters.waitForElementToBeVisible(locator);
				Waiters.waitForElementToBeClickable(locator);
				new Actions(driver).moveToElement(pageElement).click().build().perform();
				break;
			} catch (Exception e) {
				retryCount++;
				if (retryCount >= maxRetryAttempts) {
					throw new Exception(e.getMessage() + ". Unable to click on locator '" + locator.toString()
							+ "' after '" + retryCount + "' retries", e);
				}
			}
		}
	}
	public static void clickSelectDropDownByLoctor(By locator, String value, int index) throws Exception {
		WebElement element = ElementUtils.getElementByLocator(locator, index);
		Waiters.waitForElementToBeClickable(locator);
		Select dropdown = new Select(element);
		dropdown.selectByValue(value);

	}

}
