package selenium_April_22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launvh_chrome {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
		
		// Locator  -id
		//WebElement useremail=driver.findElement(By.id("email"));
		//useremail.sendKeys("sadhanakadam198@gmail.com");
		//WebElement password=driver.findElement(By.id("pass"));
		//password.sendKeys("123456");
		
		//locator - name
		WebElement useremail1=driver.findElement(By.id("userid"));
		 useremail1.sendKeys("ssg234");
		 WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 password.sendKeys("sadhanakadam123");
		 
		// locator - tagname
		//WebElement useremail=driver.findElement(By.tagName("button"));
		//useremail.sendKeys("sadhanakadama198@gmai.com");
		
		
		//Locator-LinkText
		 driver.get("https://www.facebook.com");
		 WebElement fp= driver.findElement(By.linkText("Forgotten password?"));
		 fp.click();
		 
		
		
		
		
		
		
		
		 
		
		
		

	}

}
