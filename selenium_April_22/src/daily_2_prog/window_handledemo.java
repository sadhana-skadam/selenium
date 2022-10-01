package daily_2_prog;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class window_handledemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable notifivation");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		String mainwindow=driver.getWindowHandle();
		WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
		jobs.click();
	Set<String> childwindows=	driver.getWindowHandles();
	Iterator<String> itr=childwindows.iterator();
	while(itr.hasNext()) 
	
	{
		String child_window=itr.next();
		if(!mainwindow.equalsIgnoreCase(child_window)) 
		{
			driver.switchTo().window(child_window);
		}
	}
	
		WebElement skills=driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']"));
		skills.sendKeys("selenium");
		
	}

}
