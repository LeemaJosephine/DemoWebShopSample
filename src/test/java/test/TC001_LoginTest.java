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
		

		 new HomePage(driver)
		 .clickLogin()
		 .enterEmail(mailid)
		 .enterPassword(password)
		 .loginClick()
		 .validateLogin(type, message);
		
	}
}
