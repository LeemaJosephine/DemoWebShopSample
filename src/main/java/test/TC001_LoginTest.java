package test;

import base.ProjectSpecificationMethods;
import pages.HomePage;
import pages.LoginPage;

public class TC001_LoginTest extends ProjectSpecificationMethods{

	public static void main(String [] args) throws Exception {
		
		HomePage obj = new HomePage(driver);
		LoginPage obj1 = new LoginPage(driver);
		
		obj.launchingBrowser();
		obj.clickLogin();
		obj1.enterEmail("leema987@gmail.com");
		obj1.enterPassword("leema.123");
		obj1.loginClick();
		obj.validateLogin();
	}
}
