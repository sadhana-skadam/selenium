package TestNg_program;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class GroupTest {
	public WebDriver driver;
  
  @Test
  public void first() 
  {
 	 System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
 	 driver=new ChromeDriver();
 	 driver.get("https://www.facebook.com");
 	 
  }
  @Test
  public void second() 
  {
 	 WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
 	 WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
 	 WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
 	 usernm.sendKeys("sadhana santosh Ghodke");
 	 pass.sendKeys("SSG@123");
 	 loginbtn.click();
  }
  
 	
  }

  

