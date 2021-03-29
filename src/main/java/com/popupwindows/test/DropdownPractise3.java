package com.popupwindows.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPractise3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");

		driver.findElement(By.id("followall")).click();
		Set<String> windowList=driver.getWindowHandles();
		Iterator<String> it=windowList.iterator();

		for(int i=0;i<windowList.size();i++) {


			String focus=it.next();
			driver.switchTo().window(focus);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			driver.close();
		}	

	}

	
}
