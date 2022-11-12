package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {


	//Object Repository
	@FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']") private WebElement removeTshirt;
	@FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']") private WebElement removeJacket;
	@FindBy(xpath="//div[@class='footer_copy']") private WebElement contents;
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']") private WebElement OnesieLable;
	@FindBy(xpath="//button[@id='checkout']") private WebElement checkout;
	@FindBy(xpath="//span[@class='title']") private WebElement CheckoutLable;
	
	//constructor
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void removeMethod()
	{
		removeTshirt.click();
		removeJacket.click();
	}
	public String verifyContent()
	{
		return contents.getText();
	}
	public String verifyOnesieLable()
	{
		return OnesieLable.getText();
	}
	public void CheckoutMethod()
	{
		checkout.click();
	}
	public String verifyCheckoutUrl()
	{
		return driver.getCurrentUrl();
	}
	public String verifyLable()
	{
		return CheckoutLable.getText();
	}
}
	
	
	
	
