package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CompleteCheckoutPage extends TestBase {

	//Object Repo
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']") private WebElement thankyouLable;
	@FindBy(xpath="//div[@class='complete-text']") private WebElement textLable;
	@FindBy(xpath="//img[@class='pony_express']") private WebElement ponyExpressLogo;
	
	//Constructor
	public CompleteCheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public String verifythankyouLable()
	{
		return thankyouLable.getText();
	}
	public String verifytextLable()
	{
		return textLable.getText();
	}
	public boolean verifyPonyExpressLogo()
	{
		return ponyExpressLogo.isDisplayed();
	}
	
}
