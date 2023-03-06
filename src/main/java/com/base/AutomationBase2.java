package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class AutomationBase2 {

	static WebDriver driver;
	
	public static WebDriver launchBrowser(String browserName,String URL)
	{
		if(browserName.equals("Chrome"))
			driver=new ChromeDriver();
		else if(browserName.equals("Edge"))
			driver=new EdgeDriver();
		else if(browserName.equals("Firefox"))
			driver=new FirefoxDriver();
		else if(browserName.equals("Safari"))
			driver=new SafariDriver();
		
		driver.manage().window().maximize();
		driver.get(URL);
		return driver;
		
		
		
	}
	
		
	}
