package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert_demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement click=driver.findElement(By.xpath("//button[@id='alertButton']"));
		click.click();
		driver.switchTo().alert().accept();
		WebElement timebtn=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		timebtn.click();
		
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		WebElement confirbtn= driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirbtn.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		WebElement prombtn=driver.findElement(By.xpath("//button[@id='promtButton']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].click();",prombtn);
		
		//driver.switchTo().alert().sendKeys("sadhanakadam");
		//driver.switchTo().alert().accept();
		
		
		
		
		
		
	}

}
