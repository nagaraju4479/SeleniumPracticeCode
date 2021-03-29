package com.seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWebVerification {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		String title=driver.getTitle();
		
		if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("invalid title");
		}
		
		String currentTitle=driver.getCurrentUrl();
		System.out.println(currentTitle);
		driver.quit();
		
		
	}
  
	
}
