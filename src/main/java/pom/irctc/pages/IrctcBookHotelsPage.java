package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcBookHotelsPage extends GenericWrappers {
	
	
	public IrctcBookHotelsPage waitForPageLoad(long mills)
	{
		waitProperty(mills);
		return this;
	}
	public IrctcLoginPage clickOnLogin()
	
	{
	clickByXpath(prop.getProperty("IrctcBookHotelsPage.Login.XPath"));	
	return new IrctcLoginPage();
	}
	
	public IrctcBookHotelsPage switchToWindow()
	{
		switchToLastWindow();
		return this;
	}
	public IrctcBookHotelsPage enterCity(String data)
	{
		enterByXpath(prop.getProperty("IrctcBookHotelsPage.City.XPath"), data);
		return this;
	}
	public IrctcBookHotelsPage clickOnCity()
	{
		clickByXpath(prop.getProperty("IrctcBookHotelsPage.SelectCity.XPath"));
		return this;
	}
	public IrctcBookHotelsPage clickOnCheckInDate()
	{
		clickByXpath(prop.getProperty("IrctcBookHotelsPage.ClickCheckInDate.XPath"));
		return this;
	}
	public IrctcBookHotelsPage selectCheckInDate(String data)
	{
		clickByXpath(prop.getProperty("IrctcBookHotelsPage.SelectCheckInDate.XPath"), data);
		return this;
	}
	public IrctcBookHotelsPage clickOnCheckOutDate()
	{
		clickByXpath(prop.getProperty("IrctcBookHotelsPage.ClickCheckOutDate.XPath"));
		return this;
	}
	public IrctcBookHotelsPage selectCheckOutDate(String data)
	{
		clickByXpath(prop.getProperty("IrctcBookHotelsPage.SelectCheckOutDate.XPath"), data);
		return this;
	}
	public IrctcBookHotelsPage clickOnGuest()
	{
		clickByXpath(prop.getProperty("IrctcBookHotelsPage.Guest.XPath"));
		return this;
	}
	public IrctcBookHotelsPage selectRoom(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcBookHotelsPage.Room.XPath"), value);
		return this;
	}
	public IrctcBookHotelsPage selectAdult(String value)
	{
		selectVisibileTextByxPath(prop.getProperty("IrctcBookHotelsPage.Adult.XPath"), value);
		return this;
	}
	public IrctcBookHotelsPage clickOnDone()
	{
		clickByXpath(prop.getProperty("IrctcBookHotelsPage.Done.XPath"));
		return this;
	}
	public IrctcFindHotelPage clickOnGetHotel()
	{
		clickByXpath(prop.getProperty("IrctcBookHotelsPage.GetHotel.XPath"));
		return new IrctcFindHotelPage();
	}
	
	

}
