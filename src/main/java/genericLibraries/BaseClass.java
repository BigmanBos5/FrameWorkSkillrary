package genericLibraries;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.CoreJavaForSeleniumPage;
import pompages.CoreJavaVideoPlay;
import pompages.HomePagePom;
import pompages.SeleniumTrainingPagePom;
import pompages.SkillraryDemoAppPagePom;
import pompages.TestingPage;

public class BaseClass {
	
	protected PropertiesFileUtility property;
	protected ExccelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePagePom home;
	protected SkillraryDemoAppPagePom skillraryDemo;
	protected ContactUsPage contact;
	protected TestingPage testing;
	protected CoreJavaForSeleniumPage coreJava;
	protected SeleniumTrainingPagePom selenium;
	protected CoreJavaVideoPlay javaVideo;
	protected Long time;
	protected WebElement element;
	
	@BeforeClass
	public void classConfiguration() {
		property=new PropertiesFileUtility();
		excel =new ExccelUtility();
		web=new WebDriverUtility();
		
		property.propertyFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		excel.ExcelFileUtility(IConstantPath.EXCEL_FILE_PATH);
		
	}
	
	@BeforeMethod
	public void methodconfiguration() {
		time=Long.parseLong(property.fetchProperty("timeouts"));
		 driver =web.openApplication(property.fetchProperty("browser"), property.fetchProperty("url"), time);
		 home=new HomePagePom(driver);
		    skillraryDemo = new SkillraryDemoAppPagePom(driver);
			selenium= new SeleniumTrainingPagePom(driver);
			coreJava=new CoreJavaForSeleniumPage();
			javaVideo= new CoreJavaVideoPlay();
			testing=new TestingPage(driver);
			contact=new ContactUsPage();
		}

		@AfterMethod
		    public void methodTearDown()
		    {
			   web.closeWindows();
		    }
		@AfterClass
		     public void classTearDown()
		     {
			
		     }
	       	
		// @AfterTest
		// @AfterSuite
	}
