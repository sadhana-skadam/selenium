package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class annd_or_text_context {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*WebElement useremail=driver.findElement(By.xpath("//input[@name='email' and @id='email']"));
		useremail.sendKeys("sadhanakadama@123");
		WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("1234566");*/
		
		//WebElement login=driver.findElement(By.xpath("//button[@id='u_0_5_Gd' or @type='submit']"));
		//login.click();
		//text()
		Thread.sleep(5000);
		WebElement fp=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		fp.click();
		
		
	}

}
