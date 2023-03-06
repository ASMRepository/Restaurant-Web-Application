package com.utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WindowsHandlingUtil {

	
	
	private String index;

	public void getWindowHandling(WebDriver driver){
		try {
			driver.getWindowHandle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
	}
	public void multipleWindowFunction(WebDriver driver, WebElement element1, WebElement element2) {
		element1.click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}

	}

	public void getAllWindowHandling(WebDriver driver){
		
			try {
				driver.getWindowHandles();
				Set<String> parentURL=driver.getWindowHandles();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			}
	}
	/**This method is used to Exit from the frame
	 * 
	 * @param driver
	 */
	public void exitFromTheFrame(WebDriver driver)
		{
			driver.switchTo().defaultContent();
		}
	/**This method is used to get Parent URL
	 * 
	 * @param driver
	 */
	public String getParentURL(WebDriver driver) {
			String parentURL=driver.getWindowHandle();
			return parentURL;
		}
	
	/**This method is used to Enter Value into frame using Index
	 * 
	 * @param driver
	 */
	public void FrameControl(WebDriver driver)
	{
		driver.switchTo().frame(index);
	}
}
