package com.restaurant.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.restaurant.pages.AddProduct;
import com.restaurant.pages.DashboardPage;
import com.restaurant.pages.LoginPage;
import com.restaurant.pages.ProductPage;
import com.restaurant.pages.StorePage;
import com.restaurant.pages.WaiterPage;
import com.utils.ActionUtil;
import com.utils.BrowserActionsUtil;
import com.utils.ValidationActionUtil;
import com.utils.WebElementActionsUtil;

public class WaiterPageTest {
	LoginPage loginpage;
	DashboardPage dashboardpage;
	ProductPage productpage;
	AddProduct addproduct;
	StorePage storepage;
	WaiterPage waiterpage;
	WebDriver driver;
	ValidationActionUtil validationaction=new ValidationActionUtil();
	SoftAssert soft=new SoftAssert();
	ActionUtil actionutil;
	BrowserActionsUtil browseractionsutil;
	WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();
	
	@Test(groups= {"Regression"},priority= 21,enabled=true)
	public void addWaiter() {
		waiterpage.enterWaiterName("Ramesh");
		waiterpage.enterWaiterPhoneNumber("9989881222");
		waiterpage.enterWaiterEmailID("ramesh@gmail.com");
		waiterpage.selectWaitersStoreName("MNC");
		waiterpage.submitNewWaiterDetails();
		
		Assert.assertEquals(waiterpage.WaiterName.getText(), "Ramesh", "Not able to find Waiter");
	}
	@Test(groups= {"Regression"},priority= 22,enabled=true)
	public void editWaiter() {
		waiterpage.enterWaiterName("Zain Staff");
		waiterpage.enterWaiterEmailID("ramesh@gmail.com");
		waiterpage.selectWaitersStoreName("MNC");
	}
	@Test(groups= {"Regression"},priority= 21,enabled=true)
	public void deleteWaiterDetails() {
		waiterpage.deleteWaiterDetails();
	}
	@Test(groups= {"Regression"},priority= 23,enabled=true)
	public void searchWaiterDetails() {
		waiterpage.searchWaiter("Zain Staff");
	}
	
}
