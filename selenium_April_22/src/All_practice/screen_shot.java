package All_practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen_shot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcefile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcefile, new File("C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22//"+Timestamp()+"acd.jpeg"));
	}
	public static String Timestamp() 
	{
		return new SimpleDateFormat("yyyy-mm-dd HH-MM-SS").format(new Date());
	}

}
