package com.restaurant.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.base.AutomationBase2;
import com.restaurant.pages.AddProduct;
import com.restaurant.pages.DashboardPage;
import com.restaurant.pages.EditDeleteProduct;
import com.restaurant.pages.LoginPage;
import com.restaurant.pages.ProductPage;
import com.utils.ActionUtil;
import com.utils.BrowserActionsUtil;
import com.utils.ValidationActionUtil;
import com.utils.WebElementActionsUtil;

public class ProductPageTest extends AutomationBase {

	LoginPage loginpage;
	DashboardPage dashboardpage;
	ProductPage productpage;
	AddProduct addproduct;
	EditDeleteProduct editdeleteproduct;
	WebDriver driver;
	ValidationActionUtil validationaction=new ValidationActionUtil();
	SoftAssert soft=new SoftAssert();
	ActionUtil actionutil;
	BrowserActionsUtil browseractionsutil;
	WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();
	
	
	public void verifyProductPageNavigation() {
	
	loginpage=new LoginPage(driver);
	//dashboardpage=new DashboardPage(driver);
	dashboardpage=loginpage.login("admin","password");
	//productpage=dashboardpage.navigateToProductPage();
	
	}
	
	
	/**
	 * method to check whether all options are available
	 */
	@Test(groups= {"Regression"},priority= 6,enabled=true)
		public void verifyTheProductPageButtonsAreDisplayed(){
			 soft.assertTrue(productpage.validateAddProduct(),"Add Product button is not Displayed"); 		 		 
			 soft.assertTrue(productpage.validateEditProduct(),"Edit Product button is not Displayed"); 	 
			 soft.assertTrue(productpage.validateDeleteProduct(),"Delete Product button is not Displayed"); 		
			 soft.assertTrue(productpage.validateApplyFilter(),"Apply Filter button is not Displayed"); 		
			 soft.assertTrue(productpage.clickOnPrintMenu(),"PrintMenu button  is not Displayed"); 	 
			 soft.assertTrue(productpage.validateApplyFilter(),"Apply Filter button is not Displayed"); 		 
			 soft.assertTrue(productpage.validateUploadCSV(),"Upload CSV button is not Displayed");	
			 soft.assertTrue(productpage.validateDownloadCSV(),"Download CSV Button is not Displayed"); 		 
			 soft.assertTrue(productpage.validatePrintMenu(),"Print button is not Displayed");	
			 soft.assertAll();
		}
	
		/*public void ValidateTheClickabilityOfTheField()
		{
			 dashboardpage.navigateToPOSPage();
			 Assert.assertEquals("POS","Failure message- POS Menu Cannot be Accessed");
	}
	*/
	/**
	 * Method to Add Product
	 */
	@Test(groups= {"Regression"},priority= 7,enabled=true)
	public void AddProduct() {
		addproduct=new AddProduct(driver);
		addproduct.selectProductType("Service");
		addproduct.enterProductCode("12");
		addproduct.enterProductName("Fruits");
		addproduct.selectProductCategory("The Greens");
		addproduct.selectProductSupplier("Lee's Suppliers");
		addproduct.enterProductPrice("30");
		addproduct.enterTax("2");
		addproduct.enterTaxMethod("inclusive");
		addproduct.enterPrice("35");
		addproduct.enterProductUnit("10");
		addproduct.enterAlertQuantity("4");
		addproduct.enterProductOptions("Fresh Fruits");
	//	addproduct.uploadInputImage("image.png");
		addproduct.enterProductDescription("Fresh Fruits");
		addproduct.submitNewProduct();
		
	}
		@Test(groups= {"Regression"},priority= 8,enabled=true)
		public void EditProductNavigateToPreviousPage() {
			editdeleteproduct=new EditDeleteProduct(driver);
			editdeleteproduct.selectProductType("Standard");
			editdeleteproduct.enterProductCode("12");
			editdeleteproduct.enterProductName("Fruits");
			editdeleteproduct.selectProductCategory("fruits");
			editdeleteproduct.enterProductPrice("15");
			editdeleteproduct.enterPrice("25");
			editdeleteproduct.backButton();
		}
		@Test(groups= {"Regression"},priority= 9,enabled=true)
		public void EditProductSubmission() {
			editdeleteproduct=new EditDeleteProduct(driver);
			editdeleteproduct.selectProductType("Standard");
			editdeleteproduct.enterProductCode("12");
			editdeleteproduct.enterProductName("Fruits");
			editdeleteproduct.selectProductCategory("fruits");
			editdeleteproduct.enterProductPrice("15");
			editdeleteproduct.enterPrice("25");
			editdeleteproduct.clickEditProductButton();
		}
		
		@Test(groups= {"Regression"},priority= 10,enabled=true)
		public void DeleteProduct() {
		editdeleteproduct.clickDeleteProductbtn();
			editdeleteproduct.clickDeleteProductConfirmationbtn();
		}
		@Test(groups= {"Regression"},priority= 11,enabled=true)
		public void viewProduct() {
			productpage.clickOnViewProduct();
		}
		
		@Test(groups= {"Regression"},priority= 12,enabled=true)
		public void DownloadCSVbtn() {
			productpage.clickOnDownloadCSV();
		}
		
}
