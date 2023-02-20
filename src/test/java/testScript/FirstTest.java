package testScript;


import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;


public class FirstTest extends BaseClass
{
	//firsr test
	@Test
	public void firsttest() {
		SoftAssert soft=new SoftAssert();
		home.ClickGears();
		home.ClickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		
		skillraryDemo.mouseHoverToCourse(web);
		skillraryDemo.clickSeleniumTraining();
		
		//soft.assertEquals(selenium.getPageHeader(), "Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.explicitWait(time, selenium.getItemAddedMessage());
		web.takeScreenshot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		soft.assertAll();
		
	}
	
	

}
