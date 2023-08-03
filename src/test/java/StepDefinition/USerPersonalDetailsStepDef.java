package StepDefinition;

import com.BaseLayer.BaseClass;
import com.PageLayer.UserPersonalDetailsPage;

import io.cucumber.java.en.When;

public class USerPersonalDetailsStepDef extends BaseClass
{
	public static UserPersonalDetailsPage userpage;
	
	@When("user enter License No and Gender")
	public void user_enter_license_no_and_gender() 
	{
	   userpage = new UserPersonalDetailsPage();
	   userpage.UserPersonalDetails("123456789", "2");
	}
	@When("click on Save Button")
	public void click_on_save_button() 
	{
	    userpage.clickOnSave();
	}
}
