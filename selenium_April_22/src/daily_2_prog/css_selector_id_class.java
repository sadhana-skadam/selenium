package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector_id_class {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://kite.zerodha.com/");
			driver.manage().window().maximize();
			
			//WebElement user=driver.findElement(By.cssSelector("input#userid"));
		//	user.sendKeys("ABS123");
			
			//WebElement pass=driver.findElement(By.cssSelector("input#password"));
		//	pass.sendKeys("ssg123");
			
			//WebElement login=driver.findElement(By.cssSelector("button.button-orange.wide"));
				//login.click();
			
			//css_selector with substring
			
			/*WebElement user=driver.findElement(By.cssSelector("input[type^='text']"));
			user.sendKeys("SSG@88");
			
			//with dollar($)
			WebElement pass=driver.findElement(By.cssSelector("input[id$='password']"));
			pass.sendKeys("santysadhana9399");
			
			//with star(*)
			WebElement login=driver.findElement(By.cssSelector("button[class*='b']"));
			login.click();*/
					
			//css selector with combination of  ID and other attribute
			driver.get("https://www.flipkart.com");
	}

}
