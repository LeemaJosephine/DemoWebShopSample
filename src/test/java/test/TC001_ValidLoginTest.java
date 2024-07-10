package test;

import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.LoginPage;

public class TC001_ValidLoginTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setup() throws Exception {
		
		readFromPropFile();
	}
	
	@Test
	public void validLoginTest() throws Exception {
		

		HomePage obj = new HomePage(driver);
		LoginPage obj1 = new LoginPage(driver);
		
		obj.clickLogin();
		obj1.enterEmail(prop.getProperty("Validemail"));
		obj1.enterPassword(prop.getProperty("Validpassword"));
		obj1.loginClick();
		obj.validateLogin();
	}
}
