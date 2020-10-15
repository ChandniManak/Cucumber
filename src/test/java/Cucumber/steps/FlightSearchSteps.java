package Cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Cucumber.pages.AirAsiaHome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightSearchSteps {

	WebDriver driver = Hooks.driver;
	WebDriverWait wait = Hooks.wait;

	AirAsiaHome airAsiaHome = new AirAsiaHome(driver);
	
	@Given("User is navigated successfully to the website {string}")
	public void user_is_navigated_successfully_to_the_website(String url) {
		driver.get(url);
		wait.until(ExpectedConditions.urlToBe(url));
	}

	@Given("Verify its Title")
	public void verify_its_title() {
		Assert.assertEquals(driver.getTitle(),"airasia.com | For Everyone | Flights, Hotels, Activities & More");
	}

	@Given("Click on Flights Icon")
	public void click_on_flights_icon() {
		try {
			airAsiaHome.flightIcon.click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.attributeToBeNotEmpty(airAsiaHome.fromField, "value"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Given("Enter Origin as {string}")
	public void enter_origin_as(String origin) {

		airAsiaHome.fromField.click();
		airAsiaHome.fromField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
		airAsiaHome.fromField.sendKeys(origin);
		airAsiaHome.fromField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		wait.until(ExpectedConditions.attributeContains(airAsiaHome.fromField, "value", origin));
		airAsiaHome.closeAlert();
	}

	@Given("Enter Destination as {string}")
	public void enter_destination_as(String destination) {
		airAsiaHome.toField.click();
		airAsiaHome.toField.sendKeys(destination);
		airAsiaHome.toField.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

	}

	@Given("Select Depart date as {string}")
	public void select_depart_date_as(String departDate) {

		airAsiaHome.departDate.click();
		airAsiaHome.departDate.clear();
		airAsiaHome.departDate.sendKeys(departDate);
	}

	@Given("Select Return type as {string}")
	public void select_return_date_as(String returnType) {
		try {
			if (returnType.equalsIgnoreCase("One way")) {
				airAsiaHome.oneWayReturnType.click();
			}
			airAsiaHome.dateConfirmButton.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("User clicks on Search Button")
	public void user_clicks_on_search_button() {
		try {
			airAsiaHome.submitButton.click();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Verify that the user is navigated successfully to search flight page")
	public void verify_that_the_user_is_navigated_successfully_to_search_flight_page() {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@id]")));
			Thread.sleep(5000);
			Assert.assertEquals(driver.getTitle(),"Select Cheap Flights Tickets | AirAsia");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
