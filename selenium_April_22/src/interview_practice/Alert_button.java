package interview_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Alert_button {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement click=driver.findElement(By.xpath("//button[@id='alertButton']"));
		click.click();
		
		driver.switchTo().alert().accept();
		
		WebElement timealert=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		timealert.click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		//driver.switchTo().alert().accept();
		
		WebElement confirbtn=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirbtn.click();
		
		driver.switchTo().alert().dismiss();
		WebElement prombtn=driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",prombtn);
		driver.switchTo().alert().sendKeys("sadhana kadam");
		driver.switchTo().alert().accept();
		
	
		
		
		
		
	
		
	}

}
