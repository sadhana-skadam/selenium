package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_cssDemo {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			
			WebElement ue=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy"));
			ue.sendKeys("sadhanakadam");
			WebElement pss=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
			pss.sendKeys("1234");
	}

}
