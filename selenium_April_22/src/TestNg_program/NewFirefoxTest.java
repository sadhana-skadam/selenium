package TestNg_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewFirefoxTest {
	public WebDriver driver;
	 @Test
	 public void launchFirefox() 
	 {
		 System.setProperty("webdriver.gecko.driver", "Binary\\geckodriver.exe");
		 FirefoxOptions opt=new FirefoxOptions();
		 opt.addArguments("--headless");
		  driver=new FirefoxDriver(opt);
		  driver.get("https://kite.zerodha.com");
	 }
	 @Test(priority=1)
	 public void loginkite() 
	 {
		  WebElement Username=driver.findElement(By.xpath("//input[@id='userid']"));
		  	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		  	WebElement loginbtn=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  	Username.sendKeys("OFB764");
		  	Password.sendKeys("Svg@8888");
		  	loginbtn.click();
	 }
	 @Test(priority=2)
	 public void Checktitle() 
	 {
		  String ExpectedTitle="Kite - Zerodha's fast and elegant flagship trading platform";
		  	String ActualTitle=driver.getTitle();
		  	Assert.assertEquals(ActualTitle, ExpectedTitle);
		  			
		  	
	 }
	 @Test(priority=3)
	 public void loginkitepin() throws InterruptedException {
		 Thread.sleep(5000);
		 WebElement Pin=driver.findElement(By.xpath("//input[@id='pin']"));
		 Thread.sleep(5000);
		  	Pin.sendKeys("904948");
		  	WebElement conti=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  	conti.click();
	 }
	 
	 @Test(priority=4)
	 public void teardown() 
	 {
		  driver.quit();
	 }
}
