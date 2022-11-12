package Pages;

import org.bouncycastle.cert.cmp.RevocationDetailsBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v95.network.model.ResponseReceivedExtraInfo;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {

	//Object Repository
	@FindBy(xpath="//div[@class='bot_column']") private WebElement botlogo;
	@FindBy(xpath="//div[@class='login_logo']") private WebElement loginLogo;

	@FindBy(xpath="//input[@id='user-name']") private WebElement userNameTextBox;
	@FindBy(xpath="//input[@id='password']") private WebElement PassWordTextBox;
	@FindBy(xpath="//input[@id='login-button']") private WebElement submitbtn;
	@FindBy(xpath="//span[@class='title']") private WebElement productLogo;
	@FindBy(xpath="//div[@class='peek']") private WebElement Secondlogo;
	@FindBy(xpath="//img[@class='footer_robot']") private WebElement thirdlogo;
	
	
//	used for initializing variables of the class. 
//	we need to syncronize object of WebDriver .ex. - driver

//	We can have multiple classes for different features but driver should be one and sync with all.

//	So it is preferable that we should sync driver whenever class getting called.
	
	//Constructor
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	//Methods
	
	//method for login app
	public String loginApp1() throws Exception
	{
		userNameTextBox.sendKeys(ReadData.readPropertyFile("username"));
		PassWordTextBox.sendKeys(ReadData.readPropertyFile("password"));
		submitbtn.click();
//		botlogo.isDisplayed();
//		loginLogo.isDisplayed();
		
		return productLogo.getText();
	}
	
	public String loginApp2()
	{
		return driver.getCurrentUrl();
	}
	//Method to verify the logo1 after login
	public boolean logo1()
	{
		return Secondlogo.isDisplayed();
	}
	//Method to verify the logo2 after login
	public boolean logo2()
	{
		return thirdlogo.isDisplayed();
	}
	
	//Method for verify title
	public String verifyTitle()
	{
	return driver.getTitle();
	}
	//Method to verify the URL
	public String verifyUrl()
	{
	return driver.getCurrentUrl();
	}
	
}
