package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPageFull;
import Pages.LoginPage;

public class IntoryPageFullTest extends TestBase{
	LoginPage login;
	InventoryPageFull invent;
	@BeforeMethod
	public void setup() throws Exception
	{
		intialization();
		login = new LoginPage();
		invent = new InventoryPageFull();
	}
	
	@Test(enabled=true)
	public void verifySmalllogoTest() throws Exception
	{
		login.loginApp1();
		boolean  result = invent.verifySmallLogo();
		Assert.assertEquals(result, true);
	}
	@Test (enabled=true,priority=0)
	public void verifyBiglogoTest() throws Exception
	{
		login.loginApp1();
		boolean result = invent.verifyBifLogo();
		Assert.assertEquals(result, true);
		System.out.println(result);
	}
	@Test
	public void add6ProductTest() throws Exception
	{
		login.loginApp1();
		
		String result = invent.add6Product();
		Assert.assertEquals(result, "6");
		invent.remove2Product();
		System.out.println(result);
	}
	
	@Test(enabled=true)
	public void  verifyTwitterlogoTest() throws Exception
	{
		login.loginApp1();
		boolean result = invent.verifyTwitterlogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=true)
	public void verifyfblogoTest() throws Exception
	{
		login.loginApp1();
		boolean result = invent.verifyfblogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=true)
	public void verifylinkdnlogoTest() throws Exception
	{
		login.loginApp1();
		boolean result = invent.verifylinkdnlogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=true)
	public void addToCartProTest()throws Exception
	{
		login.loginApp1();
		invent.addToCartPro();
	}
	@Test(enabled=true)
	public void verifyNextPageUrltest()throws Exception
	{
		
		login.loginApp1(); 
		invent.addToCartPro();
		String  result1 = invent.verifyNextPageUrl();
		Assert.assertEquals(result1, "https://www.saucedemo.com/cart.html");
		System.out.println(result1);
	}
	@Test(enabled=true)
	public void verifyNextPageLableTest() throws Exception
	{
		login.loginApp1();
		invent.addToCartPro();
		String result2 = invent.verifyNextPageLable();
		Assert.assertEquals(result2, "YOUR CART");
		System.out.println(result2);
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	

}
