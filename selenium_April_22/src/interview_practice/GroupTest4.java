package interview_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupTest4 {
	public WebDriver driver;
  @Test()
  public void launchchrome() {
	  System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
  }
  @Test
  public void login() 
  {
	  WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
	  usernm.sendKeys("sadhanakadam198@gmail.com");
	  pass.sendKeys("sadhanakadam");
	  loginbtn.click();
  }
}
