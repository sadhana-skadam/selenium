package selenium_April_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class headless_edge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\dell\\eclipse-workspace\\selenium _Apri_l 22\\selenium_April_22\\Binary\\msedgedriver.exe");
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--headless");
		opt.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(opt);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());

	}

}
