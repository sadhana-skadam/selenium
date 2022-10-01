package daily_2_prog;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Test {
	public WebDriver driver;
  @Test
  public void launchchrome() {
	  System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.facebook.com");
	  String Expectedtitle="Facebook � log in or sign up";
	  String ActualTitle=driver.getTitle();
	Assert.assertEquals(ActualTitle, Expectedtitle);
	  
	  WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	  Assert.assertTrue(logo.isDisplayed());
	 
	  
  }
  @Test
  public void launchkite() 
  {System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  driver.get("https://kite.zerodha.com");
  String ExpectedTitle="Kite - Zerodha's fast and elegant flagship trading platfor";
  String ActualTitle=driver.getTitle();
	SoftAssert Sassert= new SoftAssert();
	Sassert.assertEquals(ActualTitle, ExpectedTitle);
  
  WebElement logok=driver.findElement(By.xpath("//img[@src='/static/images/kite-logo.svg']"));
  Sassert.assertTrue(logok.isDisplayed());
  System.out.println("welcome to testng assert");
 // Sassert.assertAll();
  
  
	
  }
}
