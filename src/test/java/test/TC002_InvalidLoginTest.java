package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.LoginPage;

public class TC002_InvalidLoginTest extends ProjectSpecificationMethods{

	@Test
	public void invalidLoginTest() throws Exception {
		// TODO Auto-generated method stub

		
		HomePage obj = new HomePage(driver);
		LoginPage obj1 = new LoginPage(driver);
	
		
		obj.clickLogin();
		obj1.enterEmail(prop.getProperty("Invalidemail"));
		obj1.enterPassword(prop.getProperty("Invalidpass"));
		obj1.loginClick();
		obj.validateLogin();
	}

}
