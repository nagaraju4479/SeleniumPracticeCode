package com.seleniumConcepts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownDisplayValues {
	
	/**
	 * Getting all values from the dropdown 	 * 
	 * @param element
	 */
	
 public static void getValues(WebElement element) {
		 
		 Select select = new Select(element);
			List<WebElement> dropvalues=select.getOptions();
			System.out.println("---------------");

			for(int i=0;i<dropvalues.size();i++) {

				String dList=	dropvalues.get(i).getText();
				System.out.println(dList);

			}
	    	
	    }
 
 public static void selectDatefromString(WebElement el,String value) {
		
		
		Select select = new Select(el);
		select.selectByVisibleText(value);
		
	}
	

}
