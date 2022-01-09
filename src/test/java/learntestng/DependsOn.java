package learntestng;

import org.testng.annotations.Test;

public class DependsOn {
	
	
	@Test
	public void login() {
		System.out.println("Login");
		//int i = 1/0;
	}
	
	@Test(dependsOnMethods = "login")
	public void homePageTitleTest() {
		System.out.println("Home Page");
	}
	
	@Test(dependsOnMethods = {"login","homePageTitleTest"})
	public void userProfileTest() {
		System.out.println("User Profile");
	}

}
