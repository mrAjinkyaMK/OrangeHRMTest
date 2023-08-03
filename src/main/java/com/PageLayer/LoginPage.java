package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.UtilsClass;

public class LoginPage extends BaseClass {

	@FindBy(name = "username")
	private WebElement uname;

	@FindBy(name = "password")
	private WebElement pass;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement login;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterCred(String username, String password) {
		UtilsClass.sendKeys(uname, username);
		UtilsClass.sendKeys(pass, password);
	}

	public void clickOnLogin() {
		UtilsClass.click(login);
	}
}
