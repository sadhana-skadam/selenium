package practice;

import java.util.ResourceBundle.Control;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class key_board_actions {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
				ChromeDriver driver= new ChromeDriver();
				driver.get(""
						+ ""
						+ "");
				driver.manage().window().maximize();
				
				Actions act=new Actions(driver);
				WebElement usernm=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
				act.sendKeys(usernm, "sadhana kadam");
				act.sendKeys(Keys.TAB).perform();
				act.sendKeys("sadhanakadam198@gmail.com").perform();
				act.sendKeys(Keys.TAB).perform();
				act.sendKeys("At post Rametakali.tq-manwat.dist-parbhani").perform();
				act.keyDown(Keys.CONTROL);
				act.sendKeys("a");
				act.build().perform();
				act.keyUp(Keys.CONTROL);
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
				WebElement forms=driver.findElement(By.xpath("//div[text()='Forms']"));
				act.scrollToElement(forms);
				
				
				
				
				//act.sendKeys("At post Rametakali.tq-manwat.dist-parbhani").perform();
				//WebElement sbmit=driver.findElement(By.xpath("//button[@id='submit']"));
				//sbmit.click();
				
				
				
				
	}

}
