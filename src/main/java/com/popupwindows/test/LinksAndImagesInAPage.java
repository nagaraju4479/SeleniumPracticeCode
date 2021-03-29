package com.popupwindows.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksAndImagesInAPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		System.out.println();
		
		int count=0;
		
		
		for(int i=0;i<=links.size();i++) {
			if(links.get(i).getText().isEmpty())
					{
				//Nothing print
					}
			else {
				System.out.println(links.get(i).getText());
				count++;
				
			}
			
		}
		System.out.println("Number of links which are haing proper text "+count);
	
	}

}
