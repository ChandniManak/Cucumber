package Cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirAsiaHome {
	
	WebDriver driver;
	
	@FindBy(xpath="//img[contains(@src,'flight')]")
	public WebElement flightIcon;
	
	@FindBy(xpath="//button[@id='wzrk-confirm']")
	public WebElement alertConfirmButton;
	
	@FindBy(xpath="//input[contains(@aria-label,'From')]")
	public WebElement fromField;
	
	@FindBy(xpath="//input[contains(@aria-label,'To')]")
	public WebElement toField;
	
	@FindBy(xpath="//input[@aria-label='Depart date']")
	public WebElement departDate;
	
	@FindBy(xpath="//div[text()='One way']//preceding-sibling::div")
	public WebElement oneWayReturnType;
	
	@FindBy(xpath="//div[contains(text(),'Confirm')]")
	public WebElement dateConfirmButton;
	
	@FindBy(xpath="(//div[@id='aa-web-search-button'])[1]")
	public WebElement submitButton;

	public AirAsiaHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void closeAlert() {
		if(alertConfirmButton.isDisplayed())
			alertConfirmButton.click();
	}
}
