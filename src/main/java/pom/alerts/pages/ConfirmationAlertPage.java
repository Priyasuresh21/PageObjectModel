package pom.alerts.pages;

import wrappers.GenericWrappers;

public class ConfirmationAlertPage extends GenericWrappers {
	
	public ConfirmationAlertPage switchFrame()
	{
		switchToFrameByXPath(prop.getProperty("ConfirmationAlertPage.SwitchFrame.XPath"));
		return this;
	}
	public ConfirmationAlertPage clickOnTryIt()
	{
		clickByXpathNoSnap(prop.getProperty("ConfirmationAlertPage.Clicktry.XPath"));
		return this;
	}
	public ConfirmationAlertPage getTextFromAlert()
	{
		getAlertText();
		return this;
	}
	public ConfirmationAlertPage alertAccept()
	{
		acceptAlert();
		return this;
	}
	public ConfirmationAlertPage verifyTextAlert(String text)
	{
		verifyTextContainsByXpath(prop.getProperty("ConfirmationAlertPage.VerifyAlertText.XPath"), text);
		return this;
	}
	public ConfirmationAlertPage pageRefresh()
	{
		refreshPage();
		return this;
	}
	
	
	public ConfirmationAlertPage alertDismiss()
	{
		dismissAlert();
		return this;
	}
	
	public ConfirmationAlertPage quitFrame()
	{
		closeFrame();
		return this;
	}
	public HomePage clickOnHome()
	{
		clickByXpath(prop.getProperty("ConfirmationAlertPage.ClickHome.XPath"));
		return new HomePage();
	}


}
