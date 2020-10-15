package Cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Cucumber.pages.AirAsiaHome;
import Cucumber.pages.AirAsiaLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFailSteps {

	WebDriver driver = Hooks.driver;
	WebDriverWait wait = Hooks.wait;
	AirAsiaHome airAsiaHome = new AirAsiaHome(driver);
	AirAsiaLogin airAsiaLogin = new AirAsiaLogin(driver);
	
	@Given("User navigates to the site url {string}")
	public void user_navigates_to_the_site_url(String url) {
		driver.get(url);
		wait.until(ExpectedConditions.urlToBe(url));
	}

	@Given("Verify the title for successful navigation")
	public void verify_the_title_for_successful_navigation() {
		Assert.assertEquals(driver.getTitle(),"airasia.com | For Everyone | Flights, Hotels, Activities & More");
	}

	@Given("User clicks on login button")
	public void user_clicks_on_login_button() {
		airAsiaHome.loginButton.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(airAsiaLogin.loginWidgetByID)));
	}

	@Given("User enters username as {string}")
	public void user_enters_username_as(String email) {
		airAsiaLogin.email.sendKeys(email);
	}

	@Given("User enters password as {string}")
	public void user_enters_password_as(String password) {
		airAsiaLogin.password.sendKeys(password);
	}

	@When("User clicks on Sign In Button")
	public void user_clicks_on_sign_in_button() {
		airAsiaLogin.signInButton.click();
	}

	@Then("Verify that error message is displayed on screen in red and contains the text {string}")
	public void verify_that_error_message_is_displayed_on_screen_in_red_and_contains_the_text(String expectedErrorMessage) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className(airAsiaLogin.errorMessageSectionByClass)));
		
		//Verify Error message
		String actualErrorMessage = airAsiaLogin.errorMessage.getText();
		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage));

		//Verify red font color
		String actualColor = airAsiaLogin.errorMessage.getCssValue("color");
		Assert.assertEquals(actualColor, "rgba(225, 0, 0, 1)");
		
		
	
	}

}
