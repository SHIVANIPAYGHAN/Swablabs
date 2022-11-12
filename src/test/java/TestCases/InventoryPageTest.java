package TestCases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;

public class InventoryPageTest extends TestBase{
	
	InventoryPage perform;
	 LoginPage login;
	@BeforeMethod

	public void setup() throws Exception
	{
		intialization();
	
		 perform = new InventoryPage();
		  login = new LoginPage();
		 
	}
	
	@Test
	public void addToCartTest() throws Exception
	{
		login.loginApp1();
		perform.addToCart();
		perform.removeMethod();
	}
	
//	@Test
//	public void removeMethodTest()
//	{
//		
//		perform.removeMethod();
//	}
		
	//Verify Current Url
	
	@Test (enabled=false)
	public void verifyUrlTest() throws Exception
	{
		login.loginApp1();
		String url = perform.verifyUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/inventory.html");
	}
	
	

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
