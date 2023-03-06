package com.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementActionsUtil {
WebDriver driver;
Select selectdropDown;

 	public void preRun() {
 		driver=new ChromeDriver();
 		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0rhq7b2g8bizoxr64z9ej3v36465374.node0	");
 	}
 	public void dropDownFunction(WebDriver driver, WebElement element, String dropdownitem) {
		Select select = new Select(element);
		select.selectByVisibleText(dropdownitem);
		WebElement selectedValue = select.getFirstSelectedOption();
		System.out.println(selectedValue.getText());
	}

 	
	public void dropdownSelectionUsingIndex(WebDriver driver,WebElement element,int index)
	{
		selectdropDown=new Select(element);
		try {
			selectdropDown.selectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
	public void dropdownSelectionUsingVisibleText(WebDriver driver,WebElement element,String text)
	{
		
		selectdropDown=new Select(element);
		try {
			selectdropDown.selectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
	public void dropdownSelectionUsingValue(WebDriver driver,WebElement element,String value)
	{
		selectdropDown=new Select(element);
		try {
			selectdropDown.selectByValue(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
	//-----------------------------------------------------------
	public void deSelectDropdownUsingIndex(WebDriver driver,WebElement element,int index)
	{
		selectdropDown=new Select(element);
		try {
			selectdropDown.deselectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	public void deSelectDropdownUsingVisibleText(WebDriver driver,WebElement element,String text)
	{
		selectdropDown=new Select(element);
		try {
			selectdropDown.deselectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	public void deSelectDropdownUsingValue(WebDriver driver,WebElement element,String Value)
	{
		selectdropDown=new Select(element);
		try {
			selectdropDown.deselectByValue(Value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	public void deSelectAllOptions(WebDriver driver,WebElement element)
	{
		selectdropDown=new Select(element);
		try {
			selectdropDown.deselectAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	/**
	 * This method is used to accept an alert
	 * @param driver
	 */
	public void AcceptAlert(WebDriver driver)
	{
		try {
			Alert popup=driver.switchTo().alert();
			popup.accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	/**
	 * This method is used to dismiss an alert
	 * @param driver
	 */
	public void DismissAlert(WebDriver driver)
	{
		try {
			Alert popup=driver.switchTo().alert();
			popup.dismiss();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	public void checkAlertWithText(WebDriver driver,WebElement element,String text) {
			
	
				try {
					Alert popup=driver.switchTo().alert();
					text = element.getText();
		
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println(e.getCause());
				}
 	}
	
	public void switchToFrame(WebDriver driver,int index)
	{
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	public void switchToParentFrame(WebDriver driver,int index)
	{
		try {
			driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

}
