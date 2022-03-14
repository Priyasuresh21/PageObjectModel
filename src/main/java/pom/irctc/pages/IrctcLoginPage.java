package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcLoginPage extends GenericWrappers {
	
	public IrctcLoginPage waitForPageLoad(long mills)
	{
		waitProperty(mills);
		return this;
	}
	public IrctcLoginPage clickOnGuestUser()
	{
		clickByXpath(prop.getProperty("IrctcLoginPage.ClickGuest.XPath"));
		return this;
	}
	public IrctcLoginPage enterEmail(String data)
	{
		enterByXpath(prop.getProperty("IrctcLoginPage.Email.XPath"), data);
		return this;
	}
	public IrctcLoginPage enterMobile(String data)
	{
		enterByXpath(prop.getProperty("IrctcLoginPage.Mobile.XPath"), data);
		return this;
	}
	public IrctcBookHotelsPage clickOnSignin()
	{
		clickByXpath(prop.getProperty("IrctcLoginPage.SignIn.XPath"));
		return new IrctcBookHotelsPage();
	}
	

}
