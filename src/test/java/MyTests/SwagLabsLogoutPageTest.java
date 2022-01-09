package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsLogoutPageTest extends BaseTest{


	@Test
	public void logout()  {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		By logout = (By.id("logout_sidebar_link"));
		wait.until(ExpectedConditions.elementToBeClickable(logout));
		driver.findElement(logout).click();
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.saucedemo.com/");
	}
}
