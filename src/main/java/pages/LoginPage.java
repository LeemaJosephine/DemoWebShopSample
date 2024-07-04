package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods{


	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public LoginPage enterEmail(String email) {
		
		sendkeys(driver.findElement(By.id("Email")),email);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		
		sendkeys(driver.findElement(By.id("Password")),password);
		return this;
	}
	
	public HomePage loginClick() {
		
		click(driver.findElement(By.xpath("//input[contains(@class,'login-button')]")));
		return new HomePage(driver);
	}
	
}
