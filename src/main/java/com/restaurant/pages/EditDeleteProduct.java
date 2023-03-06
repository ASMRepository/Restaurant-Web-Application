package com.restaurant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.ActionUtil;
import com.utils.WebElementActionsUtil;

public class EditDeleteProduct {

	WebDriver driver;
	ActionUtil actionutil=new ActionUtil();
	WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();

public EditDeleteProduct(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath="(//i[@class='fa fa-pencil'])[1]")
	WebElement EditProduct;
	
	@FindBy(xpath="(//select[@class='form-control'])[1]")
	WebElement ProductType;
	
	@FindBy(xpath="(//input[@id='ProductCode'])")
	WebElement ProductCode;
	
	@FindBy(xpath="(//input[@id='ProductName'])")
	WebElement ProductName;
	
	@FindBy(xpath="(//select[@id='Category'])")
	WebElement ProductCategory;
	
	@FindBy(xpath="(//input[@id='Tax'])")
	WebElement Tax;
	
	@FindBy(xpath="(//select[@name='taxmethod'])")
	WebElement TaxMethod;
	
	@FindBy(xpath="(//input[@id='Price'])")
	WebElement Price;
	
	@FindBy(xpath="(//textarea[@id='ProductOptions'])")
	WebElement ProductOptions;
	
	@FindBy(xpath="(//input[@type='file'])[1]")
	WebElement FileUpload;
	
	@FindBy(xpath="(//div[@class='note-editable panel-body'])")
	WebElement ProductDescription;
	
	@FindBy(xpath="(//p[text()='Choose color to Display in POS.'])")
	WebElement SelectedColor;
	
	@FindBy(xpath="(//button[text()='Submit'])")
	WebElement Submitbtn;
	
	@FindBy(xpath="(//a[@class='btn btn-default float-right'])")
	WebElement Backbtn;
	
	@FindBy(xpath="(//i[@class='fa fa-times'])[1]")
	WebElement DeleteProduct;

	@FindBy(xpath="//div[@class='popover-content']/a[@class='btn btn-danger']")
	WebElement DeleteProductConfirmation;

	public void clickEditProduct(String ProductType,String ProductCode,String ProductName,String ProductCategory,String ProductSupplier,String PurchasePrice,String ProductUnit,String AlertQuantity,String ProductOptions,String UploadFile,String ProductDescription,String ChooseColour,String Submitbtn)
	{
		actionutil.clickAnElement(driver,EditProduct);
		
	}
	public void clickEditProductButton() {
	actionutil.click(driver, EditProduct);
	}
	
	public void selectProductType(String item) {
		webelementactionsutil.dropdownSelectionUsingValue(driver,ProductType,item);
	}
	public void enterProductCode(String item) {
	actionutil.EnterValueInUser(driver, EditProduct, "ProductCode");
	}
	public void enterProductName(String item) {
		actionutil.EnterValueInUser(driver, EditProduct, "ProductName");
	}
	public void selectProductCategory(String item) {
		webelementactionsutil.dropdownSelectionUsingValue(driver,ProductCategory,item);
	}
	public void enterProductPrice(String item) {
		actionutil.EnterValueInUser(driver, EditProduct, "ProductPrice");
	}
	public void enterTax(String item) {
		actionutil.EnterValueInUser(driver, EditProduct, "Tax");
	}
	public void enterTaxMethod(String item) {
		actionutil.EnterValueInUser(driver, EditProduct, "TaxMethod");
	}
	public void enterPrice(String item) {
		actionutil.EnterValueInUser(driver, EditProduct, "Price");
	}
	public void enterProductUnit(String item) {
		actionutil.EnterValueInUser(driver, EditProduct, "ProductUnit");
	}
	public void enterAlertQuantity(String item) {
		actionutil.EnterValueInUser(driver, EditProduct, "AlertQuantity");
	}
	public void enterProductOptions(String item) {
		actionutil.EnterValueInUser(driver, EditProduct, "ProductOptions");
	}
	public void uploadInputImage(String item) {
		actionutil.EnterValueInUser(driver, EditProduct, "InputImage");
	}
	public void enterProductDescription(String item) {
		actionutil.EnterValueInUser(driver, EditProduct, "ProductDescription");
	}
	public void submitNewProduct()
	{
		actionutil.clickAnElement(driver,Submitbtn);
	}
	public void backButton()
	{
		actionutil.clickAnElement(driver,Backbtn);
	}
	public void clickDeleteProductbtn()
	{
		actionutil.clickAnElement(driver,DeleteProduct);
	}
	public void clickDeleteProductConfirmationbtn()
	{
		actionutil.clickAnElement(driver,DeleteProductConfirmation);
	}
			
}
