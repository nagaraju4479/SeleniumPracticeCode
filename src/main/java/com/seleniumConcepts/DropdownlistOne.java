package com.seleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownlistOne {
	
	static WebDriver driver;
	static Iterator<String> it;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		driver.findElement(By.id("followall")).click();
		
		
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		
		for(int i=0;i<handles.size();i++) {
			
			String focus=it.next();		
			driver.switchTo().window(focus);		
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();	
			
		}
		
		
		
//		driver.switchTo().window(parentWindow);		
//		System.out.println(driver.getTitle());
//		
//		String childOne=it.next();		
//		driver.switchTo().window(childOne);		
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.close();
//		
//		String childTwo=it.next();		
//		driver.switchTo().window(childTwo);		
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		driver.close();
//		
//		
		
		
		
		
		
	}
	
	
}
