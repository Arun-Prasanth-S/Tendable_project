package helpers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import basePackage.BasePo;

public class ElementUtils extends BasePo{
	 private static final int maxRetryAttempts = 3;
	 public static WebElement getElementByLocator(By locator, int index) throws InterruptedException {
	        NoSuchElementException lastException = null;
	        for (int retryCount = 0; retryCount < maxRetryAttempts; retryCount++) {
	            try {
	                List<WebElement> pageElements = driver.findElements(locator);
	                if (pageElements.size() > index) {
	                    return pageElements.get(index);
	                }
	            } catch (NoSuchElementException e) {
	                lastException = e;
	               Waiters.waitWithSleepTimeout();
	            }
	        }
	        throw new RuntimeException("Unable to get locator '" + locator.toString() + "' after " + maxRetryAttempts + " retries", lastException);
	    }

	  public static String getTextByLocator(By locator, int index) throws Exception {
	        WebElement element = getElementByLocator(locator, index);
	        return element.getText();
	    }

}
