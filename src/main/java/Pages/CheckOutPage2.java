package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckOutPage2 extends TestBase{
	
	//Object Repo
	@FindBy(xpath="//div[text()='Payment Information:']") private WebElement paymentInfoLable;
	@FindBy(xpath="//div[text()='FREE PONY EXPRESS DELIVERY!']") private WebElement deliveryLable;
	@FindBy(xpath="//div[text()='Tax: $']") private WebElement taxLable;
	@FindBy(xpath="//div[text()='Total: $']") private WebElement totalLable;
	@FindBy(xpath="//button[@id='finish']") private WebElement FinishBtn;
	@FindBy(xpath="//span[@class='title']") private WebElement completeCheckOutLable;
	
	
	//Constructor
	public CheckOutPage2()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public String verifypaymentLables()
	{
		return paymentInfoLable.getText();
		
	}
	public String verifydeliveryLable()
	{
		return deliveryLable.getText();
		
	}
	public String verifytaxLable()
	{
		return taxLable.getText();
	}
	public String verifytotalLable()
	{
		return totalLable.getText();
	}
	
	public void FinishMethod()
	{
		FinishBtn.click();
	}
	public String verifycompleteCheckOutUrl()
	{
		return driver.getCurrentUrl();
	}
	public String verifycompleteCheckOutLable()
	{
		return completeCheckOutLable.getText();
	}
	

}
