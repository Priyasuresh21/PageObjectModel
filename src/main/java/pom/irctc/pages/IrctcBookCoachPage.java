package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcBookCoachPage extends GenericWrappers {

	public IrctcBookCoachPage switchWindow()
	{
		switchToLastWindow();
		return this;
	}
	public IrctcSignUpRegistartionPage clickSignup()
	{
		
		clickByXpath(prop.getProperty("IrctcBookCoachPage.clickSignup.XPath"));
		return new IrctcSignUpRegistartionPage();	
	}
}
