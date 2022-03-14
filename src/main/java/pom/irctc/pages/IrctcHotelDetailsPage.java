package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcHotelDetailsPage extends GenericWrappers {
	
	public static String hotelNAme;
	public static String price;
	
	public IrctcHotelDetailsPage waitForPageLoad(long mills)
	{
		waitProperty(1000);
		return this;
	}
	public IrctcHotelDetailsPage switchWindow()
	{
		switchToLastWindow();
		return new IrctcHotelDetailsPage();
	}
	public IrctcHotelDetailsPage getHotelName() {
		hotelNAme= 	getTextByXpath(prop.getProperty("IrctcHotelDetailsPage.HotelName.XPath"));
		return this;
		
		
	}
	
	public IrctcHotelDetailsPage getPrice() {
		price=(prop.getProperty("IrctcHotelDetailsPage.Price.XPath"));
		return this;
		
		
	} 
	
	public IrctcPersonalDetailsPage clickOnContinue()
	{
		clickByXpath(prop.getProperty("IrctcHotelDetailsPage.Continue.XPath"));
		return new IrctcPersonalDetailsPage();
	}
		
	

}
