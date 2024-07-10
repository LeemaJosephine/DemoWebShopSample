package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods{

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage clickLogin() {
		
		click(driver.findElement(By.className("ico-login")));
		return new LoginPage(driver);
	}
	
	public HomePage validateLogin() throws Exception {
		
		String text = driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText();
		System.out.println(text);
		screenShot("LoginTest_Validation");
		return this;
	}
}
