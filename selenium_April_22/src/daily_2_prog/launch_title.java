package daily_2_prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class launch_title {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());*/
		
		//headless browser
		
		System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
				opt.addArguments("--Headless");
		WebDriver driver1=new ChromeDriver(opt);
		driver1.get("https://www.flipkart.com");
		System.out.println(driver1.getTitle());
		
			HtmlUnitDriver driver=new HtmlUnitDriver();
			driver.get("https://www.facebook.com");
			System.out.println(driver.getTitle());
			
	//when we handle notofication
			System.setProperty("webdriver.edge.driver", "Binary\\msedgedriver.exe");
			EdgeOptions aa=new EdgeOptions();
					aa.addArguments("--disable");
			WebDriver driver11=new EdgeDriver(aa);
			driver11.get("https://www.flipkart.com");
			System.out.println(driver11.getTitle());
			
			
	}

}
