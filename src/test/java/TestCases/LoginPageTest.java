package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		intialization();
		 login = new LoginPage();
	}
	
	//Verify the title
	@Test (enabled= false)
	public void verifyTitleTest()
	{
		String title = login.verifyTitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	
	//Verify the Url
	@Test(enabled= false)
	public void verifyUrlTest()
	{
		String url = login.verifyUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/");
	}
	
	//Method for Login the Application
	@Test
	public  void loginAppTest1() throws Exception
	{
		String logo = login.loginApp1();
		Assert.assertEquals(logo, "PRODUCTS");
		
		
	}
	
	//Method for get Current url
	@Test(enabled=false)
	public void loginAppTest2() throws Exception
	{
		loginAppTest1();
		Assert.assertEquals(login.loginApp2(),
				"https://www.saucedemo.com/inventory.html");
	}
	@Test(enabled=false)
	public void secondlogoTest() throws Exception
	{
		loginAppTest1();
		boolean logo = login.logo1();
	}
	@Test(enabled=false)
	public void thirdlogoTest() throws Exception
	{
		loginAppTest1();
		boolean logo1 = login.logo2();
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
