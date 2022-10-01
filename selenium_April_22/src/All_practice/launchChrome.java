package All_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SadhanaAprill2022\\selenium _Apri_l 22\\selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
