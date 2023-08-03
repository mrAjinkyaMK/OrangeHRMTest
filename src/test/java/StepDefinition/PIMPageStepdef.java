package StepDefinition;

import com.PageLayer.PIMPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMPageStepdef {
	public static PIMPage pimpage;
	static String Eid;

	@When("User Click on Add Employee button")
	public void user_click_on_add_employee_button() {
		pimpage = new PIMPage();
		pimpage.clickOnAddEmp();

	}

	@When("User enter firstname and middlename and lastname and capture user ID")
	public void user_enter_firstname_and_middlename_and_lastname_and_capture_user_id() {

		Eid=pimpage.enterEmpInformation("Vibha", "Vijay", "Date");

	}

	@Then("User click on save button")
	public void user_click_on_save_button() {
		pimpage.clickOnSaveButton();

	}

}
