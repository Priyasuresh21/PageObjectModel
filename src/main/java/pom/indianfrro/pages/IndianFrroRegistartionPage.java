package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class IndianFrroRegistartionPage extends GenericWrappers {

	public IndianFrroRegistartionPage waitForPageLoad(long mills)
	{
		waitProperty(mills);
		return this;
	}
	public IndianFrroRegistartionPage enterUserName(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.UserName.XPath"), data);
		return this;
	}


	public IndianFrroRegistartionPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Password.XPath"), data);
		return this;
	}


	public IndianFrroRegistartionPage enterConfirmPassword(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.ConfirmPassword.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage selectSecurityQues(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IndianFrroRegistartionPage.SecurityQuestion.XPath"), value);
		return this;
	}
	public IndianFrroRegistartionPage enterSecurityAns(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.SecurityAnswer.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterName(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Name.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage selectGender(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IndianFrroRegistartionPage.Gender.XPath"), value);
		return this;
	}
	public IndianFrroRegistartionPage enterDOB(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.DOB.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterDesignation(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Designation.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterMail(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Mail.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterMobile(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Mobile.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterPhoneNumber(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Phonenumber.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage selectNationatily(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IndianFrroRegistartionPage.Nationality.XPath"), value);
		return this;
	}
	public IndianFrroRegistartionPage enterGuestName(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.GuestName.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterCapacity(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Capacity.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterAddress(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Address.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage selectState(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IndianFrroRegistartionPage.State.XPath"), value);
		return this;
	}
	public IndianFrroRegistartionPage selectCity(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IndianFrroRegistartionPage.City.XPath"), value);
		return this;
	}
	public IndianFrroRegistartionPage selectAccomodationType(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IndianFrroRegistartionPage.AccomodationType.XPath"), value);
		return this;
	}
	public IndianFrroRegistartionPage selectGrade(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IndianFrroRegistartionPage.Grade.XPath"), value);
		return this;
	}
	public IndianFrroRegistartionPage enterGuestMail(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.GuestMail.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterGuestMobile(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.GuestMobile.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterGuestContact(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.GuestContact.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterName1(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Name1.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterAddress1(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Address1.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage selectState1(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IndianFrroRegistartionPage.State1.XPath"), value);
		return this;
	}
	public IndianFrroRegistartionPage selectCity1(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IndianFrroRegistartionPage.City1.XPath"), value);
		return this;
	}
	public IndianFrroRegistartionPage enterEmaild1(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Email1.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterPhone1(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Phone1.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage enterMobile1(String data)
	{
		enterByXpath(prop.getProperty("IndianFrroRegistartionPage.Mobile1.XPath"), data);
		return this;
	}
	public IndianFrroRegistartionPage clickOnAdd() {
		clickByXpath(prop.getProperty("IndianFrroRegistartionPage.Add.XPath"));
		return this;
	}
	
}
