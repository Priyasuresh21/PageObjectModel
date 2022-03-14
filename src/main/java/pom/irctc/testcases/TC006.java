package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pom.indianfrro.pages.IndianFrroHomePage;
import wrappers.ProjectWrappers;


public class TC006 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC006";
		testCaseDescription="To verify Indian FRRO Registration";
		author="Priya";
		category="Functional";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
	}
	
	@Test
	public void indianFrroRegister()
	{
		new IndianFrroHomePage()
		.clickOnSignUp()
		.enterUserName("Priyaruthu21")
		.enterPassword("Ruthu2107#")
		.enterConfirmPassword("Ruthu2107#")
		//.waitForPageLoad(3000)
		.selectSecurityQues("where did you meet your spouse?")
		.enterSecurityAns("School")
		.enterName("Priya")
		//.waitForPageLoad(3000)
		.selectGender("Female")
		.enterDOB("21/07/1996")
		.enterDesignation("Engineering")
		.enterMail("priyajagadeesh.1996@gmail.com")
		.enterMobile("9791942803")
		.enterPhoneNumber("9788812288")
		//.waitForPageLoad(3000)
		.selectNationatily("INDIA")
		.enterGuestName("Priya")
		.enterCapacity("3")
		.enterAddress("East Gate")
		//.waitForPageLoad(3000)
		.selectState("TAMIL NADU")
		//.waitForPageLoad(3000)
		.selectCity("THANJAVUR")
		//.waitForPageLoad(3000)
		.selectAccomodationType("Guest House")
		//.waitForPageLoad(3000)
		.selectGrade("Five Star")
		.enterGuestMail("priyajagadeesh.1996@gmail.com")
		.enterGuestMobile("9791942803")
		.enterGuestContact("9788812288")
		.enterName1("Suresh")
		.enterAddress1("Nadu Street")
		//.waitForPageLoad(3000)
		.selectState1("TAMIL NADU")
		//.waitForPageLoad(3000)
		.selectCity1("TIRUNELVELI")
		.enterEmaild1("suresh@gmail.com")
		.enterPhone1("9791942803")
		.enterMobile1("9788812288")
		.clickOnAdd()
		//.waitForPageLoad(3000)
		.enterName1("Priya")
		.enterAddress1("Nadu Street")
		//.waitForPageLoad(3000)
		.selectState1("TAMIL NADU")
		//.waitForPageLoad(3000)
		.selectCity1("VILLUPURAM")
		.enterEmaild1("priya@gmail.com")
		.enterPhone1("9791942803")
		.enterMobile1("9788812288")
		.clickOnAdd()
		//.waitForPageLoad(3000)
		.enterName1("Rudhran")
		.enterAddress1("Nadu Street")
		//.waitForPageLoad(3000)
		.selectState1("TAMIL NADU")
		//.waitForPageLoad(3000)
		.selectCity1("KRISHNAGIRI")
		.enterEmaild1("rudhu@gmail.com")
		.enterPhone1("9791942803")
		.enterMobile1("9788812288")
		.clickOnAdd()
		
		
		
		
		
		
		;
	}
}
