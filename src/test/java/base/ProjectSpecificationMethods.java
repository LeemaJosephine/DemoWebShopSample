package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass{

	@BeforeMethod
	public void launchingBrowser() throws Exception {
		
		
		browserLaunch(prop.getProperty("url"),prop.getProperty("browser"));
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		browserClose();
	}
}
