package TestNg_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class browserparameter {
  @Test
  @Parameters("browser")
  public void browser(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\Binary\\chromedriver.exe" );
		  	WebDriver driver=new ChromeDriver();
		  	driver.get("https://www.google.com");
		 	  }
		 	  else if(browser.equalsIgnoreCase("egde")) 
		 	  {
		 		  System.setProperty("webdriver.edge.driver","C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\Binary\\msedgedriver.exe" );
		 		 	WebDriver driver=new EdgeDriver();
		 		 	driver.get("https://www.facebook.com");
		 	  }
		 	  else if(browser.equalsIgnoreCase("gecko")) 
		 	  {
		 		  System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\Binary\\geckodriver.exe" );
		 		 	WebDriver driver=new FirefoxDriver();
		 		 	driver.get("https://www.amazon.com");
		 	  }
	  
  }
}
