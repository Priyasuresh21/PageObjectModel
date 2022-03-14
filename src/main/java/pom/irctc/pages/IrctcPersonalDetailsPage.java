package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcPersonalDetailsPage extends GenericWrappers {
	
	public IrctcPersonalDetailsPage   waitForPageLoad(long mills)
	{
		waitProperty(1000);
		return this;
	}
	public IrctcPersonalDetailsPage selectTitle(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcPersonalDetailsPage.Title.XPath"), value);
		return this;
	}
	public IrctcPersonalDetailsPage enterFirstName(String data)
	{
		enterByXpath(prop.getProperty("IrctcPersonalDetailsPage.FirstName.XPath"), data);
		return this;
	}
	public IrctcPersonalDetailsPage enterLastName(String data)
	{
		enterByXpath(prop.getProperty("IrctcPersonalDetailsPage.LastName.XPath"), data);
		return this;
	}
	public IrctcPersonalDetailsPage selectCountry(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcPersonalDetailsPage.Country.XPath"), value);
		return this;
	}
	public IrctcPersonalDetailsPage selectState(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcPersonalDetailsPage.State.XPath"), value);
		return this;
	}
	public IrctcPersonalDetailsPage selectGstAsNo(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcPersonalDetailsPage.GSTAsNo.XPath"), value);
		return this;
	}
	public IrctcPersonalDetailsPage verifyHotelName()
	{
		verifyTextContainsByXpath(prop.getProperty("IrctcPersonalDetailsPage.HotelName.XPath"), IrctcHotelDetailsPage.hotelNAme);
		return this;
	}
	public IrctcPersonalDetailsPage verifyHotelPrice()
	{
		verifyTextContainsByXpath(prop.getProperty("IrctcPersonalDetailsPage.Price.XPath"), IrctcHotelDetailsPage.price);
		return this;
	}
	public IrctcPersonalDetailsPage clickOnContinue()
	{
		clickByXpath(prop.getProperty("IrctcPersonalDetailsPage.Continue.XPath"));
		return this;
	}
	
	
	public IrctcPersonalDetailsPage clickOnAgree()
	{
		clickByXpath(prop.getProperty("IrctcPersonalDetailsPage.Agree.XPath"));
		return this;
	}
	public IrctcPersonalDetailsPage clickOnMakePayment()
	{
		clickByXpath(prop.getProperty("IrctcPersonalDetailsPage.Payment.XPath"));
		return this;
	}
	public IrctcPersonalDetailsPage clickOnVerify()
	{
		clickByXpath(prop.getProperty("IrctcPersonalDetailsPage.Verify.XPath"));
		return this;
	}
	public IrctcPersonalDetailsPage verifyOTP(String text)
	{
		verifyTextByXpath(prop.getProperty("IrctcPersonalDetailsPage.VerifyOTP.XPath"), text);
		return this;
	}
	
	public IrctcPersonalDetailsPage selectGstAsYes(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcPersonalDetailsPage.GSTAsYes.XPath"), value);
		return this;
	}
	public IrctcPersonalDetailsPage enterCompanyName(String data)
	{
		enterByXpath(prop.getProperty("IrctcPersonalDetailsPage.CompanyName.XPath"), data);
		return this;
	}
	public IrctcPersonalDetailsPage enterCompanyAddress(String data)
	{
		enterByXpath(prop.getProperty("IrctcPersonalDetailsPage.CompanyAddress.XPath"), data);
		return this;
	}
	
	public IrctcPersonalDetailsPage verifyGSTNumber(String text)
	{
		verifyTextByXpath(prop.getProperty("IrctcPersonalDetailsPage.verifyGST.XPath"), text);
		return this;
	}
	
	
	
	
	
	

}
