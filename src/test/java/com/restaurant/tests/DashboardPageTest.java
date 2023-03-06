package com.restaurant.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase2;
import com.restaurant.pages.DashboardPage;
import com.restaurant.pages.LoginPage;
import com.utils.ActionUtil;
import com.utils.BrowserActionsUtil;
import com.utils.ExcelUtil;
import com.utils.ValidationActionUtil;
import com.utils.WaitUtil;
import com.utils.WebElementActionsUtil;


public class DashboardPageTest extends AutomationBase2 {
	WebDriver driver;
	DashboardPage dashboardpage=new DashboardPage(driver);
	ValidationActionUtil validationaction=new ValidationActionUtil();
	SoftAssert soft=new SoftAssert();
	ActionUtil actionutil;
	ExcelUtil excelutil=new ExcelUtil();
	BrowserActionsUtil browseractionsutil;
	LoginPage loginpage=new LoginPage(driver);
	WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();
	
	
	//WaitUtil waitutil=new WaitUtil();
	
	/*driver=AutomationBase.launchBrowser("Firefox","https://qalegend.com/restaurant/login");
	//String currentDir;
	//String filePath1=currentDir + "/src/main/resouces/" + "chromedriver.exe";
    //driver=launchBrowser(browserType,filePath1);
  dashboardpage=LoginPage.login("admin","password");*/
	

	
	/*public void verifyLoggedUserName() throws Exception {
    	loginpage = new LoginPage(driver);
    	dashboardpage = new DashboardPage(driver);
    	loginpage.typeUsername(loginpage.readStringData("Credentials","UserCredentials", 1, 0));
    	loginpage.typePassword(loginpage.readStringData("Credentials","UserCredentials", 1, 1));
    	loginpage.clickLogin();*/
	//	Assert.assertEquals(actualLoggedUserName, expectedLoggedUserName, "Loggedin user is different");


	

	/*public void titleCheck(){
		Assert.assertEquals(driver.findElement(By.xpath("//img[@alt='logo']")).isDisplayed(),true);
	}*/
	@Test(groups= {"Regression"},priority= 3,enabled=true)
	public void verifyTheMenuInHomePage() throws IOException{
		loginpage = new LoginPage(driver);
    	dashboardpage = new DashboardPage(driver);
    	loginpage.typeUsername(loginpage.readStringData("Credentials","UserCredentials", 1, 0));
    	loginpage.typePassword(loginpage.readStringData("Credentials","UserCredentials", 1, 1));
    	loginpage.clickLogin();
		 soft.assertTrue(dashboardpage.navigateToPOSPage(),"POS Menu is not Displayed"); 		 		 
		 soft.assertEquals(dashboardpage.navigateToProductPage(),"Product Menu is not Displayed"); 	 
		 soft.assertTrue(dashboardpage.navigateToStoresPage(),"Stores Menu is not Displayed"); 		
		 soft.assertTrue(dashboardpage.navigateToPeoplePage(),"People Menu is not Displayed"); 		
		 soft.assertTrue(dashboardpage.navigateToSalesPage(),"Sales Menu is not Displayed"); 	 
		 soft.assertTrue(dashboardpage.navigateToExpensesPage(),"Expenses Menu is not Displayed"); 		 
		 soft.assertTrue(dashboardpage.navigateToCategoriesPage(),"Categories Menu is not Displayed");		 
		 soft.assertAll();
	}
	@Test(groups= {"Regression"},priority= 4,enabled=true)
	public void ValidateTheClickabilityOfTheField()
	{
		 dashboardpage.navigateToPOSPage();
		 Assert.assertEquals("POS","Failure message- POS Menu Cannot be Accessed");
		 browseractionsutil.moveBacktoPreviousPage(driver);
		 dashboardpage.navigateToProductPage();
		 Assert.assertEquals("Product","Failure message- Product Menu Cannot be Accessed");
		 browseractionsutil.moveBacktoPreviousPage(driver);
		 dashboardpage.navigateToStoresPage();
		 Assert.assertEquals("Stores","Failure message- Stores Menu Cannot be Accessed");
		 browseractionsutil.moveBacktoPreviousPage(driver);
		 dashboardpage.navigateToPeoplePage();
		 Assert.assertEquals("People","Failure message- People Menu Cannot be Accessed");
		 dashboardpage.navigateToSalesPage();
		 Assert.assertEquals("Sales","Failure message- Sales Menu Cannot be Accessed");
		 dashboardpage.navigateToExpensesPage();
		 Assert.assertEquals("Expense","Failure message- Expenses Menu Cannot be Accessed");
		 dashboardpage.navigateToCategoriesPage();
		 Assert.assertEquals("Categories","Failure message- Categories Menu Cannot be Accessed");
	}
	
	/**
	 * Method to Check whether LogOut Button is functioning
	 * @throws IOException 
	 */
	

	@Test(groups= {"Regression"},priority= 5,enabled=true)
	public void verifySignOutButtonTC05() throws Exception  {
		loginpage = new LoginPage(driver);
		dashboardpage = new DashboardPage(driver);
		loginpage.typeUsername(loginpage.readStringData("Credentials","UserCredentials", 1, 0));
    	loginpage.typePassword(loginpage.readStringData("Credentials","UserCredentials", 1, 1));
		loginpage.clickLogin();
		loginpage.clickLogOutbtn();
		
	}

	
}
