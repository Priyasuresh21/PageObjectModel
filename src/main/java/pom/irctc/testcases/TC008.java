package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pom.panindia.pages.PanIndiaApplicationFormPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC008";
		testCaseDescription="To Verify PAN India application";
		author="Priya";
		category="Smoke";
		browserName="Chrome";
		url="https://panind.com/india/new_pan/";
	}

	@Test
	public void panIndia()
	{
		new PanIndiaApplicationFormPage()
		.selectTitle("MISS")
		.enterFirstName("Priya")
		.enterMiddleName("Suresh")
		.enterLastName("Kumar")
		.enterFatherFirstName("Solai")
		.enterFatherMiddleName("Ganesh")
		.enterFatherLastName("Subramani")
		.enterMobile("9791942803")
		.enterEmail("priya@gmail.com")
		.selectSourceOfIncome("Salary")
		.clickOffice()
		.enterDOB("21071996")
		.enterHouseNo("46")
		.enterArea("Dasappa Nayakan Street")
		.enterCity("Thanjavur")
		.selectState("Tamil Nadu")
		.pageDown()
		.enterPinCode("613001")
		.enterOfficeName("Solai Traders")
		.pageDown()
		.enterOfficeFlatNo("15/A")
		.enterOfficeArea("Kollu Nayakan Street")
		.enterOfficeCity("Thanjavur")
		.selectOfficeState("Tamil Nadu")
		.pageDown()
		.enterOfficePinCode("613001")
		.selectIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAddressProof("PASSPORT (In Copy)")
		.selectDOBProof("Driving License (In Copy)")
		.selectAadharProof("Copy of Aadhaar Card / Letter")
		.selectOfficeAddressProof("Employer Certificate carrying Office Address")
		.clickOnAgree()
		;
		
	}
}
