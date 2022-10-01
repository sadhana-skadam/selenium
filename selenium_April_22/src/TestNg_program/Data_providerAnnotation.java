package TestNg_program;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Data_providerAnnotation {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void fblogin(String username,String password) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	  /*WebElement userName=driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement passWord=driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
	  userName.sendKeys("sadhanakadam@198gmail.com");
	  passWord.sendKeys("SSG@8874");
	  loginbtn.click();*/
	 
	  		
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
      new Object[] { 2, "b" },
    };
  }
}
