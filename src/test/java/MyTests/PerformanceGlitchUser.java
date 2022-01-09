package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PerformanceGlitchUser extends BaseTest {
	@Test
	public void lockedOutUserTest() {

		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		userName.sendKeys("performance_glitch_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		By homePageHeader = By.cssSelector("span.title");
		wait.until(ExpectedConditions.presenceOfElementLocated(homePageHeader));
		
		String pageHeader = driver.findElement(homePageHeader).getText();
		Assert.assertEquals(pageHeader, "PRODUCTS");

	}
}
