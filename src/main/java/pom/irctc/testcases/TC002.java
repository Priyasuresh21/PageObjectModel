package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.IrctcCovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC002";
		testCaseDescription="To verify Book Coach Page in IRCTC";
		author="Priya";
		category="Smoke";
		browserName="chrome";
		url="http://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void bookCoach()
	{
		new IrctcCovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWindow()
		.clickOnSideBar()
		.clickOnBookCoach()
		.switchWindow()
		.clickSignup()
		.enterUserName("Priyaruthu")
		.enterPassword("Ruthu2107#")
		.enterConfrimPassword("Ruthu2107#")
		.selectSecurityQues("Where did you first meet your spouse?")
		.enterSecurityAns("School")
		.clickOnDOB()
		.selectMonth("Jul")
		.selectYear("1996")
		.waitForPageLoad(2000)
		.clickOnDate("21")
		.clickOnGender()
		.clickOnMaritalStatus()
		.enterMail("priyajagadeesh.1996@gmail.com")
		.selectOcccupation("Self Employed")
		.enterFirstName("Priya")
		.enterMiddleName("Darshini")
		.enterLastName("Suresh")
		.selectNationality("Indian")
		.enterFlatNo("46/A")
		.enterStreet("Dasappa Nayakan street")
		.enterArea("East Gate")
		.selectCountry("India")
		.enterMobile("9791942803")
		.enterPinCode("613001")
		//.waitForPageLoad(2000)
		.selectPostOffice("Thanjavur City S.O")
		.pageDown()
		//.waitForPageLoad(3000)
		.clickOnCommunicationAdrdess()
		.pageDown()
		//.waitForPageLoad(3000)
		.enterOfficeFlatNo("15/A")
		.enterOfficeStreet("Kollupettai Street")
		.enterOfficeArea("East Gate")
		.selectOfficeCountry("India")
		.enterOfficeMobile("9791942803")
		.enterOfficePincode("613001")
		//.waitForPageLoad(2000)
		.selectOfficePost("Thanjavur Bazaar S.O");
		
		
		
		
		
	}

}
