package Cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewToursRegister {

	WebDriver driver;

	@FindBy(linkText = "REGISTER")
	private WebElement registerLink;

	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(id="userName")
	private WebElement email;
	
	@FindBy(name="address1")
	private WebElement address;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="postalCode")
	private WebElement postalCode;
	
	@FindBy(name="country")
	private WebElement country;
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(name="submit")
	private WebElement submitButton;

	public NewToursRegister(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickRegisterLink() {
		this.registerLink.click();
	} 
	
	public void enterFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	public void enterPhone(String phone) {
		this.phone.sendKeys(phone);
	} 
	
	public void enterEmail(String email) {
		this.email.sendKeys(email);
	} 
	
	public void enterAddress(String address) {
		this.address.sendKeys(address);
	} 
	
	public void enterCity(String city) {
		this.city.sendKeys(city);
	} 
	
	public void enterState(String state) {
		this.state.sendKeys(state);
	}
	
	public void enterPostalCode(String postalCode) {
		this.postalCode.sendKeys(postalCode);
	} 
	
	public void selectCountryByValue(String country) {
		Select select = new Select(this.country) ;
		select.selectByValue(country);
	}
	
	public void enterUserName(String username) {
		this.username.sendKeys(username);
	} 
	
	public void enterPassword(String password) {
		this.password.sendKeys(password);
	} 
	
	public void enterConfirmPassword(String password) {
		this.confirmPassword.sendKeys(password);
	} 
	
	public void submit() {
		this.submitButton.click();
	} 
}
