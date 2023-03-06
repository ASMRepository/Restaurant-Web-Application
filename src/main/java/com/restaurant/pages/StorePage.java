package com.restaurant.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.ActionUtil;
import com.utils.ValidationActionUtil;
import com.utils.WaitUtil;

public class StorePage {

	WebDriver driver;
	ActionUtil actionutil=new ActionUtil();
	ValidationActionUtil validationactionutil=new ValidationActionUtil();
	WaitUtil waitutil=new WaitUtil();

	public StorePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='menu-text'])[3]")
	WebElement Stores;
	
	@FindBy(xpath="//i[@class='fa fa-list-ol']")
	List<WebElement> ManageTable;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement SearchStore;
	
	
	@FindBy(xpath="(//button[@class='btn btn-add btn-lg']")
	WebElement AddStore;
	
	@FindBy(xpath="//input[@id='StoreName']")
	public
	WebElement StoreName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='StorePhone']")
	WebElement StorePhone;
	
	@FindBy(xpath="//input[@id='Country']")
	WebElement Country;
	
	@FindBy(xpath="//input[@id='City']")
	WebElement City;
	
	@FindBy(xpath="//input[@id='Adresse']")
	WebElement Adresse;
	
	@FindBy(xpath="//label[text()='Custome Footer for the receipt']")
	WebElement CustomerFooter;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Submitbtn;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement Closebtn;
	
	@FindBy(xpath="//span[text()='×']")
	WebElement Xbtn;
	
	@FindBy(xpath="(//a[@data-original-title='Edit']")
	List<WebElement> EditStore; 
	
	@FindBy(xpath="//a[@class='btn btn-default float-right']")
	WebElement EditStoreBackbtn;
	
	@FindBy(xpath="//a[@data-original-title='Delete']")
	List<WebElement> DeleteStore; 
	
	@FindBy(xpath="//th[@class='sorting_asc']")
	WebElement SortingAscending;
	
	public void validateAddStorebtn() {
		  validationactionutil.isElementDisplayed(driver, AddStore);
	  }
	  
	public void validateEditStorebtn() {
		  validationactionutil.isElementDisplayed(driver, EditStore);
	  }
	public void validateSearchStore() {
		  validationactionutil.isElementDisplayed(driver, SearchStore);
	  }
		
	public void validateDeleteStorebtn() {
		  validationactionutil.isElementDisplayed(driver, DeleteStore);
	  }


	public void searchStore(String item) {
			actionutil.EnterValueInUser(driver, SearchStore, item);
				
		}

	public void addStorebtn() {
		actionutil.clickAnElement(driver, AddStore);
	}
	public void enterStoreName(String item) {
		actionutil.EnterValueInUser(driver, AddStore, "Store Name");
	}
	public void enterEmail(String item) {
		actionutil.EnterValueInUser(driver, AddStore, "Email");
	}
	public void enterStorePhone(String item) {
		actionutil.EnterValueInUser(driver, AddStore, "Store Phone");
	}
	public void enterCountryName(String item) {
		actionutil.EnterValueInUser(driver, AddStore, "Country");
	}
	public void enterCity(String item) {
		actionutil.EnterValueInUser(driver, AddStore, "City");
	}
	public void enterAddress(String item) {
		actionutil.EnterValueInUser(driver, AddStore, "Adresse");
	}
	public void enterCustomerFooter(String item) {
		actionutil.EnterValueInUser(driver, AddStore, "Customer Footer");
	}
	public void clickOnSubmitbtn() {
		actionutil.clickAnElement(driver, Submitbtn);
	}
	
	public void clickClosebtn() {
		actionutil.clickAnElement(driver, Closebtn);	
	}
	public void clickXbtn(){
		actionutil.clickAnElement(driver, Xbtn);
	}
	
	public void clickEditStorebtn() {
		actionutil.clickAnElement(driver, EditStore);
	}
	public void clickDeletebtn() {
	actionutil.clickAnElement(driver, DeleteStore);
}
}
