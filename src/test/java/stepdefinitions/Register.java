package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Register {
	WebDriver driver;

	@Given("User navigates to Register Account page")
	public void user_navigates_to_register_account_page() {

		WebDriver driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
	}

	@When("User enters the details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable datatable) {
		Map<String, String> dataMap = datatable.asMap(String.class, String.class);
		driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstName"));
		driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastName"));
		;
		driver.findElement(By.id("input-email")).sendKeys(dataMap.get("email"));
		;
		driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("telephone"));
		;
		driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
		;
		driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("confirmpassword"));
		;

	}

	@When("User selects privacy policy")
	public void user_selects_privacy_policy() {
		driver.findElement(By.xpath("//input[@name='agree']")).click();

	}

	@When("Clicks on continue button")
	public void clicks_on_continue_button() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

	}

	@Then("User account should get created successfully")
	public void user_account_should_get_created_successfully() {
		String successMessageConfirmation = driver
				.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		Assert.assertEquals("Your Account Has Been Created!", successMessageConfirmation);
	}

	@When("User selects yes for Newsletter")
	public void user_selects_yes_for_newsletter() {
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();

	}

	@When("User enters the details into below fields with duplicate email")
	public void user_enters_the_details_into_below_fields_with_duplicate_email() {
		driver.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]")).getText();

	}

	@Then("User should get a proper warning about duplicate email")
	public void user_should_get_a_proper_warning_about_duplicate_email() {

	}

	@When("User do not enter any details into the fields")
	public void user_do_not_enter_any_details_into_the_fields() {

	}

	@Then("User should get a proper warning message for every mandatory fields")
	public void user_should_get_a_proper_warning_message_for_every_mandatory_fields() {

	}

}
