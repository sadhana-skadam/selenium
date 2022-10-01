package daily_2_prog;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen_shot {

	private static int MM;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcefile =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcefile, new File("C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\screenshot\\"+Time()+".jpeg"));
		
	}//to avoid overriding
	public static String Time() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
