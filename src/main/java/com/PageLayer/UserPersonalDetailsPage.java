package com.PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.HandleDropdown;
import com.UtilsLayer.UtilsClass;

public class UserPersonalDetailsPage extends BaseClass
{
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[4]")
	private WebElement licenseNo;
	
	@FindBy(xpath="//input[@type='radio']")
	private List<WebElement> gender;
	
	@FindBy(xpath="(//button[text()=' Save '])[1]")
	private WebElement save;
	
	public UserPersonalDetailsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void UserPersonalDetails(String LicenseNo, String Gender)
	{
		UtilsClass.sendKeys(licenseNo, LicenseNo);
		HandleDropdown.handleRadioButton(gender, Gender);
	}
	
	public void clickOnSave()
	{
		UtilsClass.click(save);
	}
}
