package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcFindHotelPage extends GenericWrappers {

	public IrctcFindHotelPage waitForPageLoad(long mills)
	{
		waitProperty(1000);
		return this;
	}
	public IrctcHotelDetailsPage clickOnHotel()
	{
		clickByXpath(prop.getProperty("IrctcFindHotelPage.ClickHotel.XPath"));
		return new IrctcHotelDetailsPage();
	}
	
	
}
