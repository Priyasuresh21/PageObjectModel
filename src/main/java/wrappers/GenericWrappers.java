package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;


public class GenericWrappers extends Reporting implements Wrappers {

	public static RemoteWebDriver driver;
	
	public static Properties prop ;
	
	public void loadObject() {
		
		try {
			prop =  new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void unloadObject() {
		prop=null;
	}
	
	public void invokeApp(String browser, String url)  {
		try {
			// TODO Auto-generated method stub
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				 driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("internetexplorer")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver= new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//System.out.println("The Browser "+browser+" is launched succesfully with given URL " +url);
			reportStep("The Browser "+browser+" is launched succesfully with given URL " +url, "pass");
			
		} catch (InvalidArgumentException e) 
		{
			//System.err.println("The Browser "+browser+" is not launched as URL"+url+"doesn't having http/https");
			reportStep("The Browser "+browser+" is not launched as URL"+url+"doesn't having http/https", "fail");
		}
		catch(SessionNotCreatedException e)
		{
			//System.err.println("The Browser "+browser+" is not launched with the url " + url+ " due to session not created error" );
			reportStep("The Browser "+browser+" is not launched with the url " + url+ " due to session not created error" , "fail");
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("The Browser "+browser+" is not launched due to unknown error");
			reportStep("The Browser "+browser+" is not launched due to unknown error", "Fail");
		}
		
	}

	public void enterById(String idValue, String data) {
		try {
			// TODO Auto-generated method stub
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The Element with id "+idValue+" is entered with data " +data);
			reportStep("The Element with id "+idValue+" is entered with data " +data, "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+idValue+" is not found in DOM");
			reportStep("The Element with id "+idValue+" is not found in DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+idValue+" is not visible in the application");
			reportStep("The Element with id "+idValue+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+idValue+" is not interactable in the application");
			reportStep("The Element with id "+idValue+" is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+idValue+" is not stable in the application");
			reportStep("The Element with id "+idValue+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+idValue+" is not entered with data" +data+ "  due to unkown error");
			reportStep("The Element with id "+idValue+" is not entered with data" +data+ "  due to unkown error", "Fail");
		}
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The Element with id "+nameValue+" is entered with data " +data);
			reportStep("The Element with id "+nameValue+" is entered with data " +data, "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			//System.err.println("The Element with id "+nameValue+" is not found in the DOM");
			reportStep("The Element with id "+nameValue+" is not found in the DOM", "Fail");
			// TODO: handle exception
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+nameValue+" is not visible in the application");
			reportStep("The Element with id "+nameValue+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+nameValue+" is not interactable in the application");
			reportStep("The Element with id "+nameValue+" is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+nameValue+" is not stable in the application");
			reportStep("The Element with id "+nameValue+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+nameValue+" is not entered with data "+ data+ " due to unknown error");
			reportStep("The Element with id "+nameValue+" is not entered with data "+ data+ " due to unknown error", "Fail");
		}
		
		
	}

	public void enterByXpath(String xpathValue, String data) {
		try {
			// TODO Auto-generated method stub
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The Element with id "+xpathValue+" is enetered with data " +data);
			reportStep("The Element with id "+xpathValue+" is enetered with data " +data, "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+xpathValue+" is not found in the DOM");
			reportStep("The Element with id "+xpathValue+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+xpathValue+" is not visible in the application");
			reportStep("The Element with id "+xpathValue+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+xpathValue+" is not interactable in the application");
			reportStep("The Element with id "+xpathValue+" is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+xpathValue+" is not stable in the application");
			reportStep("The Element with id "+xpathValue+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+xpathValue+" is not entered with data " +data+ " due to unknown error");
			reportStep("\"The Element with id \"+xpathValue+\" is not entered with data \" +data+ \" due to unknown error\"", "Fail");
		}
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
			String appTitle = driver.getTitle();
			if (appTitle.equals(title)) 
			{
				//System.out.println("The Application title " + appTitle + " is matched with expected title " + title);
				reportStep("The Application title " + appTitle + " is matched with expected title " + title, "Pass");
			} else 
			{
				//System.err.println("The Application title " + appTitle + " is not matched with expected title " + title);
				reportStep("The Application title " + appTitle + " is not matched with expected title " + title, "Fail");
			} 
				
		} 
		catch (WebDriverException e) 
		{
			// TODO: handle exception
			//System.err.println("The Title" +title+ " is not verified in the application due to unknown error" );
			reportStep("The Title" +title+ " is not verified in the application due to unknown error", "Fail");
		}
		
		
		
		
	}

	public void verifyTextById(String id, String text) {
		try {
			// TODO Auto-generated method stub
			String actualText = driver.findElementById(id).getText();
			if (text.equals(actualText)) {
				//System.out.println("The application text " + actualText + " is matched with the expected text " + text);
				reportStep("The application text " + actualText + " is matched with the expected text " + text, "Pass");
			} else {
				//System.err.println("The application text " + actualText + " is not matched with the expected text " + text);
				reportStep("The application text " + actualText + " is not matched with the expected text " + text, "Fail");
			} 
		} 
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The ELement with id "+id+" is not visible in the application");
			reportStep("The Element with id "+id+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+id+" is not interactable in the application");
			reportStep("The Element with id "+id+" is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+id+" couldn't verify with the data "+text+" due to unknown error");
			reportStep("The Element with id "+id+" couldn't verify with the data "+text+" due to unknown error", "Fail");
		}
		
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualText = driver.findElementByXPath(xpath).getText();
			if (actualText.equals(text)) 
			{
				//System.out.println("The Element with id "+xpath+ " holding the application text " + actualText + " is matched with the expected text " + text);
				reportStep("The Element with id "+xpath+ " holding the application text " + actualText + " is matched with the expected text " + text, "Pass");
			} else 
			{
				//System.err.println("The Element with id "+xpath+ " holding the application text " + actualText + " is not matched with the expected text " + text);
				reportStep("The Element with id "+xpath+ " holding the application text " + actualText + " is not matched with the expected text " + text, "Fail");
			} 
			
		} 
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+xpath+" is not found in the DOM");
			reportStep("The Element with id "+xpath+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The ELement with id "+xpath+" is not visible in the application");
			reportStep("The ELement with id "+xpath+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+xpath+" is not interactable in the application");
			reportStep("The Element with id "+xpath+" is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+xpath+" is not stable in the application");
			reportStep("The Element with id "+xpath+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+xpath+ "couldn't verify with the data "+text+" due to unknown error");
			reportStep("The Element with id "+xpath+ "couldn't verify with the data "+text+" due to unknown error", "Fail");
		}
		
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			// TODO Auto-generated method stub
			String appText = driver.findElementByXPath(xpath).getText();
			if (appText.contains(text)) 
			{
				//System.out.println(" The Element with id "+xpath+" holding the application Text " + appText + " contains the expected text " + text);
				reportStep(" The Element with id "+xpath+" holding the application Text " + appText + " contains the expected text ", "Pass");
			} else 
			{
				//System.err.println(" The Element with id "+xpath+" holding the application Text " + appText + " does not contains the expected text " + text);
				reportStep(" The Element with id "+xpath+" holding the application Text " + appText + " does not contains the expected text ", "Fail");
			} 
			
		} 
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+xpath+" is not found in the DOM");
			reportStep("The Element with id "+xpath+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The ELement with id "+xpath+" is not visible in the application");
			reportStep("The Element with id "+xpath+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+xpath+" is not interactable in the application");
			reportStep("The Element with id "+xpath+" is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+xpath+" is not stable in the application");
			reportStep("The Element with id "+xpath+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+xpath+" can't verify with the data "+text+" due to unknown error");
			reportStep("The Element with id "+xpath+" can't verify with the data "+text+" due to unknown error", "Fail");
		}
		
	}

	public void clickById(String id) {
		try {
			// TODO Auto-generated method stub
			driver.findElementById(id).click();
			//System.out.println("The Element with id "+id+" is clicked successfully");
			reportStep("The Element with id "+id+" is clicked successfully", "Pass");
			
		}
		
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+id+" is not found in the DOM");
			reportStep("The Element with id "+id+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The ELement with id "+id+" is not visible in the application");
			reportStep("The ELement with id "+id+" is not visible in the application", "Fail");
		}
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with id "+id+" is not interactable while click in the application");
			reportStep("The Element with id "+id+" is not interactable while click in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+id+" is not stable in the application");
			reportStep("The Element with id "+id+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+id+" is not able to click due to unknown error");
			reportStep("The Element with id "+id+" is not able to click due to unknown error", "Fail");
		}
		
	}

	public void clickByClassName(String classVal) {
		try 
		{
			// TODO Auto-generated method stub
			driver.findElementByClassName(classVal).click();
			//System.out.println("The Element with id "+classVal+" is clicked succesfully");
			reportStep("The Element with id "+classVal+" is clicked succesfully", "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+classVal+" is not found in the DOM");
			reportStep("The Element with id "+classVal+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The ElEment with id "+classVal+" is not visible in the application");
			reportStep("The Element with id "+classVal+" is not visible in the application", "Fail");
		}
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with id "+classVal+" is not interactable while click in the application");
			reportStep("The Element with id "+classVal+" is not interactable while click in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+classVal+" is not stable in the application");
			reportStep("The Element with id "+classVal+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+classVal+" is not able to click due to unknown error");
			reportStep("The Element with id "+classVal+" is not able to click due to unknown error", "Fail");
		}
		
	}

	public void clickByName(String name) {
		try 
		{
			// TODO Auto-generated method stub
			driver.findElementByName(name).click();
			//System.out.println("The Element with id "+name+" is successfully clicked in the application");
			reportStep("The Element with id "+name+" is successfully clicked in the application", "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+name+" is not found in the DOM");
			reportStep("The Element with id "+name+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+name+" is not visible in the application");
			reportStep("The Element with id "+name+" is not visible in the application", "Fail");
		}
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with id "+name+" is not interactable while click in the application");
			reportStep("The Element with id "+name+" is not interactable while click in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+name+" is not stable in the application");
			reportStep("The Element with id "+name+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+name+" is not able to click due to unknown error");
			reportStep("The Element with id "+name+" is not able to click due to unknown error", "Fail");
		}
		
	}

	public void clickByLink(String name) {
		try 
		{
			// TODO Auto-generated method stub
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with id "+name+" is clicked successfully");
			reportStep("The Element with id "+name+" is clicked successfully", "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			
			//System.err.println("The Element with id "+name+" is not found in the DOM");
			reportStep("The Element with id "+name+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+name+" is not visible in the application");
			reportStep("The Element with id "+name+" is not visible in the application", "Fail");
		}
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The EleMent with id "+name+" is not interactable while click in the application");
			reportStep("The EleMent with id "+name+" is not interactable while click in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+name+" is not stable in the application");
			reportStep("The Element with id "+name+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+name+" is not able to click due to unknown error");
			reportStep("The Element with id "+name+" is not able to click due to unknown error", "Fail");
		}
		
		
	}

	public void clickByLinkNoSnap(String name) {
		try {
			// TODO Auto-generated method stub
			driver.findElementByLinkText(name).click();
			//System.out.println("The Element with id" +name+" is clicked successfully");
			reportStep("The Element with id" +name+" is clicked successfully", "Pass",false);
		} 
		catch (NoSuchElementException e) 
		{
			
			//System.err.println("The ElemeNt with id "+name+" is not found in the DOM");
			reportStep("The ElemeNt with id "+name+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+name+" is not visible in the application");
			reportStep("The Element with id "+name+" is not visible in the application", "Fail");
		}
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with id "+name+" is not interactable while click in the application");
			reportStep("The Element with id "+name+" is not interactable while click in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+name+" is not stable in the application");
			reportStep("The Element with id "+name+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+name+" is not able to click due to unknown error");
			reportStep("The Element with id "+name+" is not able to click due to unknown error", "Fail");
		}
	}

	public void clickByXpath(String...xpathVal) {
		// TODO Auto-generated method stub
		String xpath=null;
		try 
		{
			
			if(xpathVal[0].contains("$data$")) {
				
				/*System.out.println(xpathVal.length);
				System.out.println(xpathVal[0]);
				System.out.println(xpathVal[1]);*/
				
				xpath=xpathVal[0].replace("$data$", xpathVal[1]);
				//System.out.println(xpath);
			} else {
				xpath=xpathVal[0];
			}
			
			
			driver.findElementByXPath(xpath).click();
			//System.out.println("The Element with id "+xpathVal+" is successfully clicked in the application");
			reportStep("The Element with id "+xpath+" is successfully clicked in the application", "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			
			//System.err.println("The Element with id "+xpathVal+" is not found in the DOM");
			reportStep("The Element with id "+xpath+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not visible in the application");
			reportStep("The Element with id "+xpath+" is not visible in the application", "Fail");
		}
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not interactable while click in the application");
			reportStep("The Element with id "+xpath+" is not interactable while click in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not stable in the application");
			reportStep("The Element with id "+xpath+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not able to click in the app due to unknown error");
			e.printStackTrace();
			reportStep("The Element with id "+xpath+" is not able to click in the app due to unknown error", "Fail");
		}
	
		
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		try 
		{
			// TODO Auto-generated method stub
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element with id "+xpathVal+"is successfully clicked in the application");
			reportStep("The Element with id "+xpathVal+"is successfully clicked in the application", "Pass",false);
		} 
		catch (NoSuchElementException e) 
		{
			//System.err.println("The Element with id "+xpathVal+" is not found in the DOM");
			reportStep("The Element with id "+xpathVal+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not visible in the application");
			reportStep("The Element with id "+xpathVal+" is not visible in the application", "Fail");
		}
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not interactable while click in the application");
			reportStep("The Element with id "+xpathVal+" is not interactable while click in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not stable in the application");
			reportStep("The Element with id "+xpathVal+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not able to click in the app due to unknown error");
			reportStep("The Element with id "+xpathVal+" is not able to click in the app due to unknown error", "Fail");
		}
	}

	public String getTextById(String idVal) {
		
		String appText=null;
		try {
			// TODO Auto-generated method stub
			appText = driver.findElementById(idVal).getText();
			//System.out.println("The Application text "+appText+" has been retrieved successfully using the element with id "+idVal);
			reportStep("The Application text "+appText+" has been retrieved successfully using the element with id "+idVal, "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			
			//System.err.println("The ElemeNt with id "+idVal+" is not found in the DOM");
			reportStep("The ElemeNt with id "+idVal+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+idVal+" is not visible in the application");
			reportStep("The Element with id "+idVal+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+idVal+" is not interactable in the application");
			reportStep("The Element with id "+idVal+" is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+idVal+" is not stable in the application");
			reportStep("The Element with id "+idVal+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Application text has not been retrived successfully using the element with id " + idVal);
			reportStep("The Application text has not been retrived successfully using the element with id " + idVal, "Fail");
		}
		
		return appText;
	}

	public String getTextByXpath(String xpathVal) {
		String appText=null;
		try {
			appText = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The Application text "+appText+" has been retrived successfully using the element with id" + xpathVal);
			reportStep("The Application text "+appText+" has been retrived successfully using the element with id" + xpathVal, "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			//System.err.println("The ElemeNt with id "+xpathVal+" is not found in the DOM");
			reportStep("The ElemeNt with id "+xpathVal+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not visible in the application");
			reportStep("The Element with id "+xpathVal+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not interactable in the application");
			reportStep("The Element with id "+xpathVal+" is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+xpathVal+" is not stable in the application");
			reportStep("The Element with id "+xpathVal+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The App text has not been retrived successfully using the element with id "+xpathVal+ " due to unknown error");
			reportStep("The App text has not been retrived successfully using the element with id "+xpathVal+ " due to unknown error", "Fail");
		}
		
		return appText;
	}

	public void selectVisibileTextById(String id, String value) {
		try {
			// TODO Auto-generated method stub
			WebElement element = driver.findElementById(id);
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
			//System.out.println("The Element with id " + id + " has been selected with the Value "+ value + " successfully from the dropdown");
			reportStep("The Element with id " + id + " has been selected with the Value "+ value + " successfully from the dropdown", "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			//System.err.println("The ElemeNt with " +id+ " is not found in the DOM");
			reportStep("The ElemeNt with " +id+ " is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with "+id+ " is not visible in the application");
			reportStep("The Element with "+id+ " is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with "+id+ " is not interactable in the application");
			reportStep("The Element with "+id+ " is not interactable in the application", "Fail");
		}
		catch(ElementNotSelectableException e)
		{
			//System.err.println("The Element with id " + id + " has not been selected with the Value "+ value + " successfully from the dropdown beacuse of disabled dropdown");
			reportStep("The Element with id " + id + " has not been selected with the Value "+ value + " successfully from the dropdown beacuse of disabled dropdown", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with "+id+" is not stable in the application");
			reportStep("The Element with "+id+" is not stable in the application", "Fail");
			
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id " + id + " has not been selected with the Value "+ value + " successfully from the dropdown due to unknowm error");
			reportStep("The Element with id " + id + " has not been selected with the Value "+ value + " successfully from the dropdown due to unknowm error", "Fail");
		}
		
		
	}

	public void selectIndexById(String id, int value) {
		try {
			// TODO Auto-generated method stub
			WebElement element = driver.findElementById(id);
			Select sel = new Select(element);
			sel.selectByIndex(value);
			//System.out.println("The Element with id " + id + " has been selected with the Value "+ value + " successfully from the dropdown");
			reportStep("The Element with id " + id + " has been selected with the Value "+ value + " successfully from the dropdown", "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			//System.err.println("The ElemeNt with " +id+ " is not found in the DOM");
			reportStep("The ElemeNt with " +id+ " is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with "+ id+ " is not visible in the application");
			reportStep("The Element with "+ id+ " is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with " +id+ " is not interactable in the application");
			reportStep("The Element with " +id+ " is not interactable in the application", "Fail");
		}
		catch(ElementNotSelectableException e)
		{
			//System.err.println("The Element with id " + id + " has not been selected with the Value "+ value + " successfully from the dropdown because of disabled dropdown");
			reportStep("The Element with id " + id + " has not been selected with the Value "+ value + " successfully from the dropdown because of disabled dropdown", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id" +id+ " is not stable in the application");
			reportStep("The Element with id" +id+ " is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id " + id + " has not been selected with the Value "+ value + " successfully due to unknowm error");
			reportStep("The Element with id " + id + " has not been selected with the Value "+ value + " successfully due to unknowm error", "Fail");
		}
		
		
	}

	public void switchToParentWindow() {
		try {
			// TODO Auto-generated method stub
			Set<String> windows = driver.getWindowHandles();
			for (String eachId : windows) {
				driver.switchTo().window(eachId);
				//System.out.println("Switched to parent window successfully");
				reportStep("Switched to parent window successfully", "Pass");
				break;
			} 
		} 
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("Cant switched to parent window due to no such window is available");
			reportStep("Cant switched to parent window due to no such window is available", "Fail");
		}
		catch (WebDriverException e) 
		{
			// TODO: handle exception
			//System.err.println("Switched to parent window is not successful due to unknown error");
			reportStep("Switched to parent window is not successful due to unknown error", "Fail");
		}
		
		
	}

	public void switchToLastWindow() {
		try {
			// TODO Auto-generated method stub
			Set<String> windows = driver.getWindowHandles();
			for (String eachId : windows) {
				driver.switchTo().window(eachId);
			} 
			//System.out.println("Switched to Last window successfully");
			reportStep("Switched to Last window successfully", "Pass");
		} 
		catch (NoSuchWindowException e) 
		{
			//System.err.println("Cant switched to parent window due to no such window is available");
			reportStep("Cant switched to parent window due to no such window is available", "Fail");
		}
		catch (WebDriverException e) 
		{
			//System.err.println("Switched to parent window is not successful due to unknown error");
			reportStep("Switched to parent window is not successful due to unknown error", "Fail");
		}
		
		
		
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Alert is accepted successfully");
			reportStep("Alert is accepted successfully", "Pass",false);
		} 
	
		
		catch(WebDriverException e)
		{
			//System.err.println("Alert is  not accepted successfully due to unknown error");
			reportStep("Alert is  not accepted successfully due to unknown error", "Fail");
		}
		
		
	}

	public void dismissAlert() {
		try {
			// TODO Auto-generated method stu
			driver.switchTo().alert().dismiss();
			//System.out.println("Alert is dismissed successfully");
			reportStep("Alert is dismissed successfully", "Pass",false);
		}  
		
		catch(WebDriverException e)
		{
			//System.err.println("Alert is not dismissed successfully due to unknown error");
			reportStep("Alert is not dismissed successfully due to unknown error", "Fail");
		}
		
		
	}

	public String getAlertText() {
	
		String alertText=null;
		try {
			// TODO Auto-generated method stub

			 alertText = driver.switchTo().alert().getText();
			//System.out.println("Alert message is "+alertText +" is retrieved successfully");
			 reportStep("Alert message is "+alertText +" is retrieved successfully", "Pass",false);
		} 
	
		catch(WebDriverException e)
		{
			//System.err.println("Alert message is not retrieved successfully due to unknown error");
			reportStep("Alert message is not retrieved successfully due to unknown error", "Fail");
		}
		
		return alertText;
	}

	public long takeSnap() {
		
		long number = 0;
		try {
			
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			
			
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(tmp, dest);
			//System.out.println("Screenshot took successfully");
			//reportStep("Screenshot took successfully", "Pass");
		} 
		catch (IOException e) 
		{
			// TODO: handle exception
			//System.err.println("Screenshot didnt take due to IO exception");
			reportStep("Screenshot didnt take due to IO exception", "Fail", false);
		}
		catch(WebDriverException e)
		{
			//System.err.println("Screenshot didnt take due to unknown error");
			reportStep("Screenshot didnt take due to unknown error", "Fail", false);
		}
		
		return number;
	}

	public void closeBrowser() {
		try {
			// TODO Auto-generated method stub
			driver.close();
			//System.out.println("Active browser has been closed successfully");
			reportStep("Active browser has been closed successfully", "Pass", false);
		} catch (WebDriverException e) 
		{
			// TODO: handle exception
			//System.err.println("Browser has not been closed due to unknown error");
			reportStep("Browser has not been closed due to unknown error", "Fail", false);
		}
		
		
	}

	public void closeAllBrowsers() {
		try {
			// TODO Auto-generated method stub
			driver.quit();
			//System.out.println("All opened browsers has been closed successfully");
			reportStep("All opened browsers has been closed successfully", "Pass", false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Browser has not been closed due to unknown error");
			reportStep("Browser has not been closed due to unknown error", "Fail", false);
		}
		
		
	}

	public void waitProperty(long mills) {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(mills);
			//System.out.println("Waited has been done succesfully for "+mills+ " milliseconds");
			//reportStep("Waited has been done successfully for "+mills+ " milliseconds", "Pass");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("Waited is not done succesfully due to Interrupted exception");
			//reportStep("Waited is not done succesfully due to Interrupted exception", "Fail");
		}
		
	}

	public void selectVisibileTextByxPath(String xPath, String value) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			WebElement element = driver.findElementByXPath(xPath);
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
			//System.out.println("The Element with id " + xPath + " has been selected with the Value "+ value + " successfully from the dropdown");
			reportStep("The Element with id " + xPath + " has been selected with the Value "+ value + " successfully from the dropdown", "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			//System.err.println("The ElemeNt with " +xPath+ " is not found in the DOM");
			reportStep("The ElemeNt with " +xPath+ " is not found in the DOM", "Fail");
		}
		
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with "+xPath+ " is not visible in the application");
			reportStep("The Element with "+xPath+ " is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with "+xPath+ " is not interactable in the application");
			reportStep("The Element with "+xPath+ " is not interactable in the application", "Fail");
		}
		catch(ElementNotSelectableException e)
		{
			//System.err.println("The Element with id " + xPath + " has not been selected with the Value "+ value + " successfully from the dropdown beacuse of disabled dropdown");
			reportStep("The Element with id " + xPath + " has not been selected with the Value "+ value + " successfully from the dropdown beacuse of disabled dropdown", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with "+xPath+" is not stable in the application");
			reportStep("The Element with "+xPath+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id " + xPath + " has not been selected with the Value "+ value + " successfully from the dropdown due to unknowm error");
			reportStep("The Element with id " + xPath + " has not been selected with the Value "+ value + " successfully from the dropdown due to unknowm error", "Fail");
		}
		
	
		
	}

	public void enterByNameWithTabKey(String name, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).sendKeys(data,Keys.TAB);
			//System.out.println("The Element with id "+name+" is entered with data " +data);
			reportStep("The Element with id "+name+" is entered with data " +data, "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			//System.err.println("The Element with id "+name+" is not found in the DOM");
			// TODO: handle exception
			reportStep("The Element with id "+name+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+name+" is not visible in the application");
			reportStep("The Element with id "+name+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+name+" is not interactable in the application");
			reportStep("The Element with id "+name+" is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+name+" is not stable in the application");
			reportStep("The Element with id "+name+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+name+" is not entered with data "+ data+ " due to unknown error");
			reportStep("The Element with id "+name+" is not entered with data "+ data+ " due to unknown error", "Fail");
		}
		
		
	

		
		
		
	}

	public void keysDown() {
		try {
			// TODO Auto-generated method stub
			driver.findElementByXPath("//html/body").sendKeys(Keys.DOWN);
			//System.out.println("Pages are down successfully");
			//reportStep("Pages are down successfully", "Pass");
		} 
		
		catch(WebDriverException e)
		{
			//System.err.println("Pages are not down due to unknown error");
			//reportStep("Pages are not down due to unknown error", "Fail");
		}
	}

	public void switchToFrame(String frameid) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(frameid);
			
			//System.out.println("Switched to frame successfully");
			reportStep("Switched to frame successfully", "Pass",false);
		} catch (NoSuchFrameException e) {
			
			//System.err.println("Element with id "+ frameid+ "is not found in the DOM");
			reportStep("Element with id "+ frameid+ "is not found in the DOM", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("Switched to frame is not successful due to unknown error");
			reportStep("Switched to frame is not successful due to unknown error", "Fail");
		}
		
	}

	public void refreshPage() {
		try {
			// TODO Auto-generated method stub
			driver.navigate().refresh();
			//System.out.println("Page refreshed successfully");
			reportStep("Page refreshed successfully", "Pass");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Page refreshed is successful due to unknown error");
			reportStep("Page refreshed is successful due to unknown error", "Fail");
		}
	}

	public void closeFrame() {
		try {
			// TODO Auto-generated method stub
			driver.switchTo().defaultContent();
			//System.out.println("Switched to default content is successful");
			reportStep("Switched to default content is successful", "Pass",false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Switched to default content is not successful");
			reportStep("Switched to default content is not successful", "Fail");
		}
	}

	public void sendAlertText(String value) {
		try {
			// TODO Auto-generated method stub
			driver.switchTo().alert().sendKeys(value);
			//System.out.println("The Value " + value+" has been entered successfully");
			reportStep("The Value " + value+" has been entered successfully", "Pass",false);
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.out.println("The Value " + value+" has not been entered successfully due to unknown error");
			reportStep("The Value " + value+" has not been entered successfully due to unknown error", "Fail");
		}
	}

	public void verifyTextNotContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
	
			try {
				// TODO Auto-generated method stub
				String appText = driver.findElementByXPath(xpath).getText();
				if (!appText.contains(text)) 
				{
					//System.out.println(" The Element with id "+xpath+" holding the application Text " + appText + " does not contains the expected text " + text);
					reportStep(" The Element with id "+xpath+" holding the application Text " + appText + " does not contains the expected text " + text, "Pass");
				} else 
				{
					//System.err.println(" The Element with id "+xpath+" holding the application Text " + appText + "  contains the expected text " + text);
					reportStep(" The Element with id "+xpath+" holding the application Text " + appText + "  contains the expected text " + text, "Fail");
				} 
				
			} 
			catch (NoSuchElementException e) 
			{
				// TODO: handle exception
				//System.err.println("The Element with id "+xpath+" is not found in the DOM");
				reportStep("The Element with id "+xpath+" is not found in the DOM", "Fail");
			}
			catch(ElementNotVisibleException e)
			{
				//System.err.println("The ELement with id "+xpath+" is not visible in the application");
				reportStep("The ELement with id "+xpath+" is not visible in the application", "Fail");
			}
			catch(ElementNotInteractableException e)
			{
				//System.err.println("The Element with id "+xpath+" is not interactable in the application");
				reportStep("The Element with id "+xpath+" is not interactable in the application", "Fail");
			}
			catch(StaleElementReferenceException e)
			{
				//System.err.println("The Element with id "+xpath+" is not stable in the application");
				reportStep("The Element with id "+xpath+" is not stable in the application", "Fail");
			}
			catch(WebDriverException e)
			{
				//System.err.println("The Element with id "+xpath+" can't verify with the data "+text+" due to unknown error");
				reportStep("The Element with id "+xpath+" can't verify with the data "+text+" due to unknown error", "Fail");
			}
			
	}

	public void mouseHoverActions(String xpath) {
		// TODO Auto-generated method stub
		
		try {
			Actions builder =new Actions (driver);
			WebElement element= driver.findElementByXPath(xpath);
			builder.moveToElement(element).perform();
			//System.out.println("Moved to Element Successfully");
			reportStep("Moved to Element Successfully", "Pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("Element with Xpath "+ xpath+ "is not found in the DOM");
			reportStep("Element with Xpath "+ xpath+ "is not found in the DOM", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("Mouse Hover function is not successful due to unknown error");
			reportStep("Mouse Hover function is not successful due to unknown error", "Fail");
		}
		
		
		
		
	}

	public void enterByXPathwithTabKey(String xpath, String data) {
		try {
			// TODO Auto-generated method stub
			driver.findElementByXPath(xpath).sendKeys(data, Keys.TAB);
			//System.out.println("The Element with id "+xpath+" is enetered with data " +data);
			reportStep("The Element with id "+xpath+" is enetered with data " +data, "Pass");
		} 
		catch (NoSuchElementException e) 
		{
			// TODO: handle exception
			//System.err.println("The Element with id "+xpath+" is not found in the DOM");
			reportStep("The Element with id "+xpath+" is not found in the DOM", "Fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Element with id "+xpath+" is not visible in the application");
			reportStep("The Element with id "+xpath+" is not visible in the application", "Fail");
		}
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element with id "+xpath+" is not interactable in the application");
			reportStep("The Element with id "+xpath+" is not interactable in the application", "Fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element with id "+xpath+" is not stable in the application");
			reportStep("The Element with id "+xpath+" is not stable in the application", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The Element with id "+xpath+" is not entered with data " +data+ " due to unknown error");
			reportStep("The Element with id "+xpath+" is not entered with data " +data+ " due to unknown error", "Fail");
		}
		
	}
	
	public void switchToFrameByXPath(String Xpathval) {
		// TODO Auto-generated method stub
		try {
			WebElement element=driver.findElementByXPath(Xpathval);
			driver.switchTo().frame(element);
			
			//System.out.println("Switched to frame successfully");
			reportStep("Switched to frame successfully", "Pass",false);
		} catch (NoSuchFrameException e) {
			
			//System.err.println("Element with Xpath "+ Xpathval+ "is not found in the DOM");
			reportStep("Element with Xpath "+ Xpathval+ "is not found in the DOM", "Fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("Switching to frame is not successful due to unknown error");
			reportStep("Switching to frame is not successful due to unknown error", "Fail");
		}
		
	}


}
