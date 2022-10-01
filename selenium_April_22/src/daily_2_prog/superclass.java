package daily_2_prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class superclass {
	public WebDriver driver;
	  
	 @Test
	  public void launchChrome() 
	  {
	 	 System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	 	 driver=new ChromeDriver();
	 	 driver.get("https://www.facebook.com");
	 	 
	  }


}
