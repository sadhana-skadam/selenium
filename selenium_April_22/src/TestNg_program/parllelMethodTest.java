package TestNg_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class parllelMethodTest {
	public WebDriver driver;
	 @Test
	 public void launchChrome() 
	 {
		 System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
		  driver=new ChromeDriver();
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
		  	Pin.sendKeys("904948");
		  	WebElement conti=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  	conti.click()
		  	;
	 }
	 
	 @Test(priority=4)
	 public void teardown() 
	 {
		  driver.quit();
	 }
	 
}
