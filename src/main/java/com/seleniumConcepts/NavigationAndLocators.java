package com.seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationAndLocators {
	
	public static void main(String[] args) {
		
	
			
			System.setProperty("webdriver.chrome.driver", "D://chromedriver_win32 (1)//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			for(int i=0;i<5;i++) {
				driver.navigate().to("http://www.google.com");
				System.out.println(driver.getTitle());
				driver.navigate().to("https://www.amazon.in");
				System.out.println(driver.getTitle());
				
			}
			driver.quit();
			
			
		
		
	}
	

	

}
