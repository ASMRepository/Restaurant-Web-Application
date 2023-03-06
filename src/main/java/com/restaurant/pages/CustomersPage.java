package com.restaurant.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.ActionUtil;

public class CustomersPage {
		WebDriver driver;
		ActionUtil actionutil=new ActionUtil();

		public CustomersPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
		@FindBy(xpath="//span[text()='Customers']")
		WebElement CustomersMenu;
		
		@FindBy(xpath="//button[@class='btn btn-add btn-lg']")
		WebElement AddCustomerbtn;
		
		@FindBy(xpath="//input[@id='CustomerName']")
		public 
		WebElement CustomerName;
		
		@FindBy(xpath="//input[@id='CustomerPhone']") 
		WebElement CustomerPhone;
		
		@FindBy(xpath="//input[@type='email']")
		WebElement CustomerEmailID;
		
		@FindBy(xpath="//input[@id='CustomerDiscount']")
		public WebElement CustomerDiscountPrice;
		
		@FindBy(xpath="//button[text()='Submit']")       
		WebElement CustomerDetailsSubmitBtn;
		
		@FindBy(xpath="//button[text()='Close']")
		WebElement CustomerDetailsCloseBtn;
		
		@FindBy(xpath="//i[@class='fa fa-pencil']")
		List<WebElement> EditCustomerDetailsbtn;
		
		@FindBy(xpath="//input[@value='Aarush']")
		WebElement EditCustomer;
		
		@FindBy(xpath="//a[@onclick='history.back(-1)']")
		WebElement EditCustomerBackbtnToPreviousPage;
		
		
		@FindBy(xpath="(//a[@data-toggle='popover'])")
		List<WebElement> DeleteCustomer;
		
		@FindBy(xpath="(//a[@class='btn btn-default'])")
		List<WebElement> DeleteCustomerConfirmationbtn;
		
		@FindBy(xpath="(//input[@type='search'])")
		WebElement SearchCustomer;
		
		
		public void addNewCustomer() {
			actionutil.clickAnElement(driver, AddCustomerbtn);
			
		}
		public void enterCustomerName(String item) {
			actionutil.EnterValueInUser(driver, CustomerName, item);
		}
		public void enterCustomerPhoneNumber(String item) {
			actionutil.EnterValueInUser(driver, CustomerPhone, item);
		}
		public void enterCustomerEmailID(String item) {
			actionutil.EnterValueInUser(driver, CustomerEmailID, item);
		}
		public void enterCustomerDiscountPrice(String item) {
			actionutil.EnterValueInUser(driver, CustomerDiscountPrice, item);
		}
		public void submitNewCustomerDetails() {
			actionutil.clickAnElement(driver, CustomerDetailsSubmitBtn);
		}
		public void closeNewCustomerDetailsScreen() {
			actionutil.clickAnElement(driver, CustomerDetailsCloseBtn);
			
		}
		public void editCustomerDetails() {
			actionutil.clickAnElement(driver, EditCustomerDetailsbtn);
		}
		
		public void clickBackbtnfromEditScreen() {
			actionutil.clickAnElement(driver, EditCustomerBackbtnToPreviousPage);
		}
		public void deleteCustomerDetails() {
			actionutil.clickAnElement(driver, DeleteCustomer);
			actionutil.clickAnElement(driver, DeleteCustomerConfirmationbtn);
		}
		
		public void searchCustomer(String item) {
			actionutil.clickAnElement(driver, SearchCustomer);
			actionutil.EnterValueInUser(driver, AddCustomerbtn, item);
			
		}
		
		
}
