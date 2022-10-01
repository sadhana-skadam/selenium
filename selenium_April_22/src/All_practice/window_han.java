package All_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_han {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drivers", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=104.0.5112.79/");
	}

}
