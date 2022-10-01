package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		WebElement userid=driver.findElement(By.cssSelector("input[type^='t']"));
		userid.sendKeys("OFB764");
		WebElement pass=driver.findElement(By.cssSelector("input[id$='password']"));
		pass.sendKeys("Svg@8888");
		WebElement loginbtn=driver.findElement(By.cssSelector("button[class*='button-orange wide']"));
		loginbtn.click();
		Thread.sleep(5000);
		WebElement pin=driver.findElement(By.cssSelector("input#pin"));
		pin.sendKeys("904948");
	WebElement conitbtn=driver.findElement(By.cssSelector("button[type='submit']"));
	conitbtn.click();

	}

}
