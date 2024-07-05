package base;

import utils.UtilityClass;

public class ProjectSpecificationMethods extends UtilityClass{

	public void launchingBrowser(String url, String browser) throws Exception {
		
		
		browserLaunch(url,browser);
	}
	
	public void closeBrowser() {
		
		browserClose();
	}
}
