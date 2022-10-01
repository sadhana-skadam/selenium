package interview_practice;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\Binary\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement fullnm=driver.findElement(By.xpath("//input[@id='userName']"));
		act.sendKeys(fullnm,"sadhana kadam");
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("sadhanakdama198@gimal.com").perform();
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("at.past rametakli tq manwat dist parbhani").perform();
		//act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.build().perform();
		act.keyUp(Keys.CONTROL);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.build().perform();
		act.keyUp(Keys.CONTROL);
		act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.ENTER).perform();
		WebElement sumit=driver.findElement(By.xpath("//button[text()='Submit']"));
		act.scrollToElement(sumit);
		
		
	}

}
