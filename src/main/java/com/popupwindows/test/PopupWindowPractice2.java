package com.popupwindows.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopupWindowPractice2 {

	public static void main(String[] args) throws InterruptedException {

	WebDriverManager.chromiumdriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	
	driver.findElement(By.className("btn-default")).click();
	
	AlertUtilities.alertBoxClose(driver);
	
	}

	
}
