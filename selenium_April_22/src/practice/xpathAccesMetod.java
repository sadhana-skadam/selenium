package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAccesMetod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.com");
		
		//Thread.sleep(20000);
		WebElement deals=driver.findElement(By.xpath("//h2[text()='Deals & Promotions']"));
		deals.click();
		
		
		
		
	}

}
