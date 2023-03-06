package com.restaurant.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.restaurant.pages.AddProduct;
import com.restaurant.pages.CustomersPage;
import com.restaurant.pages.DashboardPage;
import com.restaurant.pages.LoginPage;
import com.restaurant.pages.ProductPage;
import com.restaurant.pages.StorePage;
import com.restaurant.pages.WaiterPage;
import com.utils.ActionUtil;
import com.utils.BrowserActionsUtil;
import com.utils.ValidationActionUtil;
import com.utils.WebElementActionsUtil;

public class CustomerPageTest {
	public class WaiterPageTest {
		LoginPage loginpage;
		DashboardPage dashboardpage;
		ProductPage productpage;
		AddProduct addproduct;
		StorePage storepage;
		WaiterPage waiterpage;
		CustomersPage customerspage;
		WebDriver driver;
		ValidationActionUtil validationaction=new ValidationActionUtil();
		SoftAssert soft=new SoftAssert();
		ActionUtil actionutil;
		BrowserActionsUtil browseractionsutil;
		WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();
		
		@Test(groups= {"Regression"},priority= 24,enabled=true)
		public void addNewCustomer() {
			customerspage.addNewCustomer();
			customerspage.enterCustomerName("Susan");
			customerspage.enterCustomerPhoneNumber("8697687888");
			customerspage.enterCustomerEmailID("susan@yahoo.com");
			customerspage.enterCustomerDiscountPrice("25");
			customerspage.submitNewCustomerDetails();

			Assert.assertEquals(customerspage.CustomerName.getText(), "Susan", "Not able to find Customer");
		}
		@Test(groups= {"Regression"},priority= 25,enabled=true)
		public void editCustomer() {
			customerspage.enterCustomerName("Akshay");
			customerspage.editCustomerDetails();
			customerspage.enterCustomerPhoneNumber("986554566");
			customerspage.enterCustomerDiscountPrice("125");
			customerspage.submitNewCustomerDetails();
			Assert.assertEquals(customerspage.CustomerDiscountPrice.getText(), "125", "Customer Details Updation Failed");
		}
		@Test(groups= {"Regression"},priority= 26,enabled=true)
		public void navigateToPreviousPageFromEditCustomerScreen() {
			customerspage.editCustomerDetails();
			customerspage.enterCustomerName("Akshay");
			customerspage.clickBackbtnfromEditScreen();
		}
		@Test(groups= {"Regression"},priority= 27,enabled=true)
		public void searchCustomer() {
			customerspage.searchCustomer("Akshay");
		}
		@Test(groups= {"Regression"},priority= 28,enabled=true)
		public void deleteCustomer() {
			customerspage.deleteCustomerDetails();
		}
		
		
		}
}
