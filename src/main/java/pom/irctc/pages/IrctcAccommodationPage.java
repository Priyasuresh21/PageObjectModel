package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcAccommodationPage extends GenericWrappers {

	
	public IrctcAccommodationPage waitForPageLoad(long mills)
	{
		waitProperty(mills);
		return this;
	}
	public IrctcAccommodationPage switchWindow()
	{
		switchToLastWindow();
		return this;
	}
	public IrctcAccommodationPage clickOnSideBar()
	{
		clickByXpath(prop.getProperty("IrctcAccommodationPage.clickOnSideBar.XPath")); 
		return this;
	}
	public IrctcCharterPage clickOnCharter()
	{
		clickByXpath(prop.getProperty("IrctcAccommodationPage.clickOnCharter.XPath"));
		return new IrctcCharterPage();
	}
	public IrctcBookCoachPage clickOnBookCoach()
	{
		clickByXpath(prop.getProperty("IrctcAccommodationPage.clickOnBookCoach.XPath"));
		return new IrctcBookCoachPage();
	}
	

	
	public IrctcBookHotelsPage clickOnHotels()
	{
		clickByXpath(prop.getProperty("IrctcAccommodationPage.clickOnHotels.XPath"));
		return new IrctcBookHotelsPage();
	}
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	
	
}
