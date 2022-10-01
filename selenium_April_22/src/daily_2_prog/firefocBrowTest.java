package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class firefocBrowTest {
	public WebDriver driver;
	  @BeforeClass
	  @Parameters("browser")
	  public void launchchrome(String browser) {
		  if(browser.equalsIgnoreCase("chrome")) 
		  {
			  System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
			  driver=new ChromeDriver();
		  }
		  else if(browser.equalsIgnoreCase("edge")) 
		  {
			  System.setProperty("webdriver.edge.driver","Binary\\msedgedriver.exe");
			  driver=new EdgeDriver();
		  }
		  else if(browser.equalsIgnoreCase("gecko"))
		  {
			  System.setProperty("webdriver.gecko.driver","Binary\\geckodriver.exe");
			  driver=new FirefoxDriver();
		  }
		  driver.get("https://kite.zerodha.com");

	  }
	  @Test(priority=2)
	  public void loginkite() 
	  {
		  WebElement Username=driver.findElement(By.xpath("//input[@id='userid']"));
		  	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		  	WebElement loginbtn=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  	Username.sendKeys("OFB764");
		  	Password.sendKeys("Svg@8888");
		  	loginbtn.click();
	  }
	  @Test(priority=3)
	  public void Checktitle() 
	  {
		  String ExpectedTitle="Kite - Zerodha's fast and elegant flagship trading platform";
		  	String ActualTitle=driver.getTitle();
		  	Assert.assertEquals(ActualTitle, ExpectedTitle);
		  			
		  	
	  }
	  @AfterClass
	  public void teardown() 
	  {
		  driver.quit();
	  }
}
