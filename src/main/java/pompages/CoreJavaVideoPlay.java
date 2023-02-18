package pompages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class CoreJavaVideoPlay {		
		//Declaration 
		@FindBy(xpath="//h1")
		private WebElement pageHeader;
		
		@FindBy(xpath="//button[@aria-label='play']")
		private WebElement playButton;
		
		@FindBy(xpath="//button[@aria-label='pause']")
		private WebElement pauseButton;
		
		@FindBy(xpath="//span[text()='Add To Wishlist")
		private WebElement addToWishlistTab;
		
		@FindBy(xpath = "//*[@class='close_cookies']")
		private WebElement closeCookiesIcon;
		
		//Initialization
		public void corejavavideopage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public String getPageHeader() {
			return pageHeader.getText();
			
		}
		public void clickplayButton() {
			playButton.click();
		}
		public void clickpauseButton() {
			pauseButton.click();
		}
		public void clickaddtowishlist() {
			addToWishlistTab.click();
		}
		public void clickclosecookiesi()
		{
			closeCookiesIcon.click();
		}
	}


