package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_on_mouse {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\Binary\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/buttons");
			driver.manage().window().maximize();
			Actions act=new Actions(driver);
			WebElement doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
			act.doubleClick(doubleclick).perform();
			
			WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
			act.contextClick(rightclick).perform();
			
			WebElement clickme=driver.findElement(By.xpath("//button[text()='Click Me']"));
			act.click(clickme).perform();
			
			WebElement dyanamic =driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
			act.moveToElement(dyanamic).perform();
			
			driver.get("https:www.naukri.com");
			
			WebElement job=driver.findElement(By.xpath("//div[text()='Jobs']"));
				act.moveToElement(job).perform();
				driver.get("https://demoqa.com/droppable");
				WebElement intraction=driver.findElement(By.xpath("//div[text()='Interactions']"));
				act.moveToElement(intraction).perform();
				WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
				WebElement drop=driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
				act.dragAndDrop(drag, drop).perform();
				
			
			
	}

}
