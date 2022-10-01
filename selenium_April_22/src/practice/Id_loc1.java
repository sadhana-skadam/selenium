package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class Id_loc1 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com");
				/*WebElement useremail=driver.findElement(By.cssSelector("input#email"));
				useremail.sendKeys("sadhanakadam198@gamail.com");
				WebElement pass=driver.findElement(By.cssSelector("input#pass"));
				pass.sendKeys("12345");*/
				
				//css selector with combination of id and other Atribute
				
				WebElement useremil=driver.findElement(By.cssSelector("input#email[class='inputtext _55r1 _6luy']"));
				useremil.sendKeys("sadhanakadam123");
				WebElement pass=driver.findElement(By.cssSelector("input#pass[name='pass']"));
				pass.sendKeys("1234");
				
				
	}

}
