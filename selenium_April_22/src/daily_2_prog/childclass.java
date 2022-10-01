package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v103.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class childclass extends superclass {
	
	@Test(dependsOnMethods = "launchChrome")
	  public void ChekcTitle() 
	  {
		  String expectedTitle="Facebook – log in or sign up";
		  String ActualTitle=driver.getTitle();
		  Assert.assertEquals(ActualTitle, expectedTitle);
	  }
	 @Test(dependsOnMethods = "ChekcTitle")
	 public void login() 
	 {
		 WebElement usernm= driver.findElement(By.xpath("//input[@id='email']"));
		 usernm.sendKeys("sadhana kadam");
		 WebElement pass= driver.findElement(By.xpath("//input[@id='pass']"));
		 pass.sendKeys("ssg123");
		 
	 }
	 @Test(dependsOnMethods = "login")
	 public void teardown() {
		 Browser.close();
	 }
	  
}
