package com.popupwindows.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesConcept {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();//TopCosting
	
	driver.get("http://www.londonfreelance.org/courses/frames/index.html");
	
	WebElement element=  driver.findElement(By.name("main"));
	
	driver.switchTo().frame(element);
	System.out.println(driver.getTitle());
	}

}
