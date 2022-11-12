package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.ReadData;
import Utility.SelectClassMethod;

public class InventoryPageFull extends TestBase{

	//object Repository
	@FindBy(xpath="//div[@class='peek']") private WebElement smallLogo;
	@FindBy(xpath="//img[@alt='Swag Bot Footer']") private WebElement LargeLogo;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement dropdown;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backpackProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLightProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement tshirtProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement jacketProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement onsizeshirtProduct;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement tshirtRedProduct;
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']") private WebElement removebackpackProduct;
	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']") private WebElement removebikeLightProduct;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement productCount;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement twitterLogo;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement fbLogo;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement linkdnLogo;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement addToCart;
	@FindBy(xpath="//span[@class='title']") private WebElement yourCartLable;
	//Constructor
	public InventoryPageFull()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public boolean verifySmallLogo()
	{
		return smallLogo.isDisplayed();
	}
	public boolean verifyBifLogo()
	{
		return LargeLogo.isDisplayed();
	}
	public String add6Product() throws Exception
	{
//		Select a = new Select(dropdown);
//		a.selectByVisibleText(ReadData.readExcelFile(0,0));
		SelectClassMethod.selectclass(dropdown, ReadData.readExcelFile(0, 0));
		backpackProduct.click();
		bikeLightProduct.click();
		tshirtProduct.click();
		jacketProduct.click();
		onsizeshirtProduct.click();
		tshirtRedProduct.click();
		String count = productCount.getText();
		return count;
	}
	public void remove2Product()
	{
		removebackpackProduct.click();
		removebikeLightProduct.click();
	}
	
	public boolean verifyTwitterlogo()
	{
		return 
		twitterLogo.isDisplayed();
		
	}
	public boolean verifyfblogo()
	{
		return fbLogo.isDisplayed();
	}
	public boolean verifylinkdnlogo()
	{
		return linkdnLogo.isDisplayed();
	}
	public void addToCartPro()
	{
		addToCart.click();
	}
	public String verifyNextPageUrl()
	{
		return driver.getCurrentUrl();
	}
	public String verifyNextPageLable()
	{
		return yourCartLable.getText();
	}
}
