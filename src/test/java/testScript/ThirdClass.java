package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class ThirdClass extends  BaseClass {
	
    @Test
    public void thirdtest() throws InterruptedException {
    	SoftAssert soft=new SoftAssert();
    	
    	home.searchFor("core java for selenium");
    	soft.assertEquals(coreJava.getPageHeader(), "CORE JAVA FOR SELENIUM");
    	
    	coreJava.clickcorejavaforseleniumlink();
    	soft.assertEquals(javaVideo.getPageHeader(), "CORE JAVA FOR SELENIUM TRAINING");
    	
    	javaVideo.clickclosecookiesi();
    	//web.switchToFrame(null);
    	javaVideo.clickplayButton();
    	Thread.sleep(3000);
    	javaVideo.clickpauseButton();
    	
    	//web.swichBackFromFrame();
    	javaVideo.clickaddtowishlist();
    	soft.assertAll();
    }

}
