package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass{

	@Parameters({"url","browser"})
	@BeforeMethod
	public void launchingBrowser(String url, String browser) throws Exception {
		
		
		browserLaunch(url,browser);
	}
	
	@AfterMethod
	public void closeBrowser() {
		
		browserClose();
	}
	
	@DataProvider(name = "getData")
	public String[][] getData() throws Exception {
		
		String[][] data = readExcel(sheetname);
		return data;
	}
}
