package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcRegistrationPage extends GenericWrappers{

	public IrctcRegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.UserName.XPath"), data);
		return this;
		
		
	}
	
	public IrctcRegistrationPage waitForPageLoad(long time) {
		waitProperty(time);
		return this;
	}
	
	public IrctcRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Password.XPath"), data);
		return this;
	}
	
	public IrctcRegistrationPage enterConfrimPassword(String data) {
		
		enterByXpath(prop.getProperty("IrctcRegistrationPage.ConfirmPassword.XPath"),data);
		return this;
	}
	
	public IrctcRegistrationPage clickOnLanguage() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickonLanguage.XPath"));
		return this;
	}
	public IrctcRegistrationPage selectLanguage(String data)
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.SelectLanguage.XPath"),data);
		return this;
	}
	
	public IrctcRegistrationPage clickOnSecurityQues()
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickonSecurityquestion.XPath"));
		return this;
	}
	public IrctcRegistrationPage selectSecurityQues(String data)
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.SelectSecurityquestion.XPath"),data);
		return this;
	}
	
	public IrctcRegistrationPage enterSecurityAns(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.SecurityAnswer.XPath"),data);
		return this;
	}
	public IrctcRegistrationPage clickonPersonalDetails() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.PersonalDetails.XPath"));
		return this;
	}
	public IrctcRegistrationPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.FirstName.XPath"),data);
		return this;
	}
	public IrctcRegistrationPage enterMiddleName(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.MiddleName.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.LastName.XPath"), data);
		return this;
	}
	
	public IrctcRegistrationPage clickOnOccupation()
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickOccupation.XPath"));
		return this;
	}
	
	public IrctcRegistrationPage selectOccupation(String data)
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.SelectOccupation.XPath"),data);
		return this;
	}
	public IrctcRegistrationPage ClickOnDOB()
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickDOB.XPath"));
		return this;
	}
	public IrctcRegistrationPage selectMonth(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcRegistrationPage.SelectMonth.XPath"), value);
		return this;
	}
	
	public IrctcRegistrationPage selectYear(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcRegistrationPage.SelectYear.XPath"), value);
		return this;
	}
	public IrctcRegistrationPage clickOnDate(String data) {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickDate.XPath"),data);
		return this;
	}
	public IrctcRegistrationPage clickOnMartialStatus()
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.MaritalStatus.XPath"));
		return this;
	}
	
	public IrctcRegistrationPage clickOnGender()
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.Gender.XPath"));
		return this;
	}
	public IrctcRegistrationPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Email.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterMobile(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Mobile.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage selectNationality(String value)
	{
	
		selectVisibileTextByxPath(prop.getProperty("IrctcRegistrationPage.Nationality.XPath"), value);
		return this;
	}
	public IrctcRegistrationPage clickOnAddressDetails()
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.AddressDetails.XPath")); 
		return this;
	}
	public IrctcRegistrationPage enterFlatNo(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.FlatNo.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterStreet(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Street.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterArea(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Area.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterPincode(String data)
	{
		
		enterByXPathwithTabKey(prop.getProperty("IrctcRegistrationPage.Pincode.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage selectCity(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcRegistrationPage.City.XPath"), value);
		return this;
	}
	public IrctcRegistrationPage selectPostOfficeCode(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcRegistrationPage.PostOffice.XPath"), value);
		return this;
	} 
	public IrctcRegistrationPage enterPhone(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Phone.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage clickOnOfficeAddress()
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickOfficeAddress.XPath"));
		return this;
	}
	public IrctcRegistrationPage enterOfficeFlatNo(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficeFlatNo.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterOfficeStreet(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficeStreet.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterOfficeArea(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficeArea.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage clickOnSelectCountry()
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickonCountry.XPath"));
		return this;
	}
	public IrctcRegistrationPage selectCountry(String data)
	{
		clickByXpath(prop.getProperty("IrctcRegistrationPage.SelectCountry.XPath"),data);
		return this;
	}
	public IrctcRegistrationPage enterOffPinCode(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficePincode.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterOffState(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficeState.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterOffCity(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Officecity.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterOffPostCode(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficePostCode.XPath"), data);
		return this;
	}
	public IrctcRegistrationPage enterOffPhone(String data)
	{
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OfficePhone.XPath"), data);
		return this;
	}
	
	
	
	

	 
	
	
}
