package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods{


	@FindBy(id="Email")
	WebElement emailField;
	
	@FindBy(id="Password")
	WebElement passField;
	
	@FindBy(xpath ="//input[contains(@class,'login-button')]")
	WebElement login;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage enterEmail(String email) {
		
		sendkeys(emailField,email);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		
		sendkeys(passField,password);
		return this;
	}
	
	public HomePage loginClick() {
		
		click(login);
		return new HomePage(driver);
	}
	
}
