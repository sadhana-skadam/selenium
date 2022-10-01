package interview_practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com");
			driver.manage().window().maximize();
			
			String mainwindow=driver.getWindowHandle();
			WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
			jobs.click();
			
			
			Set<String> childwindows=driver.getWindowHandles();
			Iterator<String> itr=childwindows.iterator();
			while(itr.hasNext()) 
			{
				String child_windows=itr.next();
				{
					if(!mainwindow.equalsIgnoreCase(child_windows));
				}
				driver.switchTo().window(child_windows);
				
			}
			WebElement serv=driver.findElement(By.xpath("//div[text()='Services']"));
			serv.click();
			
			
					
	}

}
