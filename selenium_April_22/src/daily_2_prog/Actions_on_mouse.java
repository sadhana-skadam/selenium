package daily_2_prog;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_on_mouse {

	public static void main(String[] args) {

				System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://demoqa.com/buttons");
				driver.manage().window().maximize();
				Actions act=new Actions(driver);
				/*WebElement dbclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
				act.doubleClick(dbclick).perform();
				
				WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
				act.contextClick(rightclick).perform();
				
				WebElement clickme=driver.findElement(By.xpath("//button[text()='Click Me']"));
				act.click(clickme).perform();
				WebElement dyanamic=driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
				act.moveToElement(dyanamic).perform();
				
				//move action
				driver.get("https://www.naukri.com");
				WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
				act.moveToElement(jobs).perform();*/
				
				//drag nd drop
				
				driver.get("https://demoqa.com/droppable");
				WebElement sort=driver.findElement(By.xpath("//span[text()='Sortable']"));
				act.moveToElement(sort);
				WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
				
				WebElement drop=driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div[@id='droppable']"));
				act.dragAndDrop(drag, drop).perform();
				
				
				
				
				
				
				
				
	}

}
