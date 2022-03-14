package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.IrctcCovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC004";
		testCaseDescription="To verify Book Hotel Page in IRCTC";
		author="Priya";
		category="Sanity";
		browserName="chrome";
		url="http://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	public void bookHotels()
	{
		new IrctcCovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWindow()
		.clickOnHotels()
		.switchToWindow()
		.waitForPageLoad(3000)
		.clickOnLogin()
		.clickOnGuestUser()
		.enterEmail("priyajagadeesh.1996@gmail.com")
		.enterMobile("9791942803")
		.clickOnSignin()
		.waitForPageLoad(3000)
		.enterCity("trichy")
		.waitForPageLoad(2000)
		.clickOnCity()
		.clickOnCheckInDate()
		.waitForPageLoad(2000)
		.selectCheckInDate("4")
		.clickOnCheckOutDate()
		.waitForPageLoad(2000)
		.selectCheckOutDate("5")
		.clickOnGuest()
		.selectRoom("1")
		.selectAdult("3")
		.clickOnDone()
		.waitForPageLoad(3000)
		.clickOnGetHotel()
		.waitForPageLoad(3000)
		.clickOnHotel()
		.switchWindow()
		.waitForPageLoad(3000)
		.getHotelName()
		.getPrice()
		.clickOnContinue()
		.waitForPageLoad(3000)
		.selectTitle("Miss")
		.enterFirstName("Priya")
		.enterLastName("Suresh")
		.selectCountry("India")
		.selectState("TAMIL NADU")
		.selectGstAsNo("No")
		.verifyHotelName()
		.verifyHotelPrice()
		.clickOnContinue()
		.waitForPageLoad(3000)
		.clickOnAgree()
		.clickOnMakePayment()
		.waitForPageLoad(3000)
		.clickOnVerify()
		.verifyOTP("otp is required.")
		
		
		
		
		
		
		;
	}
}
