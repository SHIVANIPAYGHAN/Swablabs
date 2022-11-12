package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPageFull;
import Pages.LoginPage;

public class FaildTest extends TestBase{
	LoginPage login;
	InventoryPageFull invent;
	@BeforeMethod
	public void setup() throws Exception
	{
		intialization();
		login = new LoginPage();
		invent = new InventoryPageFull();
	}
	
	@Test
	public void verifySmalllogoTest() throws Exception
	{
		login.loginApp1();
		boolean  result = invent.verifySmallLogo();
		Assert.assertEquals(result, true);
	}
	@Test 
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
	
	@Test
	public void  verifyTwitterlogoTest() throws Exception
	{
		login.loginApp1();
		boolean result = invent.verifyTwitterlogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifyfblogoTest() throws Exception
	{
		login.loginApp1();
		boolean result = invent.verifyfblogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void verifylinkdnlogoTest() throws Exception
	{
		login.loginApp1();
		boolean result = invent.verifylinkdnlogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public void addToCartProTest()throws Exception
	{
		login.loginApp1();
		invent.addToCartPro();
	}
	@Test
	public void verifyNextPageUrltest()throws Exception
	{
		
		login.loginApp1(); 
		invent.addToCartPro();
		String  result1 = invent.verifyNextPageUrl();
		Assert.assertEquals(result1, "https://www.saucedemo.com/cart.html");
		System.out.println(result1);
	}
	@Test
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
