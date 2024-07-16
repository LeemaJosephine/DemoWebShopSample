package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods{

	@FindBy(className = "ico-login")
	WebElement loginButton;
	
	@FindBy(xpath = "(//a[@class='account'])[1]")
	WebElement validLoginText;
	
	@FindBy(xpath = "//span[@for='Email']")
	WebElement invalidLoginText;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickLogin() {
		
		click(loginButton);
		return new LoginPage(driver);
	}
	
	public HomePage validateLogin(String type, String message) throws Exception {
		
		
		if(type.equalsIgnoreCase("valid")){
			
		// Valid login validation
		String actualtext = validLoginText.getText();
		screenShot("Valid LoginTest_Validation");
		assert_Check(actualtext,message);
		
		
		} else if(type.equalsIgnoreCase("invalidemail")) {
		// Invalid login validation
		
		String actualErrorMsg = invalidLoginText.getText();
		screenShot("Invalid LoginTest_Validation");
		soft_assert(actualErrorMsg, message);
		
		}
		
		return this;
	}
}
