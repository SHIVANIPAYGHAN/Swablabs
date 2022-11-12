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

public class CheckOutPage2Test extends TestBase {
	LoginPage login;
	InventoryPageFull invent;
	CartPage cart;
	CheckOutPage1 checkout;
	CheckOutPage2 check;
	@BeforeMethod
	public void setup() throws Exception
	{
		intialization();
		login = new LoginPage();
		invent = new InventoryPageFull();
		cart = new CartPage();
		checkout = new CheckOutPage1();
		check = new CheckOutPage2();
		
	}
	
	@Test(enabled=false)
	public void verifypaymentLablesTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		 String result = check.verifypaymentLables();
		 Assert.assertEquals(result, ReadData.readExcelFile(2, 0));
	}
	@Test(enabled=false)
	public void  verifydeliveryTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		 check.verifypaymentLables();
		 String result = check.verifydeliveryLable();
		 Assert.assertEquals(result, ReadData.readExcelFile(2, 1));
		
	}
	
	@Test(enabled=false)
	public void verifytaxLableTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		check.verifydeliveryLable();
		
		 String result = check.verifytaxLable();
		 Assert.assertEquals(result,  ReadData.readExcelFile(2, 2));
		 
		 
	}
	@Test(enabled=false)
	public void verifytotalLableTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		check.verifytaxLable();
		 String result = check.verifytotalLable();
		 Assert.assertEquals(result,  ReadData.readExcelFile(2, 3));
		 
		 
	}
	@Test
	public void FinishMethodTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		
		check.verifytotalLable();
	}
	@Test
	public void verifycompleteCheckOutUrlTest() throws Exception
	
	{
		login.loginApp1();
		invent.add6Product();
//		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		check.FinishMethod();
		String result = check.verifycompleteCheckOutUrl();
		Assert.assertEquals(result, ReadData.readExcelFile(3, 0));
	}
	@Test
	public void verifycompleteCheckOutLableTest() throws Exception
	{
		login.loginApp1();
		invent.add6Product();
//		invent.remove2Product();
		invent.addToCartPro();
		cart.CheckoutMethod();
		checkout.detailInfo();
		check.FinishMethod();
		check.verifycompleteCheckOutUrl();
		String result = check.verifycompleteCheckOutLable();
		Assert.assertEquals(result, ReadData.readExcelFile(3, 1));
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}

}
