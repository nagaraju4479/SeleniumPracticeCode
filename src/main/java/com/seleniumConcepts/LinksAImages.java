package com.seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksAImages {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		//List<WebElement> linkList=driver.findElements(By.tagName("a"));
		List<WebElement> linkList=driver.findElements(By.tagName("img"));
		System.out.println(linkList.size());
		int count=0;
		
		for(int i=0;i<linkList.size();i++) {
			if(linkList.get(i).getText().isEmpty())
			{
				
			}
			else
			{
				System.out.println(linkList.get(i).getText());
				count++;
			}
			
		}
		
	System.out.println("Links are having text : "+count);
		
		
	}

}
