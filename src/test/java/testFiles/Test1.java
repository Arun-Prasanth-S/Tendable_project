package testFiles;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.BasePo;
import enums.Enum.ContactDetailsEnum;
import enums.Enum.FormEnum;
import enums.Enum.HeaderMenuItemsEnum;
import enums.Enum.JobRoleEnum;
import steps.HomeSteps;

public class Test1 extends BasePo{
	HomeSteps homeSteps = new HomeSteps();
	
	@BeforeTest
	public void launchWebsite() {
		browserLaunch();
	}
	
	@AfterTest
	public void tearDown() {
		closeBrowser();
	}
	 @Test(priority = 1)
	    public void testTopLevelMenuAccessibility() throws Exception {
		 homeSteps.userLandsOnHomePage();
		 homeSteps.clickOnMenuItem(HeaderMenuItemsEnum.OurSolution);
		 homeSteps.assertMenuItem(HeaderMenuItemsEnum.OurSolution);
		 homeSteps.clickOnMenuItem(HeaderMenuItemsEnum.OurStory);
		 homeSteps.assertMenuItem(HeaderMenuItemsEnum.OurStory);
		 homeSteps.clickOnMenuItem(HeaderMenuItemsEnum.WhyTendableWithSpecialCharacter);
		 homeSteps.assertMenuItem(HeaderMenuItemsEnum.WhyTendable);
	    }
	    @Test(priority = 2)
	    public void testRequestADemoButtonPresenceAndIsActive() throws Exception {
	    	 homeSteps.userLandsOnHomePage();
	    	 homeSteps.clickOnMenuItem(HeaderMenuItemsEnum.OurSolution);
	    	 homeSteps.assertRequestDemoButton(HeaderMenuItemsEnum.RequestADemo.getValue());
			 homeSteps.clickOnMenuItem(HeaderMenuItemsEnum.OurStory);
	    	 homeSteps.assertRequestDemoButton(HeaderMenuItemsEnum.RequestADemo.getValue());
			 homeSteps.clickOnMenuItem(HeaderMenuItemsEnum.WhyTendableWithSpecialCharacter);
	    	 homeSteps.assertRequestDemoButton(HeaderMenuItemsEnum.RequestADemo.getValue());
	    }
	    @Test(priority = 3)
	    public void testContactUsFormSubmission() throws Exception {
	    	 homeSteps.userLandsOnHomePage();
	    	 homeSteps.clickOnMenuItem(HeaderMenuItemsEnum.ContactUs);
	    	 homeSteps.clickingOnContactButton();
	    	 homeSteps.fillContactForm(FormEnum.FullName,ContactDetailsEnum.FullName );
	    	 homeSteps.fillContactForm(FormEnum.OrganisationName , ContactDetailsEnum.OrganisationName);
	    	 homeSteps.fillContactForm(FormEnum.CellPhone,ContactDetailsEnum.CellPhone );
	    	 homeSteps.fillContactForm(FormEnum.Email, ContactDetailsEnum.Email);
	    	 homeSteps.selectJobRoleInDropDown(JobRoleEnum.Management);
	    	 homeSteps.clickingOnSubmitButton();
	    	 homeSteps.assertingErrorMessage();
	    }

}
