package Cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirAsiaLogin {

	WebDriver driver;
	
	public String loginWidgetByID = "sso-login-signup-widget";
	
	@FindBy(id="sso-login-email-input")
	public WebElement email;
	
	@FindBy(id="sso-login-password-input")
	public WebElement password;
	
	@FindBy(xpath="(//button[@class='sso-button'])[1]")
	public WebElement signInButton;
	
	public String errorMessageSectionByClass = "sso-error-message";
	
	@FindBy(xpath="//div[@class='sso-error-message']/div")
	public WebElement errorMessage;
	
	public AirAsiaLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
