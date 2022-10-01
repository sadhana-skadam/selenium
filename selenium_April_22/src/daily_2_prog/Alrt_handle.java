package daily_2_prog;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Alrt_handle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement alrtbtn=driver.findElement(By.xpath("//button[@id='alertButton']"));
		alrtbtn.click();
		driver.switchTo().alert().accept();
		
		WebElement alertbtn1=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		alertbtn1.click();
		
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		WebElement confirbtn=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirbtn.click();
		driver.switchTo().alert().dismiss();
		
		
	}

}
