package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcCovidAlertPage extends GenericWrappers {

	
	public IrctcHomePage clickOnOk() {
		clickByXpath(prop.getProperty("IrctcCovidAlertPage.ClickonOk.XPath"));
		return new IrctcHomePage();
	}
	
	
}
