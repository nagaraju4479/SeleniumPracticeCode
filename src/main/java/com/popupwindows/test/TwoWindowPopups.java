package com.popupwindows.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwoWindowPopups {

	public static void main(String[] args) {

		//Step 1 setup chrome and launch the website url
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");

		//Step 2: now we can handle the window for that we have getWindowHandles() method available 
		driver.findElement(By.className("followeasy")).click();
		driver.findElement(By.linkText("Like us On Facebook ")).click();
		Set<String> handles=driver.getWindowHandles();
		Iterator it=handles.iterator();
		String parentWindowId=(String)it.next();
		System.out.println("Parenet id ="+parentWindowId);
		System.out.println(driver.getTitle());


		//Step 3 : click on first button to handle the window. 
		
		String childWindowOne=(String)it.next();
		driver.switchTo().window(childWindowOne);
		System.out.println("child one id ="+childWindowOne);
		System.out.println(driver.getTitle());
		driver.close();
		
		//Step 4: switch back to Parent window and click on second button
		driver.switchTo().window(parentWindowId);
		
		
		
		










	}

}
