package All_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v103.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodDepen {
	public WebDriver driver;
	  @Test
	  public void lunchchrome() 
	  {
	 	 System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	 	 
	 	 driver=new ChromeDriver();
	 	 driver.get("https://www.facebook.com");
	 	 
	  }
	  @Test(dependsOnMethods ="lunchchrome")
	  public void checktitle() 
	  {
		  String expectedtitle="Facebook – log in or sign up";
		  String ActualTitle=driver.getTitle();
		  Assert.assertEquals(ActualTitle, expectedtitle);
	  }
	  @Test(dependsOnMethods = "checktitle")
	  public void login() 
	  {
	 	 WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
	 	 WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
	 	 WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
	 	 usernm.sendKeys("sadhana santosh Ghodke");
	 	 pass.sendKeys("SSG@123");
	 	 loginbtn.click();
	  }
	  @Test(dependsOnMethods = "login")
	  public void teardown() 
	  {
		  Browser.close();
	  }
}
