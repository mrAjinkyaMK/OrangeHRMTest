package StepDefinition;

import org.testng.Assert;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;

import io.cucumber.java.en.When;

public class HomePageStepDef extends BaseClass{
	
	public static HomePage hpage;
	@When("user validate homepage url")
	public void user_validate_homepage_url() {
		hpage=new HomePage();
	    Assert.assertEquals(hpage.getUrl().contains("hrm"),true);
		
		
	}

	@When("User validate homepage logo")
	public void user_validate_homepage_logo() {
	  Assert.assertEquals(hpage.logoStatus(), true);
	}

	@When("user validate homepage Title")
	public void user_validate_homepage_title() {
		Assert.assertEquals(hpage.getTitle(),"OrangeHRM");
		  
	}

	@When("then Click on PIM page")
	public void then_click_on_pim_page() {
		
	    hpage.clickOnPIMLink();
	}

}
