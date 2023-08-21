package StepDefination;

import Page.AddToCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps {
	AddToCart cart=new AddToCart();
	@When("Click on Add to Cart button.")
	public void click_on_add_to_cart_button() {
		cart.click_on_add_to_cart_button();
	}

	@And("Click on Add to Cart Icon")
	public void click_on_add_to_cart_icon() {
		cart.click_on_add_to_cart_icon();   
	}

	@And("Click on Checkout Button")
	public void click_on_checkout_button() {
		cart.click_on_checkout_button();    
	}

	@And("Enter the First Name Last Name and Zip Code.")
	public void enter_the_first_name_last_name_and_zip_code() {
		cart.enter_the_first_name_last_name_and_zip_code();    
	}

	@And("Click on Continue Button.")
	public void click_on_continue_button() {
		cart.click_on_continue_button();    
	}

	@And("Click on Finish Button.")
	public void click_on_finish_button() {
		cart.click_on_finish_button();    
	}

	@And("Click on Back Home Button.")
	public void click_on_back_home_button() {
		cart.click_on_back_home_button();    
	}

	@Then("Validate successful Add to cart Product or not.")
	public void validate_successful_add_to_cart_product_or_not() {
		cart.validate_successful_add_to_cart_product_or_not();    
	}

}
