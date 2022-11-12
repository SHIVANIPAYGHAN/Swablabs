package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LogoutPage extends TestBase {

	
		
//		Object Repository
		@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement threeLinesBox;
		@FindBy(xpath="//a[@id='about_sidebar_link']") private WebElement about;
		@FindBy(xpath="//a[@id='logout_sidebar_link']") private WebElement logoutBox;
		@FindBy(xpath="//div[@class='login_logo']") private WebElement loginpagelogo;
		
//		Constructor
		public LogoutPage()
		{
			PageFactory.initElements(driver, this);
		}
		
//		Method
		public void threelineBox()
		{
			threeLinesBox.click();
			about.click();
			driver.navigate().back();
			
		}
		public void logoutbox()
		{
			threeLinesBox.click();
			logoutBox.click();
		}
		public boolean verifyLoginPageLogo()
		{
			return loginpagelogo.isDisplayed();
		}
		

	}


