package StepDefination;

import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	LoginPage login=new LoginPage();
	
	@Given("user launch site URL")
	public void user_launch_site_url() { 
		login.user_launch_site_url();
  
	}

	@When("enter correct username and password")
	public void enter_correct_username_and_password() {
		//login.enter_correct_username_and_password();
  
	}

	@And("click on login button")
	public void click_on_login_button() {
		login.click_on_login_button();

	}

	@Then("Validate successful login")
	public void validate_successful_login() {
		login.validate_successful_login();
		
	    
	}
	
	@When("enter correct {string} and {string}")
	public void enter_correct_and(String username, String password) {//Regular Expression
		login.enter_correct_username_and_password(username, password);
	    
	}
	

}
