package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.IrctcCovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {

	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC003";
		testCaseDescription="To verify Saloon Charter Page in IRCTC";
		author="Priya";
		category="Regression";
		browserName="chrome";
		url="http://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void saloonCharter()
	{
		new IrctcCovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWindow()
		.clickOnSideBar()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.enterName("Priya")
		.enterOrganization("TCS")
		.enterAddress("East Gate,Thanjavur")
		.enterMobile("97919428")
		.enterMail("priyajagadeesh.1996@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOriginStation("Trichy")
		.enterDestinationStation("Chennai")
		.clickOnCheckInDate()
		.waitForPageLoad(4000)
		.selectCheckInDate("27")
		.clickOnCheckOutDate()
		.pageDown()
		.waitForPageLoad(4000)
		.selectCheckOutDate("28")
		.enterTourDuration("1")
		.enterCoachDetails("s3")
		.enterNumberOfPassengers("3")
		.enterCharterPurpose("Devotional")
		.enterAdditionalServices("NA")
		.clickOnSubmit()
		.verifyMobile("Mobile no. not valid")
		
		
		
		;
	}
}
