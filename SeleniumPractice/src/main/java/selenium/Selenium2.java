package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) {
		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://the-internet.herokuapp.com/windows"); // Button
		 * WebElement clickButton =
		 * driver.findElement(By.xpath("//a[text()='Click Here']"));
		 * clickButton.click(); // Parent Window String parentWindow =
		 * driver.getWindowHandle(); // get all Windows Set<String> allWindows =
		 * driver.getWindowHandles();
		 * 
		 * // Iterate every Window One by One for (String window : allWindows) {
		 * if(!window.equals(parentWindow)) { driver.switchTo().window(window);
		 * System.out.println(driver.getTitle());
		 * System.out.println("Git Demo Testing2");
		 * 
		 * } }
		 */

		/*
		 * int n=548923; int evencnt=0; int oddcnt=0; while(n!=0) { int rem=n%10; if
		 * (rem%2==0) { evencnt++; } else { oddcnt++; } n=n/10; }
		 * System.out.println("Even Count:"+evencnt);
		 * System.out.println("Odd Count:"+oddcnt);
		 */

		/*
		 * String str = "AutoTest@123"; int uppercase = 0; int lowercase = 0; int digits
		 * = 0; int special = 0; for (int j = 0; j < str.length(); j++) { char c =
		 * str.charAt(j); if (c >= 'A' && c <= 'Z') { uppercase++; } else if (c >= 'a'
		 * && c <= 'z') { lowercase++; } else if (c >= '0' && c <= '9') { digits++; }
		 * else { special++; } } System.out.println("uppercase :" + uppercase);
		 * System.out.println("lowercase :" + lowercase); System.out.println("digits :"
		 * + digits); System.out.println("special :" + special);
		 */
		/*
		 * String str="I love Selenium"; String[] split = str.split(" "); String
		 * result=""; for (String string : split) { for (int i = string.length()-1; i
		 * >=0 ; i--) { result=result+string.charAt(i); } result=result+" "; }
		 * System.out.println(result);
		 */

		/*
		 * String str="I love Selenium"; String word=""; String result=""; for (int i =
		 * 0; i < str.length(); i++) { if (str.charAt(i)!=' ') {
		 * word=str.charAt(i)+word; } else { result=result+" "+word; word="";
		 * 
		 * }
		 * 
		 * 
		 * } result=result+" "+word; System.out.println(result.trim());
		 * 
		 * int n=7; int first=0;int second=1; int next=0; for (int i = 0; i < n; i++) {
		 * if (i==1) System.out.print(first+" "); if (i==2)
		 * System.out.print(second+" "); }
		 * 
		 * for (int j = 3; j <=n; j++) { next=first+second; System.out.print(next+" ");
		 * first=second; second=next; }
		 */
		
		/*
		 * String str="automation";int vowcnt=0; for (int i = 0; i < str.length(); i++)
		 * { char c=str.charAt(i); if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		 * vowcnt++; }
		 * 
		 * } System.out.println(vowcnt);
		 */
		/*
		 * String str="automation"; int concnt=0; for (int i = 0; i < str.length(); i++)
		 * { char c=str.charAt(i); if (c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u') {
		 * concnt++; }
		 * 
		 * } System.out.println(concnt);
		 */
		
		/*
		 * int n=17; int count=0; for (int i = 1; i <=n; i++) { if (n%i==0) { count++; }
		 * } if (count==2) { System.out.println("prime"); } else {
		 * System.out.println("not prime"); }
		 */
		
		System.out.println("New Changes by Develop");
		
		
		
		
	}

}
