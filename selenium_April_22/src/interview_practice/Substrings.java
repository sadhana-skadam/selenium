package interview_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Substrings {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement usernm=driver.findElement(By.cssSelector("input[id^='email']"));
		usernm.sendKeys("sadhanakadam");
		
		WebElement pass=driver.findElement(By.cssSelector("input[name$='pass']"));
		pass.sendKeys("sadhanakadam123");
		
		WebElement login=driver.findElement(By.cssSelector("button[name*='login']"));
		login.click();
		
	}

}
