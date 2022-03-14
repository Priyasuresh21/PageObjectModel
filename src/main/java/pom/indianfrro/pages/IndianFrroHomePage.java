package pom.indianfrro.pages;

import wrappers.GenericWrappers;

public class IndianFrroHomePage extends GenericWrappers {
	
	public IndianFrroRegistartionPage clickOnSignUp()
	{
		clickByXpath(prop.getProperty("IndianFrroHomePage.Signup.XPath"));
		return new IndianFrroRegistartionPage();
	}

}
