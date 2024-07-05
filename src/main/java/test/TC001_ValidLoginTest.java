package test;

import java.io.FileReader;
import java.util.Properties;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.LoginPage;

public class TC001_ValidLoginTest extends ProjectSpecificationMethods{

	public static void main(String [] args) throws Exception {
		

		HomePage obj = new HomePage(driver);
		LoginPage obj1 = new LoginPage(driver);
		
		obj.readFromPropFile(); // reading data from prop file
		obj.launchingBrowser(prop.getProperty("url"),prop.getProperty("browser"));
		obj.clickLogin();
		obj1.enterEmail(prop.getProperty("Validemail"));
		obj1.enterPassword(prop.getProperty("Validpassword"));
		obj1.loginClick();
		obj.validateLogin();
	}
}
