package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launch_chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	
	driver.manage().window().maximize();
	
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//Thread.sleep(5000);
	WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
	login.click();
	WebElement mo=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	mo.sendKeys("7499473794");
	//WebElement mo1=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("SSG@8888");
	WebElement submit=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	submit.click();
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Fashion']"))).click();
	WebElement fa=driver.findElement(By.xpath("//div[text()='Fashion']"));
	fa.click();

	
		
	
			}

}
