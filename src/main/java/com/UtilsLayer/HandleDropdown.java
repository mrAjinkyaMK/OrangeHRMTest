package com.UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class HandleDropdown extends BaseClass {

	public static void handleElements(List<WebElement> wb, String value) {
		for(WebElement abc:wb) {
			if(abc.equals(value)) {
				abc.click();
			}
		}
	}
}
