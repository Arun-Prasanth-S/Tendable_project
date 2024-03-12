package helpers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.BasePo;

public class Waiters extends BasePo{
	public static int timeoutInSeconds = 10;
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	
	public static void waitWithSleepTimeout() throws InterruptedException {
		Thread.sleep(2500);
	}
	
	public static void waitForElementToBeDisplayed(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static void waitForElementToBeVisible(By locator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void waitForElementToBeClickable(By locator) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

}
