package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.ConfirmationAlertPage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC011";
		testCaseDescription="To verify Confirmation Alert";
		author="Priya";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}
	
	
	@Test
	public void confirmationAlert()
	{
		new ConfirmationAlertPage()
		.switchFrame()
		.clickOnTryIt()
		.getTextFromAlert()
		.alertAccept()
		.verifyTextAlert("OK")
		.pageRefresh()
		.switchFrame()
		.clickOnTryIt()
		.getTextFromAlert()
		.alertDismiss()
		.verifyTextAlert("Cancel")
		.quitFrame()
		.clickOnHome()
		
		;
		
		
	}
}
