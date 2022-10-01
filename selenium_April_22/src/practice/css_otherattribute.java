package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_otherattribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//WebElement loginbtn=driver.findElement(By.cssSelector("button[name='login']"));
		//loginbtn.click();
		WebElement loginbtn=driver.findElement(By.cssSelector("input[name='email']"));
		loginbtn.click();
		WebElement pass=driver.findElement(By.cssSelector("input[name='pass']"));
		pass.sendKeys("1234");
		

	}

}
