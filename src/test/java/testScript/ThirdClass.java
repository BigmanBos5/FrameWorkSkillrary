package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdClass extends BaseClass {

	@Test
	public void thirdtest() throws InterruptedException {
		SoftAssert soft = new SoftAssert();

		home.searchFor("core java for selenium");
		soft.assertEquals(coreJava.getPageHeader(), "CORE JAVA FOR SELENIUM");

		coreJava.clickcorejavaforseleniumlink();
		soft.assertEquals(javaVideo.getPageHeader(), "Core Java For Selenium Training");

		javaVideo.clickclosecookiesi();
		//web.switchToFrame();
		javaVideo.clickplayButton();
		Thread.sleep(3000);
		javaVideo.clickpauseButton();

		web.switchBackFromFrame();
		javaVideo.clickaddtowishlist();
		soft.assertAll();
	}

}
