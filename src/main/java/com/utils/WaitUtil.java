package com.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

	
	public void implicitWait(WebDriver driver,int timeout)
	{
			try {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			}
		
		}
	
	public void elementToBeSelectedExplicitWait(WebDriver driver,WebElement element,int timeout) {
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.elementToBeSelected(element));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
	
public void elementVisibilityExplicitWait(WebDriver driver,WebElement element,int timeout) {
		
		try {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
	
public void fluentWait(WebDriver driver,WebElement element,int timeout) {

	try {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		Wait<WebDriver> waitInParticularInterval=new FluentWait<WebDriver>(driver);
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}

}}


