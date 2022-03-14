package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookSignUpPage extends GenericWrappers {
	
	public FacebookSignUpPage enterFirstname(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.FirstName.XPath"), data);
		return this;
	}
	public FacebookSignUpPage enterSurname(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.LastName.XPath"), data);
		return this;
	}
	public FacebookSignUpPage enterMail(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.Email.XPath"), data);
		return this;
	}
	public FacebookSignUpPage enterMailConfirmation(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.Emailconfirmation.XPath"), data);
		return this;
	}
	public FacebookSignUpPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("FacebookSignUpPage.Password.XPath"), data);
		return this;
	}
	public FacebookSignUpPage selectBirthdayDate(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("FacebookSignUpPage.BirthdayDate.XPath"), value);
		return this;
	}
	public FacebookSignUpPage selectBirthdayMonth(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("FacebookSignUpPage.BirthdayMonth.XPath"), value);
		return this;
	}
	public FacebookSignUpPage selectBirthdayYear(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("FacebookSignUpPage.BirthdayYear.XPath"), value);
		return this;
	}
	public FacebookSignUpPage selectGender()
	{
		clickByXpath(prop.getProperty("FacebookSignUpPage.Gender.XPath"));
		return this;
	}
	
}
