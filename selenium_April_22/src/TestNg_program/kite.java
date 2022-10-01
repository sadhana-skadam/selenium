package TestNg_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class kite {
	public WebDriver driver;
	  @Test(dataProviderClass =Dataprovider.class,dataProvider="kite")
	  public void f(String username,String password,String pin) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\Binary\\chromedriver.exe");
		  	driver=new ChromeDriver();
		  	driver.get("https://kite.zerodha.com/");
		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  	WebElement Username=driver.findElement(By.xpath("//input[@id='userid']"));
		  	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		  	WebElement loginbtn=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  	Username.sendKeys(username);
		  	Password.sendKeys(password);
		  	loginbtn.click();
		  	Thread.sleep(5000);
		  	WebElement Pin=driver.findElement(By.xpath("//input[@id='pin']"));
		  	Pin.sendKeys(pin);
		  	WebElement conti=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  	conti.click();
		  	Thread.sleep(5000);
		  	String ExpectedTitle="Dashboard / Kite";
		  	String ActualTitle=driver.getTitle();
		  	Assert.assertEquals(ActualTitle, ExpectedTitle);
		  			
		  	
		  			
		  	
		  
		  	
	  }

}
