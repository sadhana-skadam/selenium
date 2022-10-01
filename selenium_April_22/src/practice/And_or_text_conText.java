package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class And_or_text_conText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//relative method with AND method
		/*WebElement useremail=driver.findElement(By.xpath("//input[@ class='inputtext _55r1 _6luy'and @id='email']"));
		useremail.sendKeys("sadhanakadama198@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass' and @class='inputtext _55r1 _6luy _9npi']"));
		
		pass.sendKeys("12456789");
		
		//relative method with OR method
		WebElement login=driver.findElement(By.xpath("//button[@type='submit' or @id='u_0_5_xf']"));
		login.click();*/
        
		//Relative method with text() method
		//WebElement login  =driver.findElement(By.xpath("//button[text()='Log In']"));
		//login.click();
		Thread.sleep(5000);
		//WebElement forgotpass=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		//forgotpass.click();
		WebElement forgotpass=driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		forgotpass.click();
		
		

		
		
		
	}

}

