package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import basePackage.BasePo;
import enums.Enum.FormEnum;
import helpers.Action;
import helpers.DataProviders;
import helpers.ElementUtils;
import helpers.Waiters;

public class HomePage extends BasePo {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private By headerItem(String itemName) {
		return By.linkText(itemName);
	}

	private By contactForm(String formname) {
		return By.name(formname);
	}

	private By contactButton = By.cssSelector("button[data-target='.toggle-163701']");
	private By submitButton = By.name("form_page_submit");
	private By ErrorMessgae = By.cssSelector(".ff-form-errors");
	public void openLandingPage() {
		driver.get(DataProviders.getUrlTestData("tendableUrl"));
	}

	public Object getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void clickOnHeaderMenuButton(String itemName) throws Exception {
		Waiters.waitForElementToBeDisplayed(headerItem(itemName));
		Action.clickByLocator(headerItem(itemName), 0);
	}

	public WebElement getRequestDemoButton(String itemName) throws InterruptedException {
		return ElementUtils.getElementByLocator(headerItem(itemName), 0);
	}

	public void clickOnContactButton() throws Exception {
		Action.clickByLocator(contactButton, 0);
	}

	public void typeContactUSform(String fieldName, String text) throws Exception {
		Action.clearTextInLocatorAndTypeText(contactForm(fieldName), text, 0);
	}

	public void selectJobRoleByName(String option) throws Exception {
		Action.clickSelectDropDownByLoctor(contactForm(FormEnum.JobRole.getValue()), option, 0);
	}

	public void clickOnSubmitButton() throws Exception {
		Action.clickByLocator(submitButton, 0);
	}
	
	public WebElement getErrorMessage() throws InterruptedException {
		return ElementUtils.getElementByLocator(ErrorMessgae, 0);
	}
	
}
