package com.restaurant.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.restaurant.pages.DashboardPage;
import com.restaurant.pages.LoginPage;
import com.restaurant.pages.PeoplePage;
import com.utils.ActionUtil;
import com.utils.BrowserActionsUtil;
import com.utils.ExcelUtil;
import com.utils.ValidationActionUtil;
import com.utils.WebElementActionsUtil;

public class PeoplePageTest {

	WebDriver driver;
	ValidationActionUtil validationaction=new ValidationActionUtil();
	SoftAssert soft=new SoftAssert();
	ActionUtil actionutil;
	ExcelUtil excelutil=new ExcelUtil();
	BrowserActionsUtil browseractionsutil;
	LoginPage loginpage=new LoginPage(driver);
	PeoplePage peoplepage;
	WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();

	@Test(groups= {"Regression"},priority= 19,enabled=true)
	public void verifyTheMenuInHomePage() throws IOException{
		loginpage = new LoginPage(driver);
 
    	loginpage.typeUsername(loginpage.readStringData("Credentials","UserCredentials", 1, 0));
    	loginpage.typePassword(loginpage.readStringData("Credentials","UserCredentials", 1, 1));
    	loginpage.clickLogin();
		soft.assertTrue(peoplepage.isWaitersMenuDisplayed(),"Waiters Menu is not Displayed"); 		 		 
		soft.assertEquals(peoplepage.isCustomersMenuDisplayed(),"Customers Menu is not Displayed"); 	 
		soft.assertTrue(peoplepage.isSuppliersMenuDisplayed(),"Suppliers Menu is not Displayed"); 		
	}
	@Test(groups= {"Regression"},priority= 20,enabled=true)	 
	public void ValidateTheClickabilityOfTheField()
{
	 peoplepage.navigateToWaitersMenu();
	 Assert.assertEquals("peoplepage.WaitersMenu.getText()","Waiters", "Failure message- Waiters Menu Cannot be Accessed");
	 browseractionsutil.moveBacktoPreviousPage(driver);
	 peoplepage.navigateToCustomersMenu();
	 Assert.assertEquals("peoplepage.CustomersMenu.getText()","Customers", "Failure message- Customers Menu Cannot be Accessed");
	 browseractionsutil.moveBacktoPreviousPage(driver);
	 peoplepage.navigateToSuppliersMenu();
	 Assert.assertEquals("peoplepage.SuppliersMenu.getText()","Suppliers", "Failure message- Suppliers Menu Cannot be Accessed");
}
}