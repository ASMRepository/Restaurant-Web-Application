package com.restaurant.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.ActionUtil;
import com.utils.ExcelUtil;

public class LoginPage extends ExcelUtil {

	static WebDriver driver;
	static ActionUtil actionutil=new ActionUtil();
	ExcelUtil excelutil = new ExcelUtil();
	
	@FindBy(xpath="//input[@name='username']")
	static
	WebElement uname;
	@FindBy(xpath="//input[@name='password']")
	static
	WebElement pswrd;
	@FindBy(xpath="//input[@name='submit']")
	static
	WebElement loginbutton;
	
	@FindBy(xpath="//img[@alt='logo']")
	WebElement Title;
	@FindBy(xpath="//a[@href='https://qalegend.com/restaurant/logout']")
	WebElement logoutbutton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeUsername(String Username){                
		//uname.sendKeys();
		actionutil.EnterValueInUser(driver,uname,Username);
		
	}
	public void typePassword(String password) {
		//pswrd.sendKeys();
		actionutil.EnterValueInUser(driver,pswrd,password);
	}

	
	public void clickLogin()
	{
		//loginbutton.click();
		actionutil.clickAnElement(driver,loginbutton);
	}
	
	/*public String readIntegerData(String fileName,String sheetname, int row, int col)  {
	return excelutil.readIntegerData(fileName,sheetname,row, col);
	}*/

	public String readStringData(String fileName,String sheetname,int row, int col) throws IOException {
	return excelutil.readStringData(fileName, sheetname, row, col);
}
	public WebElement clickLogOutbtn() {
		return actionutil.clickAnElement(driver,logoutbutton);
		
		
	}
	
	public static DashboardPage login(String username,String password) {
		
		actionutil.EnterValueInUser(driver,uname,username);
		actionutil.EnterValueInUser(driver,pswrd,password);
		actionutil.clickAnElement(driver,loginbutton);
		return new DashboardPage(driver);
		
	}
	

}
