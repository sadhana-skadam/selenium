package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//contains Xpath
		//WebElement useremail=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		
		//useremail.sendKeys("sadhanakadam123");
		//basic xpath
		/*WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("12345");
		WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();
		WebElement fp=driver.findElement(By.xpath("//a[@class='_97w4']"));
		fp.click();*/
		
		//starts with
		/*driver.get("https://kite.zerodha.com");
		WebElement uID=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		
		uID.sendKeys("OFB764");
		pass.sendKeys("Svg@8888");
		loginbtn.click();
		Thread.sleep(20000);
		WebElement pin=driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys("904948");
	WebElement conbtn=driver.findElement(By.xpath("//button[@type='submit']"));

		conbtn.click();*/
		WebElement login=driver.findElement(By.xpath("//button[starts-with(@class,'_42ft')]"));
		login.click();

		

	}

}
