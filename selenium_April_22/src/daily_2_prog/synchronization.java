package daily_2_prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class synchronization {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","Binary\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.naukri.com");
	}

}

