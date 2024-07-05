package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.LoginPage;

public class TC002_InvalidLoginTest extends ProjectSpecificationMethods{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		HomePage obj = new HomePage(driver);
		LoginPage obj1 = new LoginPage(driver);
		
		obj.readFromPropFile();
		obj.launchingBrowser(prop.getProperty("url"),prop.getProperty("browser1"));
		obj.clickLogin();
		obj1.enterEmail(prop.getProperty("Invalidemail"));
		obj1.enterPassword(prop.getProperty("Invalidpass"));
		obj1.loginClick();
		obj.validateLogin();
	}

}
