package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		// Button
		WebElement clickButton = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickButton.click();
		// Parent Window
		String parentWindow = driver.getWindowHandle();
		// get all Windows
		Set<String> allWindows = driver.getWindowHandles();

		// Iterate every Window One by One
		for (String window : allWindows) {
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());
				System.out.println("Git Demo Testing2");
				
			}
			}
          			
		}

	}


