package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class window_han {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String parentwindow=driver.getWindowHandle();
		
		WebElement job=driver.findElement(By.xpath("//div[text()='Jobs']"));
		job.click();
		WebElement comp=driver.findElement(By.xpath("//div[text()='Companies']"));
		comp.click();
		//WebElement skilss=driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']"));
		//
		Thread.sleep(30000);
		WebElement tools=driver.findElement(By.xpath("//div[text()='Tools']\""));
		tools.click();
		
	}

}
