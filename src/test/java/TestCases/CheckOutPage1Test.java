package TestCases;

import org.openqa.selenium.devtools.v85.page.Page.CaptureScreenshotFormat;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CheckOutPage1;
import Pages.InventoryPageFull;
import Pages.LoginPage;
import Utility.ReadData;
import Utility.ScreenShotMethod;

public class CheckOutPage1Test extends TestBase {
	LoginPage login;
	InventoryPageFull invent;
	CartPage cart;
	CheckOutPage1 checkout;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		intialization();
		login = new LoginPage();
		 invent = new InventoryPageFull();
		 cart = new CartPage();
		  checkout = new CheckOutPage1();
	}
	
	@Test(enabled= true)
	public void detailInfoTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
	}
	@Test
	public void verifyCheckout2PageUrlTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		String result = checkout.verifyCheckout2PageUrl();
//		Assert.assertEquals(result, "https://www.saucedemo.com/checkout-step-one.html");
		Assert.assertEquals(result, ReadData.readExcelFile(1, 0));
	}
	@Test (dependsOnMethods = "verifyCheckout2PageUrlTest")
	public void verifyCheckoutlableTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		checkout.verifyCheckout2PageUrl();
		String result = checkout.verifyCheckoutlable();
		Assert.assertEquals(result, "CHECKOUT: OVERVIEW");
//		Assert.assertEquals(result, ReadData.readExcelFile(1, 1));
	}

	
	
	
	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception
	{
		if(ITestResult.FAILURE == it.getStatus())
		{
		ScreenShotMethod.screenshot(it.getName());
		}
	
		driver.close();
	}
	}
	




