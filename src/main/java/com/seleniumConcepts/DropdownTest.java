package com.seleniumConcepts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTest {	
	

	public static void main(String[] args) {
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/age-calculator.html");

		WebElement month=driver.findElement(By.id("today_Month_ID"));
		WebElement day=driver.findElement(By.id("today_Day_ID"));
		
		String date="10-Dec-2021";
		String dateList[]=date.split("-");
		
				
		DropdownDisplayValues.selectDatefromString(day, dateList[0]);
		DropdownDisplayValues.selectDatefromString(month, dateList[1]);		

		DropdownDisplayValues.getValues(day);
		DropdownDisplayValues.getValues(month);
		
		
		
		
	}
	
	
	
	
		

}
