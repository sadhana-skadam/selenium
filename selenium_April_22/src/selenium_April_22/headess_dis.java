package selenium_April_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class headess_dis {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","Binary\\msedgedriver.exe");
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--headless");
		//opt.addArguments("--disable-notifications");
		
		WebDriver driver=new EdgeDriver(opt);
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
				
	}

}
