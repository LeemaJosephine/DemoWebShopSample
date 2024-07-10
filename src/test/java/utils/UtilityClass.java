package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class UtilityClass {

	public static WebDriver driver;
	public static Properties prop;
	
	public void browserLaunch(String url, String browser) throws Exception {
		
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		} else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("headless")){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
		} else {
			driver = new ChromeDriver();
		}
		
		// Validate broken link
		
		// make the connection
		
		URL link = new URL(url);  // mention the url
		HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
		httpURLConnection.setConnectTimeout(3000);
		httpURLConnection.connect();
		
		// Get the response code and validate
		
		if(httpURLConnection.getResponseCode()== 200) {
			System.out.println(url +" - "+ httpURLConnection.getResponseMessage());
			driver.get(url);
		} else {
			System.out.println(url +" - "+ httpURLConnection.getResponseMessage());
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public static void readFromPropFile() throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject\\src\\main\\resources\\data\\LoginData.properties");
		prop = new Properties();
		prop.load(file);
	}
	public void browserClose() {
		
		driver.close();
	}
	
	public void click(WebElement ele) {
		
		ele.click();
		
	}
	
	public void sendkeys(WebElement ele , String value) {
		
		ele.sendKeys(value);
	}
	
	public void screenShot(String name) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWenShopProject\\snap\\"+name+".png");
		FileUtils.copyFile(src, dest);
	}
}
