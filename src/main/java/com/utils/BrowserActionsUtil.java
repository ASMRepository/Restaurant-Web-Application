package com.utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserActionsUtil {

public void launchURL(WebDriver driver,String URL) {
	try {
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	
}
	
	public void navigatetoWebsite(WebDriver driver,String url)
	{
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	public void moveBacktoPreviousPage(WebDriver driver)
	{
		try {
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	public void movetoNextPage(WebDriver driver)
	{
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	public void getSiteTitle(WebDriver driver) 
	{
		try {
		driver.getTitle();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
}

	
	public void getSiteURL(WebDriver driver) 
	{
		try {
		driver.getCurrentUrl();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
}
	public void maximize(WebDriver driver)
	
	{
		try {
			driver.manage().window().maximize();
			}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	
public void minimize(WebDriver driver)
	
	{
		try {
			driver.manage().window().minimize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
		}
	public void closeAllWindows(WebDriver driver)
	{
	try {
		driver.quit();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	}
	public void closeCurrentWindow(WebDriver driver)
	{
	try {
		driver.close();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	}
	
	
	public void refreshBrowser(WebDriver driver)
	{
	try {
		driver.navigate().refresh();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	}
	
	/*public void scrollByVisibilityOfElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
	}*/
	
}
