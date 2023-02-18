package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class SecondTest extends BaseClass {

	@Test
	public void secondtest() {
		
		SoftAssert soft=new SoftAssert();
		
		home.ClickGears();
		home.ClickSkillrarydemoApp();
		web.childBrowserPopup();
		
		skillraryDemo.selectCategory(web, 1);
		

		//web.dropdown(element, "Testing");
		testing.getPageHeader();
		web.dragAnddrop(testing.getSeleniumImage(), testing.getCartArea());
		web.scrollTillElement(testing.getFacebookIcon());
		testing.clickFacebookIcon();
		

	}

}
