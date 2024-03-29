package helpers;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Assertions {
	 public static void expectToEqual(Object result, Object expectedResult, String errorMessage) {
	        Assert.assertEquals(result, expectedResult, errorMessage);
	    }

	    public static void expectToNotEqual(Object result, Object expectedResult, String errorMessage) {
	        Assert.assertNotEquals(result, expectedResult, errorMessage);
	    }

	    public static void expectToDisplay(WebElement elm, String errorMessage) throws Exception {
	        Assert.assertTrue(elm.isDisplayed(), errorMessage);
	    }

	    public static void expectToNotDisplay(WebElement elm, String errorMessage) throws Exception {
	        Assert.assertFalse(elm.isDisplayed(), errorMessage);
	    }
	    
	    public static void expectToBeEnabled(WebElement elm, String errorMessage) throws Exception {
	        Assert.assertTrue(elm.isEnabled(), errorMessage);
	    }

	    public static void expectToBeDisabled(WebElement elm, String errorMessage) throws Exception {
	        Assert.assertFalse(elm.isEnabled(), errorMessage);
	    }

}
