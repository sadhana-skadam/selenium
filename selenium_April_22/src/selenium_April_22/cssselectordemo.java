package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectordemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//css selector With ID
		
		/*WebElement useremail=driver.findElement(By.cssSelector("input#email"));
		useremail.sendKeys("sadhanakadam198@gmail.com");
		WebElement pass=driver.findElement(By.cssSelector("input#pass"));
		pass.sendKeys("ssg@123");*/
		
		//CSS Selector with Class
		
		WebElement useremail=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy"));
		useremail.sendKeys("sadhanakadam198@gmail.com");
		WebElement pass=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
		pass.sendKeys("12345");
	}

}
