package TestNg_program;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Datapro {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
