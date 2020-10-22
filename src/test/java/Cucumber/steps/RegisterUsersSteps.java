package Cucumber.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.pages.NewToursRegister;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUsersSteps {

	WebDriver driver = Hooks.driver;
	WebDriverWait wait = Hooks.wait;
	
	NewToursRegister newToursRegister = new NewToursRegister(driver);
	
	@Given("User navigates to homepage of {string}")
	public void user_navigates_to_homepage_of(String url) {
		driver.get(url);
		
	}

	@When("User clicks on the register link")
	public void user_clicks_on_the_register_link() {
		newToursRegister.clickRegisterLink();
	}

	@When("Enters First name {string}")
	public void enters_first_name(String firstName) {
		newToursRegister.enterFirstName(firstName);
	}

	@When("Enters Last Name {string}")
	public void enters_last_name(String lastName) {
		newToursRegister.enterLastName(lastName);
	}

	@When("Enters Phone {string}")
	public void enters_phone(String phone) {
		newToursRegister.enterPhone(phone);
	}

	@When("Enters Email {string}")
	public void enters_email(String email) {
		newToursRegister.enterEmail(email);
	}

	@When("Enters address {string}")
	public void enters_address(String address) {
		newToursRegister.enterAddress(address);
	}

	@When("Enters city {string}")
	public void enters_city(String city) {
		newToursRegister.enterCity(city);
	}

	@When("Enters State {string}")
	public void enters_state(String state) {
		newToursRegister.enterState(state);
	}

	@When("Enters Postal Code {string}")
	public void enters_postal_code(String postalCode) {
		newToursRegister.enterPostalCode(postalCode);
	}

	@When("Selects Country {string}")
	public void selects_country(String country) {
		newToursRegister.selectCountryByValue(country.toUpperCase());
	}

	@When("Enters Username of your choice {string}")
	public void enters_username_of_your_choice(String username) {
		newToursRegister.enterUserName(username);
	}

	@When("Enters password {string}")
	public void enters_password(String password) {
		newToursRegister.enterPassword(password);
	}

	@When("Enters same password in confirm password field {string}")
	public void enters_same_password_in_confirm_password_field(String password) {
		newToursRegister.enterConfirmPassword(password);
	}

	@Then("User should be able to submit the form")
	public void user_should_be_able_to_submit_the_form() {
	}
}
