package daily_2_prog;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen_shot1 {

	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");

TakesScreenshot ts=(TakesScreenshot)driver;
File srcfile=ts.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(srcfile, new File("C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\screenshot//"+timesstamp()+".jpeg"));


	}
	public static String timesstamp() {
		return new SimpleDateFormat("yyyy-mm-dd hh-mm-ss").format(new Date());
	}

}
