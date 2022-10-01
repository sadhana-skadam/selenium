package TestNg_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstTest {

		public WebDriver driver;
		
 @Test(groups="sanity")
 public void first() 
 {
	 System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 
 }
 @Test(groups="regression")
 public void Checktitle() 
 
 {
	String expectedtitle ="facebook-log in or sign up";
	String actultitle=driver.getTitle();
	Assert.assertEquals(actultitle, expectedtitle);
 }
 @Test(groups="regression")
 public void second() 
 {
	 WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
	 WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
	 WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
	 usernm.sendKeys("sadhana santosh Ghodke");
	 pass.sendKeys("SSG@123");
	 loginbtn.click();
 }
 
	
}
