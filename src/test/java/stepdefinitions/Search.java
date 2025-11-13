package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	@Given("User opens the application")
	public void user_opens_the_application() {

	}

	@When("User enters valid product {string} into the search box field")
	public void user_enters_valid_product_into_the_search_box_field(String validProduct) {

	}
	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		
	}
	@Then("User should gets a valid product displayed in search results")
	public void user_should_gets_a_valid_product_displayed_in_search_results() {
		
	}
	@When("User enters invalid product {string} into the search box field")
	public void user_enters_invalid_product_into_the_search_box_field(String invalidProductText) {
		
	}
	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
		
	}
	@When("User do not enter any product name into search box field")
	public void user_do_not_enter_any_product_name_into_search_box_field() {
		
	}

}
