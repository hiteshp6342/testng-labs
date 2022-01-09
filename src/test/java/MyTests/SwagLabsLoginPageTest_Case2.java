package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabsLoginPageTest_Case2 {
	WebDriver driver;
	String url = "https://www.saucedemo.com/";
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	@Test(priority = 1)
	public void verifyTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Swag Labs");
	}
	
	@Test(priority = 2)
	public void loginLogoPresent() {
		boolean loginLogoDisplayed = driver.findElement(By.cssSelector("div.login_logo")).isDisplayed();
		Assert.assertTrue(loginLogoDisplayed);
	}
	
	@Test(priority = 3)
	public void verifyLoginBotLogo() {
		boolean logoDisplayed = driver.findElement(By.cssSelector("div.bot_column")).isDisplayed();
		Assert.assertTrue(logoDisplayed);
	}
	
	@Test(priority = 4)
	public void login() {
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		WebElement homePageHeader = driver.findElement(By.cssSelector("span.title"));
		String pageHeader = homePageHeader.getText();
		Assert.assertEquals(pageHeader, "PRODUCTS");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
