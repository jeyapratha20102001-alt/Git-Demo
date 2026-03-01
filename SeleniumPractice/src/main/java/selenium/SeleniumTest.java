package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.findElement(By.id("userName")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("User@123",Keys.TAB);
		driver.findElement(By.id("login")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit")));
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "demosite");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
		
		
		@BeforeMethod
		public void browserIntialization() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
		
		
		

	}

}
