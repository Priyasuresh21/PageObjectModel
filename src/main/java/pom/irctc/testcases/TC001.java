package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pom.irctc.pages.IrctcCovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify IRCTC Registration for the new User";
		author="Priya";
		category="Smoke";
		browserName="chrome";
		url="http://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void irctcRegistration() {
		
		new IrctcCovidAlertPage()
		.clickOnOk()
		.clickOnRegister()
		.enterUserName("Priya123$")
		.enterPassword("Ruthu123#")
		.enterConfrimPassword("Ruthu123#")
		.clickOnLanguage()
		.selectLanguage("English")
		.clickOnSecurityQues()
		.waitForPageLoad(3000)
		.selectSecurityQues("Where did you first meet your spouse?")
		.enterSecurityAns("School")
		.clickonPersonalDetails()
		.enterFirstName("Priya")
		.enterMiddleName("Suresh")
		.enterLastName("Kumar")
		.waitForPageLoad(2000)
		.clickOnOccupation()
		.waitForPageLoad(3000)
		.selectOccupation("PRIVATE")
		.ClickOnDOB()
		.selectMonth("July")
		.selectYear("1996")
		.waitForPageLoad(3000)
		.clickOnDate("21")
		.clickOnMartialStatus()
		.clickOnGender()
		.enterEmail("priyajagadeesh.1996@gmail.com")
		.waitForPageLoad(3000)
		.enterMobile("9791942803")
		.selectNationality("India")
		.clickOnAddressDetails()
		.enterFlatNo("46/A")
		.enterStreet("Dasappa Nayakan Street")
		.enterArea("EastGate")
		.enterPincode("613001")
		.selectCity("Thanjavur")
		.waitForPageLoad(3000)
		.selectPostOfficeCode("Thanjavur East Gate S.O")
		.enterPhone("9791942803")
		.clickOnOfficeAddress()
		.enterOfficeFlatNo("15/A")
		.enterOfficeStreet("Kollupettai Street")
		.enterArea("East Gate")
		.clickOnSelectCountry()
		.selectCountry("India")
		.enterOffPinCode("613001")
		.waitForPageLoad(3000)
		.enterOffState("Tamil Nadu")
		.enterOffCity("Thanjavur")
		.enterOffPostCode("Thanjavur Bazaar S.O")
		.enterOffPhone("9791942803");
		
		
	}

}
