package com.restaurant.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.utils.ActionUtil;
import com.utils.BrowserActionsUtil;
import com.utils.ExcelUtil;
import com.utils.ValidationActionUtil;
public class DashboardPage {

		WebDriver driver;
		ActionUtil actionutil=new ActionUtil();
		ValidationActionUtil validationaction=new ValidationActionUtil();
		BrowserActionsUtil browseractionsutil=new BrowserActionsUtil();
		SoftAssert soft=new SoftAssert();
		
		public DashboardPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//h1[@class='text-center choose_store']")
		WebElement DashboardTitle;
		
		@FindBy(xpath="//span[@class='store_title']") 
		WebElement DashboardItem;
		@FindBy(xpath="//img[@alt='logo']")
		WebElement RestaurantLogo;
		@FindBy(xpath="(//span[@class='menu-text'])[1]")
		WebElement POS;
		/*@FindBy(xpath="(//span[@class='menu-text'])[2]")
		WebElement Product;*/
		@FindBy(xpath="(//a/span[text()='Product'])[1]")
		List<WebElement> Product;
		@FindBy(xpath="(//span[@class='menu-text'])[3]")
		WebElement Stores;
		@FindBy(xpath="(//span[@class='menu-text'])[4]")
		WebElement People;
		@FindBy(xpath="(//span[@class='menu-text'])[8]")
		WebElement Sales;
		@FindBy(xpath="(//span[@class='menu-text'])[9]")
		WebElement Expense;
		@FindBy(xpath="(//span[@class='menu-text'])[10]")
		WebElement Categories;
		@FindBy(xpath="//span[text()='Setting']")
		WebElement Setting;
		@FindBy(xpath="//span[text()='Reports']")
		WebElement Reports;
		@FindBy(xpath="//a[@href='https://qalegend.com/restaurant/logout']")
		WebElement logout;
		
		public void mouseOverLogo() {
			actionutil.clickAnElement(driver, RestaurantLogo);
		}
		public boolean navigateToPOSPage() {
			actionutil.clickAnElement(driver,POS);
			return false;
		}
		public boolean navigateToStoresPage() {
			actionutil.clickAnElement(driver,Stores);
			return false;
	
		}
		
		public ProductPage navigateToProductPage() {
			actionutil.clickAnElement(driver,Product);
			return (ProductPage) Product;
		}
		
		public boolean navigateToPeoplePage() {
			actionutil.clickAnElement(driver,People);
			return false;
		}
		public boolean navigateToSalesPage() {
			actionutil.clickAnElement(driver,Sales);
			return false;
		}	
		public boolean navigateToExpensesPage() {
			actionutil.clickAnElement(driver,Expense);
			return false;
		}	
		public boolean navigateToCategoriesPage() {
			actionutil.clickAnElement(driver,Categories);
			return false;
		}
		public boolean isPOSMenuDisplayed() {
		return validationaction.isElementDisplayed(driver,POS);
		}
		public boolean isProductMenuDisplayed() {
		return validationaction.isElementDisplayed(driver,Product);
		}
		public boolean isStoresMenuDisplayed() {
		return validationaction.isElementDisplayed(driver,Stores);
			}
		public boolean isRestaurantLogoDisplayed() {
			return validationaction.isElementDisplayed(driver,RestaurantLogo);
		}
			
			/*public void goTo()
			{
				driver.get("https://qalegend.com/restaurant/#");
			}*/
			            
		
		public void clickLogOut() {
			actionutil.clickAnElement(driver,logout);
		}



}
