package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchro_demo {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
					driver.get("https://www.facebook.com");
					
					WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
				WebElement creatNewAcc=driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]"));
				creatNewAcc.click();
				//static wait
				//Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Sadhana");
				//name.sendKeys("Sadhana");
				WebElement sirnm=driver.findElement(By.xpath("//input[@name='lastname']"));
				sirnm.sendKeys("Kadam");
	}

}
