package com.restaurant.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.base.AutomationBase2;
import com.beust.jcommander.Parameters;
import com.restaurant.pages.DashboardPage;
import com.restaurant.pages.LoginPage;

public class DashboardNavigation extends AutomationBase2{

	
	WebDriver driver;
	LoginPage userLoginPage;
	DashboardPage dashboardpage=PageFactory.initElements(driver,DashboardPage.class);
	SoftAssert soft=new SoftAssert();
	
	
	/*@Parameters("browserType")
	public void setup(String browserType) {
		driver=launchBrowser(browserType);
		
	}*/
	@BeforeMethod
	public void preRun()
	{
	    driver=AutomationBase2.launchBrowser("Firefox","https://qalegend.com/restaurant/login");
		/*driver= getDriver();
		driver.get("https://qalegend.com/restaurant/login");*/	
	}
	@BeforeMethod
	/*public void prerun(){
	//driver=getDriver();
	userLoginPage = new LoginPage(driver);
	dashboardpage =LoginPage.login("admin","password");
	}*/
	/*@BeforeClass
	public void preRun()
	{
	    driver=AutomationBase2.launchBrowser("Firefox","https://qalegend.com/restaurant/login");
		/*driver= getDriver();
		driver.get("https://qalegend.com/restaurant/login");
	}*/
	
	//Validate Successful Login
	@Test(priority= 1)
	public void loginCheck() {
		
		userLoginPage= new LoginPage(driver);
		userLoginPage.typeUsername("admin");
		userLoginPage.typePassword("password");
		userLoginPage.clickLogin();
		System.out.println("URL :" +driver.getCurrentUrl());
		System.out.println("Title: " +driver.getTitle());
		LoginPage.login("admin","password");
	}
	@Test(priority= 2)
	public void dashboardMenuCheck()
	{
		//dashboardpage.clickonPOSPage();
		//dashboardpage.clickonProductPage();
		//dashboardpage.clickonStoresPage();
		dashboardpage.isPOSMenuDisplayed();
		dashboardpage.clickonPOSPage();
	}	
		//
		/* 		dashboardpage.clickOnDashboardMenus(driver, null);
		dashboardpage.clickonPeoplePage();
		//soft.assertEquals(dashboardpage.clickonProductPage(), "User able to view Products Menu");
		clickOnDashboardMenus
	}*/
	
	}
	
	
	
