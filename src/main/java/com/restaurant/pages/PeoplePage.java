package com.restaurant.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.ActionUtil;
import com.utils.BrowserActionsUtil;
import com.utils.ValidationActionUtil;

public class PeoplePage {

	
		WebDriver driver;
		ActionUtil actionutil=new ActionUtil();
		ValidationActionUtil validationaction=new ValidationActionUtil();
		BrowserActionsUtil browseractionsutil=new BrowserActionsUtil();

		public PeoplePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
	
		@FindBy(xpath="//a[@data-toggle='dropdown'][1]")
		WebElement PeopleMenu;
		
		@FindBy(xpath="//span[text()='Waiters']")
		WebElement WaitersMenu;
		
		@FindBy(xpath="//span[text()='Customers']")
		WebElement CustomersMenu;
		
		@FindBy(xpath="//span[text()='Suppliers']")
		WebElement SuppliersMenu;
		
		public void navigateToWaitersMenu() {
			actionutil.clickAnElement(driver,WaitersMenu);
		}
		public void navigateToCustomersMenu() {
			actionutil.clickAnElement(driver,CustomersMenu);
		}
		public void navigateToSuppliersMenu() {
			actionutil.clickAnElement(driver,SuppliersMenu);
		}
		public boolean isWaitersMenuDisplayed() {
		return validationaction.isElementDisplayed(driver,WaitersMenu);
		}
		public boolean isCustomersMenuDisplayed() {
			return validationaction.isElementDisplayed(driver,CustomersMenu);
		}
		public boolean isSuppliersMenuDisplayed() {
			return validationaction.isElementDisplayed(driver,SuppliersMenu);
		}
		
		
		
		
}
