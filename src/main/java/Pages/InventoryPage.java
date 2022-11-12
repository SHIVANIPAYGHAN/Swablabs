package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;


public class InventoryPage extends TestBase {

   //Object Repository
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement productOne;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement producttwo;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement productthree;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement productfour;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement productfive;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement productsix;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement addcart;
	
	@FindBy(xpath="//button[@id='remove-sauce-labs-onesie']") private WebElement removeone;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']") private WebElement removetwo;
	
	@FindBy(xpath="//button[@id='checkout']") private WebElement checkoutBtn;
//	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement addcart;
//	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement addcart;
	
	
	
	//Constructor
	public InventoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Methods
	
	public void addToCart()
	{
		productOne.click();
		producttwo.click();
		productthree.click();
		productfour.click();
		productfive.click();
		productsix.click();
		addcart.click();
//		removeone.click();
//		removetwo.click();
//		checkoutBtn.click();
	}
	
	public void removeMethod()
	{
		addcart.click();
		removeone.click();
		removetwo.click();
		checkoutBtn.click();
	}
	public String verifyUrl()
	{
		
		return driver.getCurrentUrl();
	}
	
	
	
}
