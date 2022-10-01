package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class window_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
					String parentwindow=driver.getWindowHandle();
					WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
					jobs.click();	
					WebElement comp=driver.findElement(By.xpath("//div[text()='Companies']"));
					comp.click();
					Thread.sleep(30000);
					WebElement tool=driver.findElement(By.xpath("//div[text()='Tools']"));
					tool.click();
					
			/*Set<String> childwindows= driver.getWindowHandles();
			Iterator<String> itr=childwindows.iterator();
			while(itr.hasNext())
			{
				String child_window=itr.next();
				if(!parentwindow.equalsIgnoreCase(child_window)) 
				{
					
					driver.switchTo().window(child_window);
					WebElement skils=driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']"));
					skils.sendKeys("selenium");
				}
				
				
			}
		*/	

	}

}
