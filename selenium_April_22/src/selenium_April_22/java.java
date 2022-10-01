package selenium_April_22;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class java {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sadhanakadam198@gmail.com");

	}

}
