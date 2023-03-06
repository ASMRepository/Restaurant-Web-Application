package com.restaurant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.ActionUtil;
import com.utils.WebElementActionsUtil;

public class AddProduct {
	
		WebDriver driver;
		ActionUtil actionutil=new ActionUtil();
		WebElementActionsUtil webelementactionsutil=new WebElementActionsUtil();

	public AddProduct(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//button[text()='Add Product'][1]")
	WebElement AddProduct;
	
	@FindBy(xpath="(//h4[text()='Add Product'])[1]")
	WebElement AddProductTitle;

	@FindBy(xpath="//select[@name='type']")
	WebElement ProductType;
	
	@FindBy(xpath="//input[@placeholder='Code']")
	WebElement ProductCode;

	@FindBy(xpath="//input[@id='ProductName']")
	WebElement ProductName;

	@FindBy(xpath="//select[@id='Category']")
	WebElement ProductCategory;

	@FindBy(xpath="(//select[@id='Supplier'])[1]")
	WebElement ProductSupplier;

	@FindBy(xpath="//input[@id='PurchasePrice']")
	WebElement PurchasePrice;

	@FindBy(xpath="//input[@placeholder='Product Unit']")
	WebElement ProductUnit;

	@FindBy(xpath="//input[@placeholder='Alert Quantity']")
	WebElement AlertQuantity;

	@FindBy(xpath="//textarea[@id='ProductOptions']")
	WebElement ProductOptions;

	@FindBy(xpath="(//input[@type='file'])[1]")
	WebElement UploadFile;

	@FindBy(xpath="(//div[@class='note-editable panel-body'])")
	WebElement ProductDescription;

	@FindBy(xpath="//p[text()='Choose color to Display in POS.']")
	WebElement ChooseColour;

	@FindBy(xpath="(//button[text()='Submit'])[1]")
	WebElement Submitbtn;

	@FindBy(xpath="(//button[text()='Close'])[2]")
	WebElement Closebtn;

	@FindBy(xpath="(//span[text()='×'])[1]")
	WebElement xbtn;

	
	public void clickAddProduct(String ProductType,String ProductCode,String ProductName,String ProductCategory,String ProductSupplier,String PurchasePrice,String ProductUnit,String AlertQuantity,String ProductOptions,String UploadFile,String ProductDescription,String ChooseColour,String Submitbtn)
	{
		actionutil.clickAnElement(driver,AddProduct);
		
	}
	public void clickAddProductButton() {
	actionutil.click(driver, AddProduct);
	}
	
	public WebElement selectProductType(String item) {
		webelementactionsutil.dropdownSelectionUsingValue(driver,ProductType,item);
		return AddProduct;	
	}
	public void enterProductCode(String item) {
	actionutil.EnterValueInUser(driver, AddProduct, "ProductCode");
	}
	public void enterProductName(String item) {
		actionutil.EnterValueInUser(driver, AddProduct, "ProductName");
	}
	public void selectProductCategory(String item) {
		webelementactionsutil.dropdownSelectionUsingValue(driver,ProductCategory,item);
	}
	public void selectProductSupplier(String item) {
		webelementactionsutil.dropdownSelectionUsingValue(driver,ProductSupplier,item);
	}
	public void enterProductPrice(String item) {
		actionutil.EnterValueInUser(driver, AddProduct, "ProductPrice");
	}
	public void enterTax(String item) {
		actionutil.EnterValueInUser(driver, AddProduct, "Tax");
	}
	public void enterTaxMethod(String item) {
		actionutil.EnterValueInUser(driver, AddProduct, "TaxMethod");
	}
	public void enterPrice(String item) {
		actionutil.EnterValueInUser(driver, AddProduct, "Price");
	}
	public void enterProductUnit(String item) {
		actionutil.EnterValueInUser(driver, AddProduct, "ProductUnit");
	}
	public void enterAlertQuantity(String item) {
		actionutil.EnterValueInUser(driver, AddProduct, "AlertQuantity");
	}
	public void enterProductOptions(String item) {
		actionutil.EnterValueInUser(driver, AddProduct, "ProductOptions");
	}
	public void uploadInputImage(String item) {
		actionutil.EnterValueInUser(driver, AddProduct, "InputImage");
	}
	public void enterProductDescription(String item) {
		actionutil.EnterValueInUser(driver, AddProduct, "ProductDescription");
	}
	public void submitNewProduct()
	{
		actionutil.clickAnElement(driver,Submitbtn);
	}
	public void closeNewProduct()
	{
		actionutil.clickAnElement(driver,Closebtn);
	}
	
	}

