package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headless_brow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com");

		System.out.println(driver.getTitle());
		
		WebElement usernm= driver.findElement(By.cssSelector("input#userid"));
		usernm.sendKeys("OFB764");
		WebElement pass= driver.findElement(By.cssSelector("input#password"));
		pass.sendKeys("Svg@8888");
		WebElement login=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		login.click();
		Thread.sleep(2000);
		WebElement pin=driver.findElement(By.cssSelector("input[type='password']"));
		pin.sendKeys("904948");
	WebElement contibtn=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	contibtn.click();

		
	}
	

}
