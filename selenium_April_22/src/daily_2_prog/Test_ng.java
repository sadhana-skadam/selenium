package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_ng {
	public WebDriver driver;
	@Test(groups="sanity")
	public void  launchChrome()

	{
		 System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 
	}
	@Test(groups="regression")
	public void login() 
	{
		WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
		 WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		 WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
		 usernm.sendKeys("sadhana santosh Ghodke");
		 pass.sendKeys("SSG@123");
		 loginbtn.click();
	}

}
