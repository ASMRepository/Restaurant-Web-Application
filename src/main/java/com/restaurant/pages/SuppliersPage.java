package com.restaurant.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.ActionUtil;
import com.utils.ValidationActionUtil;
import com.utils.WaitUtil;
import com.utils.WebElementActionsUtil;

public class SuppliersPage {
	WebDriver driver;
	ActionUtil actionutil=new ActionUtil();
	ValidationActionUtil validationactionutil=new ValidationActionUtil();
	WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();
	WaitUtil waitutil=new WaitUtil();

	public SuppliersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='btn btn-add btn-lg']")
	WebElement AddSupplierbtn;
	
	@FindBy(xpath="//input[@id='SupplierName']")
	public
	WebElement SupplierName;
	
	@FindBy(xpath="//input[@id='SupplierPhone']")
	WebElement SupplierPhone;
	
	@FindBy(xpath="//input[@id='SupplierEmail']")
	WebElement SupplierEmail;
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
	WebElement Note;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement CloseBtn;
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	List<WebElement> EditSupplierbtn;
	
	@FindBy(xpath="//i[@class='fa fa-arrow-left']")
	WebElement BackBtnEditSupplier;
	
	@FindBy(xpath="//i[@class='fa fa-times']")
	List<WebElement> DeleteSupplierbtn;
	
	@FindBy(xpath="//a[text()='Yes, delete it!']")
	WebElement DeleteConfirmationbtn;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SearchSupplier;
	
	public void addNewSupplierDetails() {
		actionutil.clickAnElement(driver, AddSupplierbtn);
	}
	public void enterSupplierName(String item) {
		actionutil.EnterValueInUser(driver, SupplierName, item);
	}
	public void enterSupplierPhone(String item) {
		actionutil.EnterValueInUser(driver, SupplierPhone, item);
	}
	public void enterSupplierEmail(String item) {
		actionutil.EnterValueInUser(driver, SupplierEmail, item);
	}
	public void enterSupplierNote(String item) {
		actionutil.EnterValueInUser(driver, Note, item);
	}
	public void submitNewSupplierDetails() {
		actionutil.clickAnElement(driver, SubmitBtn);
	}
	public void CloseAddNewSupplierScreen() {
		actionutil.clickAnElement(driver, CloseBtn);
	}
	public void editSupplierDetails() {
		actionutil.clickAnElement(driver, EditSupplierbtn);
	}
	public void deleteSupplierDetails() {
		actionutil.clickAnElement(driver, DeleteSupplierbtn);
		actionutil.clickAnElement(driver, DeleteConfirmationbtn);
	}
	
	public void searchSupplier(String item) {
		actionutil.EnterValueInUser(driver, SearchSupplier, item);
	}
}
