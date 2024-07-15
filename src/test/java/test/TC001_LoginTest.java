package test;

import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.LoginPage;

public class TC001_LoginTest extends ProjectSpecificationMethods{

	@BeforeTest
	public void setup() throws Exception {
		
		readFromPropFile();
		sheetname="LoginData";
	}
	
	@Test(dataProvider = "getData")
	public void validLoginTest(String mailid, String password, String type, String message) throws Exception {
		

		HomePage obj = new HomePage(driver);
		LoginPage obj1 = new LoginPage(driver);
		
		obj.clickLogin();
		obj1.enterEmail(mailid);
		obj1.enterPassword(password);
		obj1.loginClick();
		obj.validateLogin(type,message);
	}
}
