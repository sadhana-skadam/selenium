package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Extra {

	private static Object sadhanakadam198;
	private Object gmail;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		//ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--headless");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("sadhanakadam198@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		
		

	}

}
