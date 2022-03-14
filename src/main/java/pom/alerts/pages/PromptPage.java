package pom.alerts.pages;

import wrappers.GenericWrappers;

public class PromptPage extends GenericWrappers {
	
	public PromptPage switchFrame()
	{
		switchToFrameByXPath(prop.getProperty("PromptPage.SwitchFrame.XPath"));
		return this;
	}
	public PromptPage clickOnTryIt()
	{
		clickByXpathNoSnap(prop.getProperty("PromptPage.Clicktry.XPath"));
		return this;
	}
	public PromptPage alertTextSend(String value)
	{
		sendAlertText(value);
		return this;
	}
	public PromptPage alertTextGet() {
		getAlertText();
		return this;
	}
	public PromptPage alertAccept() {
		acceptAlert();
		return this;
	}
	public PromptPage verifyText(String text)
	{
		verifyTextContainsByXpath(prop.getProperty("PromptPage.VerifyAlertText.XPath"), text);
		return this;
	}
	public PromptPage pageRefresh()
	{
		refreshPage();
		return this;
	}
	
	public PromptPage alertDismiss()
	{
		dismissAlert();
		return  this;
	}
	public PromptPage verifyTextNotContains(String text)
	{
		verifyTextNotContainsByXpath(prop.getProperty("PromptPage.VerifyNotContainsAlertText.XPath"), text);
		return this;
	}
	public PromptPage quitFrame()
	{
		closeFrame();
		return this;
	}
	public HomePage clickOnHome()
	{
		clickByXpath(prop.getProperty("PromptPage.ClickHome.XPath"));
		return new HomePage();
	}
	
	

}
