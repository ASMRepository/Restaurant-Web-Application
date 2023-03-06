package com.restaurant.tests;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.AutomationBase;
import com.base.AutomationBase2;
import com.beust.jcommander.Parameters;
import com.restaurant.pages.DashboardPage;
import com.restaurant.pages.LoginPage;
import com.utils.BrowserActionsUtil;
import com.utils.ExcelUtil;
import com.utils.PropertyUtil;
import com.utils.WaitUtil;

public class LoginPageTest extends AutomationBase{

	
	WebDriver driver;
	LoginPage userLoginPage;
	DashboardPage dashboardpage;
	WaitUtil waitutil;
	PropertyUtil propertyutil=new PropertyUtil();
	BrowserActionsUtil browseractionsutil=new BrowserActionsUtil();
	Properties prop;
	
	
	/*@Parameters("browserType")
	public void setup(String browserType) {
		driver=launchBrowser(browserType);
		
	}*/
	
	@BeforeMethod
	public Properties preRun() throws IOException
	{
		driver=getDriver();
		waitutil=new WaitUtil();
		prop = propertyutil.getProperty("Credentials.properties");
		//driver.get(prop.getProperty("URL"));
	    driver=AutomationBase.launchBrowser("Chrome",prop.getProperty("URL"));
	    
		//driver.get("https://qalegend.com/restaurant/login");

		System.out.println("URL is:" +prop.getProperty("URL"));
		System.out.println("Username is:" +prop.getProperty("username"));
		System.out.println("Password is:" +prop.getProperty("password"));
		return prop;
}
	
	//Validate Invalid Credential Check

	
	
	//Validate Successful Login
	@Test(groups= {"Regression"},priority= 1,enabled=true)
	public void validateValidlogin() {
		
		userLoginPage= new LoginPage(driver);
		userLoginPage.typeUsername(prop.getProperty("username"));
		userLoginPage.typePassword(prop.getProperty("password"));
		userLoginPage.clickLogin();
		//Boolean RestaurantLogo = dashboardpage.isRestaurantLogoDisplayed();
		//Assert.assertEquals(RestaurantLogo, "RestaurantLogo", "Restaurant Logo is Not Displayed");
	}
	
	
	public void validateInvalidCredentialsCheck() {
		
		driver.navigate().refresh();
		userLoginPage.typeUsername("WrongUserName");
		userLoginPage.typePassword("Invalid");
		//Assert.assertTrue(userLoginPage., "Error Message is displayed");
	}
	@Test(groups= {"Regression"},priority= 2,enabled=true)
	public void validLogOut() {
		userLoginPage.clickLogOutbtn();
		//Assert.assertEquals(userLoginPage.clickLogOutbtn(), "LogOutButton is not functioning");
	}
	/*public void navigateToHomePage() {
		driver.get("https://qalegend.com/restaurant/");
		
	}*/
	
	}
	
	
	
