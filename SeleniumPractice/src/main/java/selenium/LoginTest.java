package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

	@Test
	public  void loginMethod() {
		
		
		driver.findElement(By.id("userName")).sendKeys("Jey");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.id("newUser")).click();
		 System.out.println("Git_ Demo Testing");
		 
		 System.out.println("Git_Demo Team Testing");
		 
		 
		 
		 
		
		
		

	}

}
