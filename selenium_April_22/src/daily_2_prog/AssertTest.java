package daily_2_prog;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
	public WebDriver driver;
  @Test(groups="regression")
  public void facebooklaunch() {
	  System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	//  Reporter.log("wecome to facebook",true);
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	  Assert.assertTrue(logo.isDisplayed());
	  String expectedtitle="Facebook � log in or sign up";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, expectedtitle);
	  
  }
  @Test(groups="sanity")
  public void launchkite() {
	  System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  //Reporter.log("welcome to selenuim",true);
	  
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	  Assert.assertTrue(logo.isDisplayed());
	  String expectedtitle="Facebook � log in or sign up";
	  String ActualTitle = driver.getTitle();
	  SoftAssert SAssert=new SoftAssert();
	  SAssert.assertEquals(ActualTitle, expectedtitle);
  }  
}
