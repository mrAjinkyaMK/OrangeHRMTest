package com.UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class HandleDropdown extends BaseClass {

	public static void handleElements(List<WebElement> wb, String value) {
		for(WebElement abc:wb) 
		{
			
			if(abc.getAttribute("value").equals(value)) {
				abc.click();
				break;
			}
		}
	}
	

	public static void handleRadioButton(List<WebElement> wb, String value) {
		for(WebElement abc:wb) 
		{
		//	String s= null;
			
			if(abc.getText().equalsIgnoreCase(value)) 
			{
				abc.click();
				break;
			}
		}
	}
	
}
