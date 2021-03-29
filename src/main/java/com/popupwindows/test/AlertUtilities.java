package com.popupwindows.test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertUtilities {
	
	
	/**
	 * This method is used to close the AlertBoxes 
	 * @param driver
	 */
	public static void alertBoxClose(WebDriver driver)throws InterruptedException 
	{
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		driver.close();
	}

}
