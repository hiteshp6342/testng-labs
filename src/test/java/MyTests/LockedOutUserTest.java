package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LockedOutUserTest extends BaseTest {
	@Test
	public void lockedOutUserTest()  {
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));
		userName.sendKeys("locked_out_user");
		password.sendKeys("secret_sauce");
		loginButton.click();
		
		WebElement error = driver.findElement(By.cssSelector("h3[data-test='error']"));
		
		Assert.assertEquals(error.getText(), "Epic sadface: Sorry, this user has been locked out.");
	}
}
