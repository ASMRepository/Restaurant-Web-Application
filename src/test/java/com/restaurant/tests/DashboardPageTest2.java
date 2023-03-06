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

public class DashboardPageTest2 extends AutomationBase2{

	
	WebDriver driver;
	LoginPage userLoginPage;
	DashboardPage dashboardpage=PageFactory.initElements(driver,DashboardPage.class);
	SoftAssert soft=new SoftAssert();
	
	/*@Parameters("browserType")
	public void setup(String browserType) {
		driver=launchBrowser(browserType);
		
	}*/
	
	@BeforeClass
	public void preRun()
	{
	    driver=AutomationBase2.launchBrowser("Firefox","https://qalegend.com/restaurant/login");
		/*driver= getDriver();
		driver.get("https://qalegend.com/restaurant/login");*/	
	}
	//Validate Successful Login
	@Test(priority= 1)
	public void loginCheck() {
		
		userLoginPage= new LoginPage(driver);
		userLoginPage.typeUsername("admin");
		userLoginPage.typePassword("password");
		userLoginPage.clickLogin();
		System.out.println("URL :" +driver.getCurrentUrl());
		System.out.println("Title: " +driver.getTitle());
		
	}
	@Test(priority= 2)
	public void dashboardMenuCheck() throws InterruptedException
	{
		//dashboardpage.isProductMenuDisplayed();
		Thread.sleep(5000);
		
		dashboardpage.clickonProductPage();
		
	}	
	/*public void navigateToHomePage() {
		driver.get("https://qalegend.com/restaurant/");
		
	}*/
	
	}
	
	
	
