package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
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
import Pages.LogoutPage;
import Utility.ScreenShotMethod;

public class LogoutPageTest extends TestBase {
	LoginPage login;
	InventoryPageFull invent;
	CartPage cart;
	CheckOutPage1 checkout;
	CheckOutPage2 check;
	CompleteCheckoutPage com;
	LogoutPage logout;
	
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
		logout =  new LogoutPage();
		
	}
	
	
	@Test
	public void threelineBoxTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		check.FinishMethod();
		com.verifytextLable();
		logout.threelineBox();
		
		
	}
	
	public void logoutboxText() throws Exception 
	{
		
		Thread.sleep(2000);
		logout.threelineBox();
		Thread.sleep(5000);
		logout.logoutbox();
		Thread.sleep(5000);
	}
	@Test
	public void verifyLoginPageLogo() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		check.FinishMethod();
		com.verifytextLable();
		logout.threelineBox();
		logout.logoutbox();
		boolean result = logout.verifyLoginPageLogo();
		Assert.assertEquals(result, true);
		System.out.println(result);
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
