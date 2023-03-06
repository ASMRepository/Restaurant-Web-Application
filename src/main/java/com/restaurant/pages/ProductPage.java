package com.restaurant.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.ActionUtil;
import com.utils.ValidationActionUtil;
import com.utils.WaitUtil;

public class ProductPage {
	WebDriver driver;
	ActionUtil actionutil=new ActionUtil();
	ValidationActionUtil validationactionutil=new ValidationActionUtil();
	WaitUtil waitutil=new WaitUtil();
	

public ProductPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath="//button[text()='Add Product'][1]")
WebElement AddProduct;


@FindBy(xpath="//a[text()='Download CSV']")
WebElement DownloadCSV;

@FindBy(xpath="//a[text()='Upload CSV file']")
WebElement UploadCSV;

@FindBy(xpath="(//input[@name='userfile'])[1]")
String UploadCSVFileUpload;

@FindBy(xpath="(//button[text()='Submit'])[1]")
WebElement UploadCSVSubmitbtn;

@FindBy(xpath="(//button[text()='Close'])[3]")
WebElement UploadCSVClosebtn;
		
@FindBy(xpath="(//span[text()='×'])[7]")
WebElement UploadCSVxbtn;

@FindBy(xpath="//i[@class='fa fa-barcode']")
List<WebElement> ModifyStock;

@FindBy(xpath="//select[@id='Brrows']")
WebElement StockNumber;

@FindBy(xpath="//button[text()='submit'][3]")
WebElement ModifyStockSubmitbtn;

@FindBy(xpath="//button[text()='Close'][7]")
WebElement ModifyStockClosebtn;

@FindBy(xpath="//span[text()='×'][11]")
WebElement ModifyStockxbtn;

@FindBy(xpath="//input[@type='number'][4]")
WebElement StockColumnNumber;

@FindBy(xpath="//a[text()='PrintMenu']")
WebElement PrintMenu;

@FindBy(xpath="//button[text()='Apply Filter']")
WebElement ApplyFilter;

@FindBy(xpath="//input[@type='search']")
WebElement Search;

@FindBy(xpath="//h4[text()='View product']")
WebElement ViewProduct;

@FindBy(xpath="(//i[@class='fa fa-times'])[1]")
WebElement DeleteProduct;

@FindBy(xpath="(//i[@class='fa fa-pencil'])[1]")
WebElement EditProduct;


public void validateProductPage()
{
	
	validationactionutil.isElementDisplayed(driver, AddProduct);
	validationactionutil.isElementDisplayed(driver, ApplyFilter);
	validationactionutil.isElementDisplayed(driver, Search);
	validationactionutil.isElementDisplayed(driver, DeleteProduct);
	validationactionutil.isElementDisplayed(driver, EditProduct);
	validationactionutil.isElementDisplayed(driver, UploadCSV);
	validationactionutil.isElementDisplayed(driver, DownloadCSV);
	validationactionutil.isElementDisplayed(driver, PrintMenu);
	

}

public boolean validateAddProduct()
{
	//waitutil.fluentWait(driver, AddProduct,10);
	return validationactionutil.isElementDisplayed(driver, AddProduct);
}
public boolean validateEditProduct()
{
	return validationactionutil.isElementDisplayed(driver, EditProduct);
}

public boolean validateDeleteProduct()
{
	return validationactionutil.isElementDisplayed(driver, DeleteProduct);
}
public boolean validateApplyFilter()
{
	return validationactionutil.isElementDisplayed(driver, ApplyFilter);
}
public boolean validateUploadCSV()
{
	return validationactionutil.isElementDisplayed(driver, UploadCSV);
}
public boolean validateDownloadCSV()
{
	return validationactionutil.isElementDisplayed(driver, DownloadCSV);
}
public boolean validatePrintMenu()
{
	return validationactionutil.isElementDisplayed(driver, PrintMenu);
}

public boolean viewProduct()
{
	return validationactionutil.isElementDisplayed(driver, ViewProduct);
}

public void clickOnAddProduct() {
	actionutil.click(driver, AddProduct);
	
}
public void clickOnEditProduct() {
	actionutil.click(driver, EditProduct);
	
}

public void clickOnDeleteProduct() {
	actionutil.click(driver, DeleteProduct);
}

public void clickOnViewProduct() {
	actionutil.click(driver, ViewProduct);
	validationactionutil.isElementDisplayed(driver, ViewProduct);
}
public void clickOnDownloadCSV() {
	actionutil.click(driver, DownloadCSV);
}
public void clickOnUploadCSV() {
	actionutil.click(driver, UploadCSV);
	actionutil.EnterValueInUser(driver, UploadCSV, UploadCSVFileUpload);
	actionutil.click(driver, UploadCSVSubmitbtn);
}

public void AddProduct() {
	actionutil.EnterValueInUser(driver, AddProduct, "ProductCode");
	actionutil.EnterValueInUser(driver, AddProduct, "ProductName");
	}
public boolean clickOnPrintMenu() {
	actionutil.click(driver, PrintMenu);
	return validationactionutil.isElementDisplayed(driver, PrintMenu);
}




}







