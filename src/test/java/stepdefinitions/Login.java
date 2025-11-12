package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@Given("User has navigated to login page")
	public void User_has_navigated_to_login_page() {

	}

	@When("User has entered valid email address {string} into email field")
	public void User_has_entered_valid_email_address_into_email_field(String emailText) {

	}

	@And("User has entered valid password {string} into password field")
	public void User_has_entered_valid_password_into_password_field(String string) {

	}

	@And("User clicks on login button")
	public void User_clicks_on_login_button() {

	}

	@Then("User should gets successfully logged in")
	public void User_should_gets_successfully_logged_in() {

	}

	@When("User enters invalid email address in email field {String emailText}")
	public void User_enters_invalid_email_address_in_email_filed(String emailText) {

	}

	@And("User entered invalid password {String} into password field")
	public void User_entered_invalid_password_into_password_field(String invalidpassword) {

	}

	@Then("User should gets a proper warning message about credentials mismatch")
	public void User_should_gets_a_proper_proper_warning_message_about_credentials_mismatch() {

	}

	@When("User does not entered a email address in the email field")
	public void User_does_not_entered_a_email_address_in_the_email_field() {

	}

	@And("User does not entered the password into password field")
	public void User_does_not_entered_the_password_into_password_field() {

	}

	@Given("Login with invalid credentials")
	public void Login_with_invalid_credentials() {

	}

	@Given("Login with valid email and invalid password")
	public void Login_with_valid_email_and_invalid_password() {

	}

	@Given("Login with invalid email and valid password")
	public void Login_with_invalid_email_and_valid_password() {

	}

	@Given("Login without providing any credentials")
	public void Login_without_providing_any_credentials() {

	}
}
