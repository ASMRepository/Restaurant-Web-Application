package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class AutomationBase {

	static WebDriver driver;
	
	public static WebDriver launchBrowser(String browserName,String URL)
	{
		if(browserName.equals("Chrome"))
			launchChromeBrowser();
		else if(browserName.equals("Edge"))
			launchEdgeBrowser();
		else if(browserName.equals("Firefox"))
			launchFirefoxBrowser();
		else if(browserName.equals("Safari"))
			launchSafariBrowser();
		return driver;
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	public static WebDriver launchChromeBrowser()
	{
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return driver;
	}
	public static WebDriver launchEdgeBrowser()
	{
		try {
			driver=new EdgeDriver();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return driver;
	}
		public static WebDriver launchFirefoxBrowser()
		{
			try {
				driver=new FirefoxDriver();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			}
			return driver;
	}
	
		public static WebDriver launchSafariBrowser()
		{
			try {
				driver=new SafariDriver();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			}
			return driver;
	}
}
