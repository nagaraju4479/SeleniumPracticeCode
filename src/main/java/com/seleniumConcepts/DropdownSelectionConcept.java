package com.seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelectionConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/age-calculator.html");
		
		WebElement month=driver.findElement(By.id("today_Month_ID"));
		WebElement day=driver.findElement(By.id("today_Day_ID"));
		//WebElement year=driver.findElement(By.id("today_Year_ID"));
		
		selectMonthandDate(month, "Feb");
		selectMonthandDate(day, "25");
		

	     }
	public static void selectMonthandDate(WebElement element ,String value ) {
		
		Select selectMonth = new Select(element);
		selectMonth.selectByVisibleText(value);
		
		
		
	}

}
