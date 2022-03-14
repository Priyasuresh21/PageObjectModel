package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookHomePage;

import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC007";
		testCaseDescription="To Verify Facebook app for new user registartion";
		author="Priya";
		category="Smoke";
		browserName="chrome";
		url="http://www.facebook.com";
	}
	
	@Test
	public void facebookSign()
	{
		new FacebookHomePage()
		.clickOnCreateNewAccount()
		.enterFirstname("Priya")
		.enterSurname("Suresh")
		.enterMail("priya@gmail.com")
		.enterMailConfirmation("priya@gmail.com")
		.enterPassword("Ruthu2107#")
		.selectBirthdayDate("21")
		.selectBirthdayMonth("Jul")
		.selectBirthdayYear("1996")
		.selectGender()
		;
	}
}
