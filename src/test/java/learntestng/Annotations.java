package learntestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	
	@BeforeSuite
	public void startServer() {
		System.out.println("Start Server - Before Suite");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Browser - Before Test");
	}
	
	@BeforeClass
	public void setupBrowser() {
		System.out.println("Setup Browser - Before Class");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login - Before Method");
	}
	
	@Test(priority = 2)
	public void verifyHomePageTitle() {
		System.out.println("Home Page - Test");
	}
	
	@Test(priority= 1)
	public void verifyUser() {
		System.out.println("User Verification - Test");
		int i = 10/0;
	}
	
	@Test(priority=3,enabled=false)
	public void verifyHeader() {
		System.out.println("Verify Header - Test");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("Log out - After Method");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser - After Class");
	}
	
	@AfterTest
	public void cleanDatabase() {
		System.out.println("Clean Database - After Test");
	}
	
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("Disconnect Database - After Suite");
	}
	
	
	
	
}
