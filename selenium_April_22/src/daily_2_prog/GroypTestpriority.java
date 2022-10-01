package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroypTestpriority {
	public WebDriver driver;
	  @Test(groups={"sanity","regression"},priority=1)
	  public void launchChrome() {
		  System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  @Test(groups="sanity",priority=2)
	  public void checktitle() 
	  {
		  String Expected="Facebook – log in or sign up";
		  String Actual=driver.getTitle();
		  Assert.assertEquals(Actual, Expected);
		  
	  }
	  @Test(groups="regression",priority=3)
	  public void login() 
	  {
		  WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
		  usernm.sendKeys("sadhana santosh ghodke");
		  WebElement passwd=driver.findElement(By.xpath("//input[@id='pass']"));
		  passwd.sendKeys("SSG@88");

		  
	  }
	  @Test(groups={"sanity","regression"},priority=4)
	  
	  public void logout() 
	  {
		  driver.close();
	  }
}
