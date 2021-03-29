package com.popupwindows.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopupPractice2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		driver.findElement(By.id("followall")).click();
		
		Set<String> windowList=driver.getWindowHandles();
		Iterator<String> it=windowList.iterator();
		String parentWindowId=it.next();
		System.out.println("Parent window id = "+parentWindowId);
		System.out.println(driver.getTitle());
		
		String childOneWindow=it.next();
		driver.switchTo().window(childOneWindow);
		Thread.sleep(2000);
		System.out.println("Child one window id = "+childOneWindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		String childTwoWindow=it.next();
		driver.switchTo().window(childTwoWindow);
		Thread.sleep(2000);
		System.out.println("Child one window id = "+childTwoWindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		String childThreeWindow=it.next();
		driver.switchTo().window(childThreeWindow);
		Thread.sleep(2000);
		System.out.println("Child one window id = "+childThreeWindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window id = "+parentWindowId);
		System.out.println(driver.getTitle());
		
		
		

	}

}
