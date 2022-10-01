package selenium_April_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class launch_edge {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.edge.driver", "Binary\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		/*WebElement useremail= driver.findElement(By.id("email"));
		
		
		WebElement password =driver.findElement(By.id("pass"));
		WebElement loginbtn = driver.findElement(By.name("login"));
		useremail.sendKeys("sadhanakadam198@gmail.com");
		password.sendKeys("SSG@198");
		loginbtn.click();*/
		
		
		
		
		
	
				
		
	}

}
