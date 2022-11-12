package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class CheckOutPage1 extends TestBase {
	
	//Object Repository
	@FindBy(xpath="//input[@id='first-name']") private WebElement firstNameTextBox;
	@FindBy(xpath="//input[@id='last-name']") private WebElement lastNameTextBox;
	@FindBy(xpath="//input[@id='postal-code']") private WebElement postalCodeTextBox;
	@FindBy(xpath="//input[@id='continue']") private WebElement continueTextBox;
	@FindBy(xpath="//span[@class='title']") private WebElement Checkout2Lable;
	
	
	//Constructor
	public CheckOutPage1()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void detailInfo() throws Exception
	{
		firstNameTextBox.sendKeys(ReadData.readPropertyFile("firstname"));
		lastNameTextBox.sendKeys(ReadData.readPropertyFile("lastname"));
		postalCodeTextBox.sendKeys(ReadData.readPropertyFile("postalcode"));
		continueTextBox.click();
	}
	public String verifyCheckout2PageUrl()
	{
		return driver.getCurrentUrl();
	}
	public String verifyCheckoutlable()
	{
		 return Checkout2Lable.getText();
	}

}
