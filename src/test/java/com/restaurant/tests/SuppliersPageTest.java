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
import com.restaurant.pages.SuppliersPage;
import com.restaurant.pages.WaiterPage;
import com.utils.ActionUtil;
import com.utils.BrowserActionsUtil;
import com.utils.ValidationActionUtil;
import com.utils.WebElementActionsUtil;

public class SuppliersPageTest {
	LoginPage loginpage;
	DashboardPage dashboardpage;
	ProductPage productpage;
	AddProduct addproduct;
	StorePage storepage;
	WaiterPage waiterpage;
	SuppliersPage supplierspage;
	WebDriver driver;
	ValidationActionUtil validationaction=new ValidationActionUtil();
	SoftAssert soft=new SoftAssert();
	ActionUtil actionutil;
	BrowserActionsUtil browseractionsutil;
	WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();
	
	@Test(groups= {"Regression"},priority= 29,enabled=true)
	public void addSupplier() {
		supplierspage.addNewSupplierDetails();
		supplierspage.enterSupplierName("Noor Industries");
		supplierspage.enterSupplierPhone("89898656565");
		supplierspage.enterSupplierEmail("noor@gmail.com");
		supplierspage.enterSupplierNote("Supplier");
		supplierspage.submitNewSupplierDetails();
		
		Assert.assertEquals(supplierspage.SupplierName.getText(), "Noor Industries", "Not able to find Supplier");
	}
	@Test(groups= {"Regression"},priority= 30,enabled=true)
	public void editSupplier() {
		supplierspage.editSupplierDetails();
		supplierspage.enterSupplierName("anu");
		supplierspage.enterSupplierPhone("89566");
		supplierspage.enterSupplierEmail("a@gmail.com");
		supplierspage.submitNewSupplierDetails();
		
		Assert.assertEquals(supplierspage.SupplierName.getText(), "a", "Not able to update Supplier Details");
	}
	@Test(groups= {"Regression"},priority= 31,enabled=true)
	public void searchSupplier() {
		supplierspage.searchSupplier("anu"); 
	}
	@Test(groups= {"Regression"},priority= 32,enabled=true)
	public void deleteSupplier() {
		supplierspage.deleteSupplierDetails();
	}
	
}
