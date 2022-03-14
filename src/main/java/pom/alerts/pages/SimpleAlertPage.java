package pom.alerts.pages;

import wrappers.GenericWrappers;

public class SimpleAlertPage extends GenericWrappers {
	
	public SimpleAlertPage switchFrame()
	{
		switchToFrameByXPath(prop.getProperty("SimpleAlertPage.SwitchFrame.XPath"));
		return this;
	}
	public SimpleAlertPage clickOnTryIt()
	{
		clickByXpathNoSnap(prop.getProperty("SimpleAlertPage.Clicktry.XPath"));
		return this;
	}
	public SimpleAlertPage getAlertext() {
		
		getAlertText();
		return this;
		
	}
	public SimpleAlertPage alertAccept()
	{
		acceptAlert();
		return this;
	}
	public SimpleAlertPage quitFrame() {
		closeFrame();
		return this;
	}
	
	public HomePage clickOnHome()
	{
		clickByXpath(prop.getProperty("SimpleAlertPage.ClickHome.XPath"));
		return new HomePage();
	}
	

}
