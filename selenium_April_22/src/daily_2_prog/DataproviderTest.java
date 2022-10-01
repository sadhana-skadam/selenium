package daily_2_prog;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataproviderTest {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String email) {
	  System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://amazon.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	  WebElement signin= driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	  signin.click();
	  
	  WebElement Email=driver.findElement(By.xpath("//input[@name='email']"));
	  Email.sendKeys(email);
	  WebElement contibtn=driver.findElement(By.xpath("//input[@id='continue']"));
	  contibtn.click();
	  
  }

  @DataProvider
  public Object[][] amazondata() {
    return new Object[][] {
      new Object[] { "sadhanakadam198@gmail.com" },
    };
  }
}
