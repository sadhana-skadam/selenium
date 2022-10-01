package daily_2_prog;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class simple_Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com");
	//	System.out.println(driver.getTitle());
		
	//WebElement useremail=driver.findElement(By.id("email"));
	//WebElement pass=driver.findElement(By.id("pass"));
	//WebElement loginbt=driver.findElement(By.name("login"));
//useremail.sendKeys("sadhana kadam");
//pass.sendKeys("1234");
//loginbt.click();

   //locator-tagname
		//WebElement usrmail=driver.findElement(By.tagName("input"));
		//WebElement pass= driver.findElement(By.tagName("input"));
		//WebElement loginbtn=driver.findElement(By.tagName("button"));
	
		//useremail.sendKeys("santosh ghodke");
		//pass.sendKeys("ssg@88");
		//loginbtn.click();
		
		
		//locator-Link_Text
	//WebElement fp=driver.findElement(By.xpath("//div[@class='_9ay7']//child::a"));
		//fp.click();
		
		//partial- link- text
		//WebElement creacc=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		//creacc.click();
		
		driver.get("https://www.amazon.com");
		WebElement change=driver.findElement(By.xpath("//input[@data-action-type='DISMISS']"));
		change.click();
		//driver.switchTo().alert().accept();
		WebElement todaysdeals=driver.findElement(By.xpath("//a[text()='Customer Service']//preceding-sibling::a"));
		todaysdeals.click();
		
		
		
		
	}

}
