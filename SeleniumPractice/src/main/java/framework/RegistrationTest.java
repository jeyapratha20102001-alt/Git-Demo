package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseClass {

	
	@Test(enabled=false)
	public void searchBook() {
		driver.findElement(By.id("searchBox")).sendKeys("Git Pocket Guide",Keys.TAB);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement until3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("gotoStore")));
		Assert.assertTrue(until3.isDisplayed());
		
		
	}

}
