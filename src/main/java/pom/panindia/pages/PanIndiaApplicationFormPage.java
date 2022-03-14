package pom.panindia.pages;

import wrappers.GenericWrappers;

public class PanIndiaApplicationFormPage extends GenericWrappers {
	
	public PanIndiaApplicationFormPage selectTitle(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("PanIndiaApplicationFormPage.Title.XPath"), value);
		return this;
	}
	public PanIndiaApplicationFormPage pageDown()
	{
		keysDown();
		return this;
	}
	public PanIndiaApplicationFormPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.FirstName.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterMiddleName(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.MiddleName.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.LastName.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterFatherFirstName(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.FatherFirstName.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterFatherMiddleName(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.FatherMiddleName.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterFatherLastName(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.FatherLastName.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterMobile(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.Mobile.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.Email.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage selectSourceOfIncome(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("PanIndiaApplicationFormPage.SourceOfIncome.XPath"), value);
		return this;
	}
	public PanIndiaApplicationFormPage clickOffice()
	{
		clickByXpath(prop.getProperty("PanIndiaApplicationFormPage.Office.XPath"));
		return this;
	}
	public PanIndiaApplicationFormPage enterDOB(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.DOB.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterHouseNo(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.HouseNo.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterArea(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.Area.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterCity(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.City.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage selectState(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("PanIndiaApplicationFormPage.State.XPath"), value);
		return this;
	}
	public PanIndiaApplicationFormPage enterPinCode(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.Pincode.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterOfficeName(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.OfficeName.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterOfficeFlatNo(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.OfficeFlatNo.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterOfficeArea(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.OfficeArea.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage enterOfficeCity(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.OfficeCity.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage selectOfficeState(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("PanIndiaApplicationFormPage.OfficeState.XPath"), value);
		return this;
	}
	public PanIndiaApplicationFormPage enterOfficePinCode(String data)
	{
		enterByXpath(prop.getProperty("PanIndiaApplicationFormPage.OfficePincode.XPath"), data);
		return this;
	}
	public PanIndiaApplicationFormPage selectIdentityProof(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("PanIndiaApplicationFormPage.IdentityProof.XPath"), value);
		return this;
	}
	public PanIndiaApplicationFormPage selectAddressProof(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("PanIndiaApplicationFormPage.AddressProof.XPath"), value);
		return this;
	}
	public PanIndiaApplicationFormPage selectDOBProof(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("PanIndiaApplicationFormPage.DOBProof.XPath"), value);
		return this;
	}
	public PanIndiaApplicationFormPage selectAadharProof(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("PanIndiaApplicationFormPage.AadharProof.XPath"), value);
		return this;
	}
	public PanIndiaApplicationFormPage selectOfficeAddressProof(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("PanIndiaApplicationFormPage.OfficeProof.XPath"), value);
		return this;
	}
	public PanIndiaApplicationFormPage clickOnAgree()
	{
		clickByXpath(prop.getProperty("PanIndiaApplicationFormPage.Agree.XPath"));
		return this;
	}
	
	
	

}
