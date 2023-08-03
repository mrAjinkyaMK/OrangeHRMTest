package StepDefinition;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageStepDef extends BaseClass{

	public static LoginPage login;
	
	@Given("User is on LoginPage")
	public void user_is_on_login_page() {
	    initialization("chrome");
	}
	
	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    login = new LoginPage();
	    login.enterCred("Admin", "admin123");
	}
	
	@When("click on Login button")
	public void click_on_login_button() {
	    login.clickOnLogin();
	}
}
