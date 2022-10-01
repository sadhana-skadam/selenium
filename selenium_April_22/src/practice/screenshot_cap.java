package practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class screenshot_cap {

	public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File srcfile=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile,new File("C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\screenshot\\"+timestamp()+".jpeg"));
			
			
			

	}
	public static String timestamp() 
	{
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
		
	}
	
	}


