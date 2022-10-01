package daily_2_prog;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNg_program.Dataprovider;

public class AmazonDclass {
	public WebDriver driver;
	  @Test(dataProviderClass =Amazondatapro.class,dataProvider = "amazondata")
	  public void f(String email) {
		  System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://amazon.com");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement signin= driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		  signin.click();
		  
		  WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
		  Email.sendKeys(email);
		  WebElement contibtn=driver.findElement(By.xpath("//input[@id='continue']"));
		  contibtn.click();
		  
	  }
}
