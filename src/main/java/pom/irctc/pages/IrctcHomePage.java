package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcHomePage extends GenericWrappers {

	public IrctcHomePage waitForPageLoad(long mills)
	{
		waitProperty(mills);
		return this;
	}
	
	public IrctcRegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("IrctcHomePage.ClickOnRegister.XPath"));
		return new IrctcRegistrationPage();
	}

	public IrctcHomePage mouseHoverOnHolidays() {
		mouseHoverActions("//a[text()=' HOLIDAYS ']");
		return this;
	}
	 
	public IrctcHomePage mouseHoverOnStays() {
		mouseHoverActions("//span[text()='Stays']");
		return this;
	}
	
    public IrctcHomePage ClickOnHolidays() {
	clickByXpath(prop.getProperty("IrctcHomePage.ClickOnHolidays.XPath"));
	return this;
}

    public IrctcHomePage ClickOnStays() {
	clickByXpath(prop.getProperty("IrctcHomePage.ClickOnStays.XPath"));
	return this;
}
	
	public IrctcAccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("IrctcHomePage.clickOnLounge.Xpath"));
		return new IrctcAccommodationPage();
	}
	
	
	
	
}
