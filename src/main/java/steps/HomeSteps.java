package steps;

import basePackage.BasePo;
import enums.Enum.ContactDetailsEnum;
import enums.Enum.FormEnum;
import enums.Enum.HeaderMenuItemsEnum;
import enums.Enum.JobRoleEnum;
import helpers.Assertions;
import helpers.DataProviders;
import helpers.StepUtils;
import helpers.StringUtils;
import pages.HomePage;

public class HomeSteps extends BasePo {
	HomePage homepage = new HomePage(driver);

	public void userLandsOnHomePage() {
		homepage.openLandingPage();
	}

	public void clickOnMenuItem(HeaderMenuItemsEnum item) throws Exception {
		homepage.clickOnHeaderMenuButton(item.getValue());
		StepUtils.addLog("The User clicks on the " + item + " button");
	}

	public void assertMenuItem(HeaderMenuItemsEnum item) throws Exception {
		String baseUrl = DataProviders.getUrlTestData("tendableUrl");
		String finalUrl = baseUrl + item.getValue();
		switch (item) {
		case WhyTendable:
			Assertions.expectToEqual(homepage.getCurrentUrl(),
					StringUtils.replaceAllStringForValue(StringUtils.getStringToLowerCase(finalUrl), " ", "-"),
					"URL does not contain expected text for " + item);
		default:
			Assertions.expectToEqual(homepage.getCurrentUrl(),
					StringUtils.replaceAllStringForValue(StringUtils.getStringToLowerCase(finalUrl), " ", "-"),
					"URL does not contain expected text for " + item);
		}
		StepUtils.addLog("The " + item + " webpage is opened");
	}

	public void assertRequestDemoButton(String item) throws Exception {
		Assertions.expectToDisplay(homepage.getRequestDemoButton(item),
				"Request a Demo button is not displayed on " + item);
		Assertions.expectToBeEnabled(homepage.getRequestDemoButton(item),
				"Request a Demo button is disabled on " + item);
		StepUtils.addLog("The demo button is active and displayed");
	}

	public void fillContactForm(FormEnum fieldName, ContactDetailsEnum text) throws Exception {
		homepage.typeContactUSform(fieldName.getValue(), text.getValue());
		StepUtils.addLog("The user types "+text.getValue()+" in the " +fieldName.getValue()+ " field");
	}

	public void clickingOnContactButton() throws Exception {
		homepage.clickOnContactButton();
		StepUtils.addLog("The User clicks on the contact button");
	}

	public void selectJobRoleInDropDown(JobRoleEnum option) throws Exception {
		homepage.selectJobRoleByName(option.getValue());
		StepUtils.addLog("The user select " + option.getValue() + " option from the job role dropdown");
	}

	public void clickingOnSubmitButton() throws Exception {
		homepage.clickOnSubmitButton();
		StepUtils.addLog("The user clicks on the submit button");
	}
	
	public void assertingErrorMessage() throws InterruptedException, Exception {
		Assertions.expectToDisplay(homepage.getErrorMessage(), "Error message is not displayed");
		StepUtils.addLog("Error message is displayed");
	}
}
