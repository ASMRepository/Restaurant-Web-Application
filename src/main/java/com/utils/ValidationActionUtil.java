package com.utils;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidationActionUtil {

	/**
	 * This method is used to determine whether field is enabled or not
	 * @param driver
	 * @param element
	 * @param value
	 */
	public boolean isElementEnabled(WebDriver driver,WebElement element) {
		boolean elementEnabled=false;
		try {
			if(element.isEnabled())
				elementEnabled=true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return elementEnabled;
		}   
	/**
	 * This method is used to determine whether a specific field is visible on a  page or not
	 * @param driver
	 * @param element
	 */
	public boolean isElementDisplayed(WebDriver driver,WebElement element) {
	boolean flag=false;
	try {
		if(element.isDisplayed())
			flag=true;
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	return flag;
	} 
	/**
	 * This method is used to determine whether a specific field is selected or not
	 * @param driver
	 * @param element
	 */
		public boolean isElementSelected(WebDriver driver,WebElement element) {
		
			boolean elementSelected=false;
		try {
			if(element.isSelected())
				elementSelected=true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return elementSelected;
		}
	/**
	 * This method is used to determine whether list of elements are displayed or not
	 * @param driver
	 * @param elements
	 * @return
	 */
		public boolean isElementDisplayed(WebDriver driver, List<WebElement> elements) {
		boolean flag=false;
		try {
			if(elements.contains(elements))
				flag=true;
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
		return flag;
	}
	
}
