package com.restaurant.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.restaurant.pages.AddProduct;
import com.restaurant.pages.DashboardPage;
import com.restaurant.pages.EditDeleteProduct;
import com.restaurant.pages.LoginPage;
import com.restaurant.pages.ProductPage;
import com.restaurant.pages.StorePage;
import com.utils.ActionUtil;
import com.utils.BrowserActionsUtil;
import com.utils.ValidationActionUtil;
import com.utils.WebElementActionsUtil;

public class StorePageTest {

	LoginPage loginpage;
	DashboardPage dashboardpage;
	ProductPage productpage;
	AddProduct addproduct;
	StorePage storepage;
	EditDeleteProduct editdeleteproduct;
	WebDriver driver;
	ValidationActionUtil validationaction=new ValidationActionUtil();
	SoftAssert soft=new SoftAssert();
	ActionUtil actionutil;
	BrowserActionsUtil browseractionsutil;
	WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();
	
	@Test(groups= {"Regression"},priority= 13,enabled=true)
	public void addStorebtn() {
		storepage.enterStoreName("AJ Traders");
		storepage.enterEmail("an@gmail.com");
		storepage.enterStorePhone("98989898981");
		storepage.enterCountryName("India");
		storepage.enterCity("Ernakulam");
		storepage.enterAddress("AJ Road,Ernakulam");
		storepage.clickOnSubmitbtn();
		
		Assert.assertEquals(storepage.StoreName.getText(), "AJ Traders", "Not able to find Store");
	}
	
	@Test(groups= {"Regression"},priority= 14,enabled=true)
	public void clickClosebtnFromAddStoreScreen() {
		storepage.clickClosebtn();
	}
	@Test(groups= {"Regression"},priority= 15,enabled=true)
	public void clickXbtnFromAddStoreScreen() {
		storepage.clickXbtn();
	}
	@Test(groups= {"Regression"},priority= 16,enabled=true)
	public void editStorebtn() {
		storepage.enterStoreName("AJ Traders");
		storepage.enterEmail("an@gmail.com");
		storepage.enterCity("Trivandrum");
		storepage.enterAddress("MG Road,Trivandrum");
		storepage.clickOnSubmitbtn();                    
	}
	@Test(groups= {"Regression"},priority= 17,enabled=true)
	public void deleteStorebtn() {
		storepage.clickDeletebtn();
		storepage.clickDeletebtn();

	}
	@Test(groups= {"Regression"},priority= 18,enabled=true)
	public void searchStoreElement() {
		storepage.searchStore("AJ Traders");
	}
}
