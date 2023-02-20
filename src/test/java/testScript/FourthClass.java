package testScript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FourthClass extends BaseClass {
	
	@Test
	public void fourthtest() {
		SoftAssert soft = new SoftAssert();

		home.ClickGears();
		home.ClickSkillrarydemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());

		
		web.scrollToElement(skillraryDemo.getContactus());
		skillraryDemo.clickContactUs();

		
		List<String> data=excel.fetchDataFromExcel("sheet1");
		contact.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
		soft.assertAll();
	}

}
