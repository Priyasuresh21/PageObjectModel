package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcSignUpRegistartionPage extends GenericWrappers {

	
	public IrctcSignUpRegistartionPage waitForPageLoad(long mills)
	{
		waitProperty(mills);
		return this;
	}
	
	public IrctcSignUpRegistartionPage enterUserName(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.UserName.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.Password.XPath"), data);
		return this;
	} 
	public IrctcSignUpRegistartionPage enterConfrimPassword(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.ConfrimPassword.XPath"), data);
		return this;
	} 
	public IrctcSignUpRegistartionPage selectSecurityQues(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcSignUpRegistartionPage.SecurityQuestion.XPath"), value);
		return this;
	}
	public IrctcSignUpRegistartionPage enterSecurityAns(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.SecurityAnswer.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage clickOnDOB()
	{
		clickByXpath(prop.getProperty("IrctcSignUpRegistartionPage.ClickOnDOB.XPath"));
		return this;
	}
	public IrctcSignUpRegistartionPage selectMonth(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcSignUpRegistartionPage.SelectMonth.XPath"), value);
		return this;
	}
	public IrctcSignUpRegistartionPage selectYear(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcSignUpRegistartionPage.SelectYear.XPath"), value);
		return this;
	}
	
	public IrctcSignUpRegistartionPage clickOnDate(String data)
	{
		clickByXpath(prop.getProperty("IrctcSignUpRegistartionPage.ClickDate.XPath"),data);
		return this;
	}
	public IrctcSignUpRegistartionPage clickOnGender()
	{
		clickByXpath(prop.getProperty("IrctcSignUpRegistartionPage.Gender.XPath"));
		return this;
	}
	public IrctcSignUpRegistartionPage clickOnMaritalStatus()
	{
		clickByXpath(prop.getProperty("IrctcSignUpRegistartionPage.MaritalStatus.XPath"));
		return this;
	}
	public IrctcSignUpRegistartionPage enterMail(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.Email.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage selectOcccupation(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcSignUpRegistartionPage.Occupation.XPath"), value);
		return this;
	}
	public IrctcSignUpRegistartionPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.FirstName.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage enterMiddleName(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.MiddleName.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.LastName.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage selectNationality(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcSignUpRegistartionPage.Nationality.XPath"), value);
		return this;
	}
	
	public IrctcSignUpRegistartionPage enterFlatNo(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.FlatNo.XPath"), data);
		return this;
	}
	
	public IrctcSignUpRegistartionPage enterStreet(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.Street.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage enterArea(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.Area.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage selectCountry(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcSignUpRegistartionPage.Country.XPath"), value);
		return this;
	}
	public IrctcSignUpRegistartionPage enterMobile(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.Mobile.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage enterPinCode(String data)
	{
		enterByXPathwithTabKey(prop.getProperty("IrctcSignUpRegistartionPage.Pincode.XPath"), data);
		return this;
	}
	
	public IrctcSignUpRegistartionPage selectPostOffice(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcSignUpRegistartionPage.PostOffice.XPath"), value);
		return this;
	}
	
	public IrctcSignUpRegistartionPage pageDown()
	{
		keysDown();
		return this;
	}
	public IrctcSignUpRegistartionPage clickOnCommunicationAdrdess()
	{
		clickByXpath(prop.getProperty("IrctcSignUpRegistartionPage.CommunicationAddress.XPath"));
		return this;
	}
	public IrctcSignUpRegistartionPage enterOfficeFlatNo(String data)
	{
		enterByXPathwithTabKey(prop.getProperty("IrctcSignUpRegistartionPage.OfficeFlatNo.XPath"), data);
		return this;
	}
	
	public IrctcSignUpRegistartionPage enterOfficeStreet(String data)
	{
		enterByXPathwithTabKey(prop.getProperty("IrctcSignUpRegistartionPage.OfficeStreet.XPath"), data);
		return this;
	}
	
	public IrctcSignUpRegistartionPage enterOfficeArea(String data)
	{
		enterByXPathwithTabKey(prop.getProperty("IrctcSignUpRegistartionPage.OfficeArea.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage selectOfficeCountry(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcSignUpRegistartionPage.OfficeCountry.XPath"), value);
		return this;
	}
	public IrctcSignUpRegistartionPage enterOfficeMobile(String data)
	{
		enterByXpath(prop.getProperty("IrctcSignUpRegistartionPage.OfficeMobile.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage enterOfficePincode(String data)
	{
		enterByXPathwithTabKey(prop.getProperty("IrctcSignUpRegistartionPage.OfficePincode.XPath"), data);
		return this;
	}
	public IrctcSignUpRegistartionPage selectOfficePost(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcSignUpRegistartionPage.OfficePostOffice.XPath"), value);
		return this;
	}
	
	
	
	
	
}
