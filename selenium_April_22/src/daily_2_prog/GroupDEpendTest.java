package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDEpendTest {
	public WebDriver driver;
	  @Test( groups= "launchB")
	  public void launchChrome() {
		  System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  @Test( groups= "checkT")
	  public void checktitle() 
	  {
		  String Expected="Facebook – log in or sign up";
		  String Actual=driver.getTitle();
		  Assert.assertEquals(Actual, Expected);
		  
	  }
	  @Test(groups = "signin")
	  public void login() 
	  {
		  WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
		  usernm.sendKeys("sadhana santosh ghodke");
		  WebElement passwd=driver.findElement(By.xpath("//input[@id='pass']"));
		  passwd.sendKeys("SSG@88");

		  
	  }
	  @Test(groups ="signout")
	  
	  public void logout() 
	  {
		  driver.close();
	  }
}
