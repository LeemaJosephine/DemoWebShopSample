package test;

import org.testng.annotations.Test;

public class AttributesSample {

	
	@Test(priority = 1)
	public void signUp() {
		
		System.out.println("Sign up functionality");
	}
	
	@Test(dependsOnMethods = {"signUp"},priority = 2)
	public void login() {
		
		System.out.println("Login functionality");
	}
	
	@Test(priority = 0)
	public void homePage() {
		
		System.out.println("Home Page");
	}
	
	@Test(enabled= false)
	public void search() {
		
		System.out.println("Search functionality");
	}
	
	@Test(alwaysRun = true)
	public void mandatory() {
		
		System.out.println("Mandatory method");
	}
	
	@Test(invocationCount = 3, invocationTimeOut = 10000, threadPoolSize = 1)
	public void runMoreThanOnce() {
		
		System.out.println("Run more than once");
	}
}
