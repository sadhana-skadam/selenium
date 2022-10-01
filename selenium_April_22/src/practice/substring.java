package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class substring {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//csss selector with char At
		/*WebElement useremail=driver.findElement(By.cssSelector("input[id^='email']"));
		useremail.sendKeys("sadhanakadam123");
		WebElement pass=driver.findElement(By.cssSelector("input[name^='pass']"));
		pass.sendKeys("12344");
		
		WebElement loginbtn=driver.findElement(By.cssSelector("button[class^='_42ft']"));
		loginbtn.click();*/
		
		//dollar($)
		WebElement useremail=driver.findElement(By.cssSelector( "input[class$='_6luy']"));
		useremail.sendKeys("sadhanakadam@123");
		
		//star(*)
		
		WebElement pass=driver.findElement(By.cssSelector("input[name*='pass']"));
		pass.sendKeys("123456");
		
	}

}
