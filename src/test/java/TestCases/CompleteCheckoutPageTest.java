package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutPage1;
import Pages.CheckOutPage2;
import Pages.CompleteCheckoutPage;
import Pages.InventoryPageFull;
import Pages.LoginPage;
import Utility.ReadData;

public class CompleteCheckoutPageTest extends TestBase{
	LoginPage login;
	InventoryPageFull invent;
	CartPage cart;
	CheckOutPage1 checkout;
	CheckOutPage2 check;
	CompleteCheckoutPage com;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		intialization();
		login = new LoginPage();
		invent = new InventoryPageFull();
		cart = new CartPage();
		checkout = new CheckOutPage1();
		check = new CheckOutPage2();
		 com = new CompleteCheckoutPage();
	}
	
	@Test
	public void verifythankyouLableTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		check.FinishMethod();
		String result = com.verifythankyouLable();
		Assert.assertEquals(result, ReadData.readExcelFile(4, 0));
	}
	@Test
	public void verifytextLableTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		check.FinishMethod();
		com.verifythankyouLable();
		String result = com.verifytextLable();
		Assert.assertEquals(result, ReadData.readExcelFile(4, 1));
	}
	@Test
	public void verifyPonyExpressLogoTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		check.FinishMethod();
		com.verifytextLable();
		boolean result = com.verifyPonyExpressLogo();
		Assert.assertEquals(result,true);
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
