package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcCharterPage extends GenericWrappers{
	
	public IrctcCharterPage clickOnEnquiryForm()
	{
		clickByXpath(prop.getProperty("IrctcCharterPage.EnquiryForm.XPath"));
		return this;
	}
	public IrctcCharterPage enterName(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.Name.XPath"), data);
		return this;
	}
	public IrctcCharterPage enterOrganization(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.Organization.XPath"), data);
		return this;
	}
	public IrctcCharterPage enterAddress(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.Address.XPath"), data);
		return this;
	}
	public IrctcCharterPage enterMobile(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.Mobile.XPath"), data);
		return this;
	}
	public IrctcCharterPage enterMail(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.Mail.XPath"), data);
		return this;
	}
	
	public IrctcCharterPage selectRequestFor(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcCharterPage.RequestedFor.XPath"), value);
		return this;
	}
	public IrctcCharterPage enterOriginStation(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.OriginStation.XPath"), data);
		return this;
	}
	
	public IrctcCharterPage enterDestinationStation(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.DestinationStation.XPath"), data);
		return this;
	}
	public IrctcCharterPage clickOnCheckInDate()
	{
		clickByXpath(prop.getProperty("IrctcCharterPage.ClickCheckInDate.XPath"));
		return this;
	}
	public IrctcCharterPage selectCheckInDate(String data)
	{
		clickByXpath(prop.getProperty("IrctcCharterPage.SelectCheckInDate.XPath"),data);
		return this;
	}
	public IrctcCharterPage clickOnCheckOutDate()
	{
		clickByXpath(prop.getProperty("IrctcCharterPage.ClickCheckOutDate.XPath"));
		return this;
	}
	public IrctcCharterPage waitForPageLoad(long mills)
	{
		waitProperty(mills);
		return this;
	}
	
	public IrctcCharterPage pageDown()
	{
		keysDown();
		return  this;
	}
	public IrctcCharterPage selectCheckOutDate(String data)
	{
		clickByXpath(prop.getProperty("IrctcCharterPage.SelectCheckOutDate.XPath"),data);
		return this;
	}
	public IrctcCharterPage enterTourDuration(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.TourDuration.XPath"), data);
		return this;
	}
	public IrctcCharterPage enterCoachDetails(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.CoachDetails.XPath"), data);
		return this;
	}
	public IrctcCharterPage enterNumberOfPassengers(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.NoOfPassengers.XPath"), data);
		return this;
	}
	public IrctcCharterPage enterCharterPurpose(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.CharterPurpose.XPath"), data);
		return this;
	}
	public IrctcCharterPage enterAdditionalServices(String data)
	{
		enterByXpath(prop.getProperty("IrctcCharterPage.AdditionalService.XPath"), data);
		return this;
	}
	
	public IrctcCharterPage clickOnSubmit()
	{
		clickByXpath(prop.getProperty("IrctcCharterPage.Submit.XPath"));
		return this;
	}
	public IrctcCharterPage verifyMobile(String text)
	{
		verifyTextByXpath(prop.getProperty("IrctcCharterPage.VerifyMobile.XPath"), text);
		return this;
	}
	

}
