package TestNg_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_NG {
	public WebDriver driver;
  @Test(groups= {"sanity","regression"})
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.Amazon.com");
	  
  }
 
  
 @Test(groups="sanity")
 public void second() {
	 WebElement singin=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	 singin.click();
	 WebElement monu=driver.findElement(By.xpath("//input[@name='email']"));
	 monu.sendKeys("7499473794");
	 WebElement conti=driver.findElement(By.xpath("//input[@id='continue']"));
	 conti.click();
 }
}
