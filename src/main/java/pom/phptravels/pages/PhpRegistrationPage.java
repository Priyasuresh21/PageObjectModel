package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class PhpRegistrationPage extends GenericWrappers {
	
	public PhpRegistrationPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.FirstName.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.LastName.XPath"), data);
		return this;
	}

	public PhpRegistrationPage enterMail(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Mail.XPath"), data);
		return this;
	}
	
	public PhpRegistrationPage clickOnCountryCode()
	{
		clickByXpath(prop.getProperty("PhpRegistrationPage.Clickcountrycode.XPath"));
		return this;
	}
	public PhpRegistrationPage selectCountryCode()
	{
		clickByXpath(prop.getProperty("PhpRegistrationPage.Selectcountrycode.XPath"));
		return this;
	}

	public PhpRegistrationPage enterPhoneNo(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.PhoneNumber.XPath"), data);
		return this;
	}
	public PhpRegistrationPage entercompanyName(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Companyname.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterStreet(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Street.XPath"), data);
		return this;
	}
	
	public PhpRegistrationPage enterStreet2(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Street2.XPath"), data);
		return this;
	}
	
	public PhpRegistrationPage enterCity(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.City.XPath"), data);
		return this;
	}
	
	public PhpRegistrationPage enterState(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.State.XPath"), data);
		return this;
	}
	public PhpRegistrationPage enterPostCode(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Postcode.XPath"), data);
		return this;
	}
	public PhpRegistrationPage selectCountry(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("PhpRegistrationPage.Country.XPath"), value);
		return this;
	}
	public PhpRegistrationPage enterMobileNumber(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Mobilenumber.XPath"), data);
		return this;
	}
	
	public PhpRegistrationPage enterPassword(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public PhpRegistrationPage enterConfirmPassword(String data)
	{
		enterByXpath(prop.getProperty("PhpRegistrationPage.ConfirmPassword.XPath"), data);
		return this;
	}
	
	
	
	


}
