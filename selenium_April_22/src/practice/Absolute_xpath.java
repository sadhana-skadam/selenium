package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://twitter.com/i/flow/login");
	Thread.sleep(20000);
			WebElement email=driver.findElement(By.xpath("//input[contains(@dir,'auto')]"));
					email.sendKeys("sadhanakadam@123");
	
	//WebElement email=driver.findElement(By.xpath("//div[@dir='auto']//input"));
	//email.sendKeys("sadhanakadam@123");
	}

}
 