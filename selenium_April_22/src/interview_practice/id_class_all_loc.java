package interview_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class id_class_all_loc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		WebElement usernm=driver.findElement(By.id("email"));
		usernm.sendKeys("sadhana kadam");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Svg@123");
		
		//by name
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		//by linktext()
		Thread.sleep(2000);
		WebElement fb=driver.findElement(By.linkText("Forgotten password?"));
		fb.click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].",fb);
	}

}
