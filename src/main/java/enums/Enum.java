package enums;

public class Enum {
	public enum HeaderMenuItemsEnum	 {
		WhyTendableWithSpecialCharacter("Why Tendable?"),
		WhyTendable("Why Tendable"),
	    OurStory("Our Story"),
		OurSolution("Our Solution"),
		RequestADemo("Request A Demo"),
		ContactUs("Contact Us");

	    private final String value;

	    HeaderMenuItemsEnum(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }
	}
	
	public enum FormEnum	 {
		FullName("fullName"),
		OrganisationName("organisationName"),
		CellPhone("cellPhone"),
		Email("email"),
		JobRole("jobRole");

	    private final String value;

	    FormEnum(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }
	}
	
	public enum ContactDetailsEnum	 {
		FullName("Arun"),
		OrganisationName("SoftSuave"),
		CellPhone("123456789"),
		Email("Arun@gmail.com");

	    private final String value;

	    ContactDetailsEnum(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }
	}
	
	public enum JobRoleEnum	 {
		JobRole("Job Role"),
		ExecutiveBoardMember("Executive Board Member"),
		Management("Management"),
		CNO("CNO"),
		FrontlineWorker("Frontline worker");
	    private final String value;

	    JobRoleEnum(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }
	}
}
