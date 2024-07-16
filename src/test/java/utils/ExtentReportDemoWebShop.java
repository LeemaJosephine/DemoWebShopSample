package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoWebShop {

	public static ExtentReports getReport() {
		
		String path="C:\\Users\\Digital Suppliers\\eclipse-workspace\\DemoWebShopProject\\report\\DemoWebShopReport.html";
		// To create report in the given location
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("DemoWebShop Reporter");
		
		// To capture test data
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		return extent;
	}
}
