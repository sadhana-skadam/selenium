package TestNg_program;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class FBDataTest {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void fblogin(String username , String password) {
	  System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.facebook.com");
	  WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement Password=driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
	  Username.sendKeys(username);
	  Password.sendKeys(password);
	  loginbtn.click();
	  String ExpectedTitle = "";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);

  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "sadhankadam198@gmail.com", "ssg123" },
      new Object[] { "santoshghodke189@gmail.com", "12345" },
      new Object[] { "sadhankadam198@gmail.com", "ssg123" },
      new Object[] { "santoshghodke189@gmail.com", "12345" },
    };
  }
}
