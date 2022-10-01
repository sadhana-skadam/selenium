
package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v103.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {

	public WebDriver driver;
	  
	 @Test(groups={"sanity","regression"},priority=1)
	  public void launchChrome() 
	  {
	 	 System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	 	 driver=new ChromeDriver();
	 	 driver.get("https://www.facebook.com");
	 	 
	  }
	  @Test(groups="regression",priority=2,enabled=false)
	  public void ChekcTitle() 
	  {
		  String expectedTitle="Facebook – log in or sign up";
		  String ActualTitle=driver.getTitle();
		  Assert.assertEquals(ActualTitle, expectedTitle);
	  }
	 @Test(groups="sanity",priority=3)
	 public void login() 
	 {
		 WebElement usernm= driver.findElement(By.xpath("//input[@id='email']"));
		 usernm.sendKeys("sadhana kadam");
		 WebElement pass= driver.findElement(By.xpath("//input[@id='pass']"));
		 pass.sendKeys("ssg123");
		 
	 }
	 @Test(groups= {"sanity","regression"},priority=4)
	 public void teardown() {
		 Browser.close();
	 }
}
