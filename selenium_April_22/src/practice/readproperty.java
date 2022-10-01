package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readproperty {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*FileInputStream srcfile=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\config.properties");
		Properties prop=new Properties();
		prop.load(srcfile);
		 	
		System.setProperty(prop.getProperty("key"),prop.getProperty("value"));
		Thread.sleep(5000);
		WebDriver driver=new ChromeDriver();*/
		FileInputStream srcfile=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\config.properties");
		Properties prop=new Properties();
		prop.load(srcfile);
		
		System.setProperty(prop.getProperty("key"),prop.getProperty("value"));
		ChromeDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		WebElement usenm=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		usenm.sendKeys(prop.getProperty("username"));
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(prop.getProperty("password"));
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
	}

}
