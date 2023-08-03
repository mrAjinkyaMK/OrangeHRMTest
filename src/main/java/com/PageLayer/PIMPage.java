package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.UtilsClass;

public class PIMPage extends BaseClass {
	public static String eid;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement Addemplink;

	@FindBy(name = "firstName")
	private WebElement firstName;

	@FindBy(name = "middleName")
	private WebElement middleName;

	@FindBy(name = "lastName")
	private WebElement lastName;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[1]")
	private WebElement empID;

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement savebutton;

	public PIMPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddEmp() {
		UtilsClass.click(Addemplink);
	}

	public void enterEmpInformation(String fname, String mname, String lname) {
		UtilsClass.sendKeys(firstName, fname);
		UtilsClass.sendKeys(middleName, mname);
		UtilsClass.sendKeys(lastName, lname);
		 eid = empID.getAttribute("value");
		 System.out.println(eid);

	}

	public void clickOnSaveButton() {
		UtilsClass.click(savebutton);
	}

}
