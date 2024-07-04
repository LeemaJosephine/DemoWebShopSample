package utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {

	public static WebDriver driver;
	
	public void browserLaunch() {
		
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
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
