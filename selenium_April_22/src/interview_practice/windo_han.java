package interview_practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class windo_han {

	public static void main(String[] args) {
			System.setProperty("webdriver.edge.driver", "Binary\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.naukri.com");
			driver.manage().window().maximize();
			
			
			String mainwindow=driver.getWindowHandle();
			WebElement jobs= driver.findElement(By.xpath("//div[text()='Jobs']"));
			jobs.click();
			WebElement jobs1=driver.findElement(By.xpath("//div[text()='Jobs']"));
			jobs1.click();
			
			Set <String> childwindows=driver.getWindowHandles();
			Iterator<String> itr=childwindows.iterator();
			while(itr.hasNext()) 
			{
				String child_window=itr.next();
				if(!mainwindow.equalsIgnoreCase(child_window)) 
				{
					driver.switchTo().window(child_window);
				}
			}
			WebElement skils=driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']"));
			skils.sendKeys("Testing");
			
	}

}
