package All_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v103.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoupTest {
	WebDriver driver;
	 @Test(groups= {"sanity","regression"},priority=1)
	  public void frist() 
	  {
	 	 System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	 	 driver=new ChromeDriver();
	 	 driver.get("https://www.facebook.com");
	 	 
	  }
	 @Test(groups="sanity",priority=2)
	 public void checktitle() 
	 {
		 String ExpectedTitle="Facebook – log in or sign up";
		 String ActualTitle=driver.getTitle();
		 Assert.assertEquals(ActualTitle, ExpectedTitle);
	 }
	  @Test(groups={"sanity","regression"},priority=3)
	  public void second() 
	  {
	 	 WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
	 	 WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
	 	 WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
	 	 usernm.sendKeys("sadhana santosh Ghodke");
	 	 pass.sendKeys("SSG@123");
	 	 loginbtn.click();
	  }
	  @Test(groups="regression",priority=4)
	  public void logout() 
	  {
		  Browser.close();
	  }
	  
	 	

}
