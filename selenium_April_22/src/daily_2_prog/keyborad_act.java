package daily_2_prog;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyborad_act {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		
		
		Actions act=new Actions(driver);
		WebElement usernm=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		act.sendKeys(usernm, "sadhana kadam");
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("sadhanakadam198@gmail.com").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("At post Rametakali,tq=manwat,dit=pbn.").perform();
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("At post Rametakali,tq=manwat,dit=pbn.").perform();
		//act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
	act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		act.sendKeys(Keys.TAB);
		act.sendKeys(Keys.ENTER).perform();
		WebElement sub=driver.findElement(By.xpath("//button[text()='Submit']"));
		act.moveToElement(sub);
		
		
		
		
	}

}
