package crowdstreet.steps;



import crowdstreet.stepdefinition_ui.UserRegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserRegistration {
	
	@Steps
	UserRegistrationPage userregistration;
	
	@Steps
	HomePage homepage;
	
	    
	@Given("iam on crowdstreet Home page")
	public void iam_on_crowdstrert_Home_page() {
		homepage.open();
	 
	}

	@When("I navigate to create an account page")
	public void i_navigate_to_create_an_account_page() {
		userregistration.clickRegisterPage();
	}

	@When("I fill the user registration form")
	public void i_fill_the_user_registration_form() throws InterruptedException  {
	   userregistration.userInfo();
	   userregistration.dropdown("Alaska (AK)");
	   
	}


	@When("I agree to the terms and conditions")
	public void i_agree_to_the_terms_and_conditions() {
		userregistration.termsAndConditions();
	}
	
	@When("I click the complete your information button")
	public void i_click_the_complete_your_information_button() {
	 userregistration.registerBtn(); 
	}

	@Then("I should see a welcome page")
	public void i_should_see_a_welcome_page() throws InterruptedException {
		userregistration.verifyLoggedUser();
	}
}
