package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_launch {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.get("https://www.facebook.com");
			driver.get("https://kite.zerodha.com");
			//driver.findElement(By.id("email")).sendKeys("sadhanakadam198ail.com");
			//driver.findElement(By.id("pass")).sendKeys("SSG@1998");
		//driver.findElement(By.className("button")).click();
			driver.findElement(By.id("userid")).sendKeys("Svg@88");
			driver.findElement(By.id("password")).sendKeys("ssg@198");
			driver.findElement(By.className("button-orange")).click();
		
					
	}

}
