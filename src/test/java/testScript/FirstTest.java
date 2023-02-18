package testScript;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;


public class FirstTest extends BaseClass
{
	@Test
	public void firsttest() {
		SoftAssert soft=new SoftAssert();
		home.ClickGears();
		home.ClickSkillrarydemoApp();
		web.childBrowserPopup();
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
		
		skillraryDemo.mouseHoverToCourse(web);
		skillraryDemo.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader(), "selenium training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.alertOK();
		web.explicitWait(time, selenium.getItemAddedMessage());
		web.getScreenshot();
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		
		soft.assertAll();
		
	}
	
	

}
