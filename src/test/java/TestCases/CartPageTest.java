package TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPageFull;
import Pages.LoginPage;
import Utility.ReadData;

public class CartPageTest extends TestBase{
	LoginPage login;
	InventoryPageFull invent;
	CartPage cart;
	@BeforeMethod
	public void setup() throws Exception
	{
		intialization();
		 login = new LoginPage();
		 invent = new InventoryPageFull();
		 cart = new CartPage();
	}
	
	@Test
	public void removeMethodTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.addToCartPro();
		cart.removeMethod();
//		
	}
	@Test (enabled=true)
	public void verifyContentTest()throws Exception
	
	{
		login.loginApp1();
		invent.addToCartPro();
		
		String result = cart.verifyContent();
		Assert.assertEquals(result, ReadData.readExcelFile(0, 1));
	}
	@Test (enabled=true)
	public void verifyOnesieLableTest()throws Exception
	
	{
		login.loginApp1();
		invent.add6Product();
		invent.addToCartPro();
		String result = cart.verifyOnesieLable();
		Assert.assertEquals(result, ReadData.readExcelFile(0,2));
	}
	@Test
	public void CheckoutMethod()throws Exception
	
	{
		login.loginApp1();
		invent.addToCartPro();
		cart.CheckoutMethod();
	}
	
	public void verifyCheckoutUrlTest()throws Exception
	
	{
		login.loginApp1();
		invent.addToCartPro();
//		cart.CheckoutMethod();
		
		String result = cart.verifyCheckoutUrl();
		Assert.assertEquals(result, ReadData.readExcelFile(0, 3));
	}
	
	public void verifyCheckoutLableTest() throws Exception
	{
		login.loginApp1();
		invent.addToCartPro();
//		cart.CheckoutMethod();
		String result = cart.verifyLable();
		Assert.assertEquals(result, ReadData.readExcelFile(0, 4));
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
