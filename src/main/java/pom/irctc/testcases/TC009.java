package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpRegistrationPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC009";
		testCaseDescription="To verify PHP Travels Page";
		author="Priya";
		category="Regression";
		browserName="Chrome";
		url="https://www.phptravels.org/register.php";
		
	}
	
	@Test
	public void phpTravels()
	{
		new PhpRegistrationPage()
		.enterFirstName("Priya")
		.enterLastName("Suresh")
		.enterMail("priya@gmail.com")
		.clickOnCountryCode()
		.selectCountryCode()
		.enterPhoneNo("9791942803")
		.entercompanyName("TCS")
		.enterStreet("Dasappa Nayakan Street")
		.enterStreet2("East Gate")
		.enterCity("Thanjavur")
		.enterState("Tamil Nadu")
		.enterPostCode("613001")
		.selectCountry("India")
		.enterMobileNumber("9791942803")
		.enterPassword("Ruthu2107#")
		.enterConfirmPassword("Ruthu2107#")
		;
		
	}
}
