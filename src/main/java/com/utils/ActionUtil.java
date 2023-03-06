package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ActionUtil {
	/**
	 * This method is used to click an Element
	 * @param driver
	 * @param element
	 * @param text
	 * @return 
	 */
	
	public WebElement clickAnElement(WebDriver driver,WebElement element) {
		
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return element;
		}
		/**
		 * This method is used to clear text entered by user
		 * @param driver
		 * @param element
		 * @param text
		 */
	public void clickAnElement(WebDriver driver, List<WebElement> elements) {
		try {
			((WebElement) elements).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	
	}

		public void clearField(WebDriver driver,WebElement element) {
			
			try {
				element.clear();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			}
			}
		
		/**
		 * This method is used to clear text entered by user & Enter New Text
		 * @param driver
		 * @param element
		 * @param text
		 */
		

		public void clearAndEnterValueField(WebDriver driver,WebElement element,String text) {
			
			try {
				element.clear();
				element.sendKeys(text);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			}
			
		}
		/**
		 * This method is used to enter text into a user field
		 * @param driver
		 * @param element
		 * @param text
		 */
		public String EnterValueInUser(WebDriver driver,WebElement element,String text) {
			
			try {
				element.sendKeys(text);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			}
			return null;
			}   
		
		

	/**MouseAction Click Action
	 * 
	 * @param driver
	 * @param element
	 */
	public void click(WebDriver driver,WebElement element)
 {
 try {
	Actions act=new Actions(driver);
	 act.moveToElement(element).click().build().perform();
} catch (Exception e) {
	System.out.println(e.getMessage());
	System.out.println(e.getCause());
}
}
	/**MouseAction RightClick Action
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver,WebElement element)
	{
	try {
		Actions act=new Actions(driver);
		act.moveToElement(element).contextClick().build().perform();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	}
	/**MouseAction DoubleClick Action
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver,WebElement element)
	{
		try {
			Actions act=new Actions(driver);
			act.doubleClick().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
	
	

	/**MouseAction Drag And Drop Action
	 * 
	 * @param driver
	 * @param element
	 * @param element1
	 */
	public void dragAndDrop(WebDriver driver,WebElement Source,WebElement Target)
	{
	try {
		Actions act=new Actions(driver);
		act.dragAndDrop(Source, Target).build().perform();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
	
	}
	/**MouseAction Click And Hold Action
	 * 
	 * @param driver
	 * @param element
	 */
	public void clickAndHold(WebDriver driver,WebElement element)
	{
	try {
		Actions act=new Actions(driver);
		act.clickAndHold().build().perform();
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
	}
}
	/*public void EnterAnElement((WebDriver driver,WebElement element))
	
	
	Actions act=new Actions(driver);
	act.sendKeys(element, null).build().perform();
	*/
	
	
	
	/**KeyboardAction Key Up
	 * 
	 * @param driver
	 * @param element
	 */
	
	public void keyUp(WebDriver driver,WebElement element,String Keys) {
		
		try {
			Actions act=new Actions(driver);
			act.moveToElement(element).click().keyUp(element,Keys).sendKeys().build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
	
	/**KeyboardAction Key Down
	 * 
	 * @param driver
	 * @param element
	 */
	public void keyDown(WebDriver driver,WebElement element,String Keys) {
	
		
		try {
			Actions act=new Actions(driver);
			act.click().keyDown(element,Keys).build().perform();	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
}
	
	
}