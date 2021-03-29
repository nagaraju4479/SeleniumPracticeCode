package com.popupwindows.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopup {

	public static void main(String[] args) throws InterruptedException {
	   
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();//Top Casting
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		//driver.findElement(By.className("followeasy")).click();
		driver.findElement(By.id("followall")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		String parentWindowPopup=it.next();
		System.out.println("Parent window id"+parentWindowPopup);
		System.out.println(driver.getTitle());
		
		String childWindowOne=it.next();		
		String childWindowTwo=it.next();
		String ChildWindowThree=it.next();
		
		driver.switchTo().window(childWindowOne);
		System.out.println("Child window one id"+childWindowOne);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(childWindowTwo);
		System.out.println("Child window two id "+childWindowTwo);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(ChildWindowThree);
		System.out.println("Child window three :"+ChildWindowThree);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(parentWindowPopup);
		System.out.println("Parent window id"+parentWindowPopup);
		System.out.println(driver.getTitle());
		
		

	}

}
