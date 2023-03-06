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

public class WaiterPage {
	WebDriver driver;
	ActionUtil actionutil=new ActionUtil();
	ValidationActionUtil validationactionutil=new ValidationActionUtil();
	WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();
	WaitUtil waitutil=new WaitUtil();

	public WaiterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Waiters']")
	WebElement WaitersMenu;
	
	@FindBy(xpath="(//i[@class='fa fa-pencil'])")  
	List<WebElement> EditWaiter;
	
	@FindBy(xpath="(//button[@class='btn btn-add btn-lg'])")
	WebElement AddWaiterbtn;
	
	@FindBy(xpath="//h4[text()='Add Waiter']")
	WebElement AddWaiterTitle;
	
	@FindBy(xpath="//input[@id='WaiterName']")
	public
	WebElement WaiterName;
	
	@FindBy(xpath="//input[@id='WaiterPhone']")
	WebElement WaiterPhonefield;
	
	@FindBy(xpath="//input[@id='WaiterEmail']")
	WebElement WaiterEmailfield;
	
	@FindBy(xpath="//select[@id='WaiterStore']")
	WebElement WaiterStorefield;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement AddWaiterSubmitbtn;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement AddWaiterClosebtn;
	
	@FindBy(xpath="//span[text()='×']")
	WebElement AddWaiterXbtn;
	
	
	@FindBy(xpath="//a[@class='btn btn-default float-right']")
	WebElement EditWaiterBackbtn;
	
	@FindBy(xpath="//i[@class='fa fa-times']")
	List<WebElement> DeleteWaiterbtn;
	
	@FindBy(xpath="//a[text()='Yes, delete it!']")
	List<WebElement> DeleteWaiterConfirmationbtn;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SearchWaiter;
	
	public void validateAddWaiterbtn() {
		  validationactionutil.isElementDisplayed(driver, AddWaiterbtn);
	  }
	public void validateEditWaiterbtn() {
		  validationactionutil.isElementDisplayed(driver, EditWaiter);
	  }
	public void validateDeleteWaiterbtn() {
		validationactionutil.isElementDisplayed(driver, DeleteWaiterbtn);
	}
	public void addNewWaiter() {
		actionutil.clickAnElement(driver, AddWaiterbtn);
		
	}
	public void enterWaiterName(String item) {
		actionutil.EnterValueInUser(driver, AddWaiterbtn, item);
	}
	public void enterWaiterPhoneNumber(String item) {
		actionutil.EnterValueInUser(driver, AddWaiterbtn, item);
	}
	public void enterWaiterEmailID(String item) {
		actionutil.EnterValueInUser(driver, AddWaiterbtn, item);
	}
	public void selectWaitersStoreName(String item) {
		webelementactionsutil.dropdownSelectionUsingValue(driver, AddWaiterbtn, item);
	}
	public void submitNewWaiterDetails() {
		actionutil.clickAnElement(driver, AddWaiterSubmitbtn);
	}
	public void CloseAddNewWaiterScreen() {
		actionutil.clickAnElement(driver, AddWaiterClosebtn);
	}
	public void clickXbuttonFromAddNewWaiterScreen() {
		actionutil.clickAnElement(driver, AddWaiterXbtn);
	}
	public void editWaiterDetails() {
		actionutil.clickAnElement(driver, EditWaiter);
	}
	public void deleteWaiterDetails() {
		actionutil.clickAnElement(driver, DeleteWaiterbtn);
	}
	public void searchWaiter(String item) {
		actionutil.EnterValueInUser(driver, SearchWaiter, item);
	}
}
