package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.UtilsClass;

public class HomePage extends BaseClass{
		
	@FindBy(xpath="//img[@alt='client brand banner']")
	private WebElement logo;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pimlink;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String getUrl()
	{
		return UtilsClass.getUrl();
	}
	
	public String getTitle()
	{
		return UtilsClass.getTitle();
	}
	
	public boolean logoStatus()
	{
		
		return UtilsClass.logo(logo);
		
	}
	
	public void clickOnPIMLink()
	{
		UtilsClass.click(pimlink);
	}
	
}
