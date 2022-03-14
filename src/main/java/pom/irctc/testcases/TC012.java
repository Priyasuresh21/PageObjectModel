package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.PromptPage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers {

	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC012";
		testCaseDescription="To verify Prompt Alert";
		author="Priya";
		category="Sanity";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		
	}
	
	@Test
	public void promptAlert()
	{
		new PromptPage()
		.switchFrame()
		.clickOnTryIt()
		.alertTextSend("Priya")
		.alertTextGet()
		.alertAccept()
		.verifyText("Priya")
		.pageRefresh()
		.switchFrame()
		.clickOnTryIt()
		.alertTextSend("Priya")
		.alertTextGet()
		.alertDismiss()
		.verifyTextNotContains("Priya")
		.quitFrame()
		.clickOnHome()
		
		
		;
	}
}

