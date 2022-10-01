package interview_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\Binary\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement doublclick=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
      act.doubleClick(doublclick).perform();
      
      WebElement rightclick=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
      act.contextClick(rightclick).perform();
      
      WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
      act.click(click).perform();
      
      WebElement dynamic=driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
      act.moveToElement(dynamic).perform();
      
      
      driver.get("https://demoqa.com/droppable");
      
      WebElement drag=driver.findElement(By.xpath("//div[text()='Drag me']"));
      WebElement drop=driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
      act.dragAndDrop(drag, drop).perform();
	}

}
