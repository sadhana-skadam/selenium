package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_han {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/frames");
			driver.manage().window().maximize();
			//for first frame
			driver.switchTo().frame("frame1");
			WebElement sampleheading=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			System.out.println(sampleheading.getText());
			
			//for second frame
			driver.switchTo().parentFrame();
			driver.switchTo().frame("frame2");
			WebElement samplehandling1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			System.out.println(samplehandling1.getText());
			
			//  for page text
			driver.switchTo().parentFrame();
			WebElement pagetext=driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page')]"));
			System.out.println(pagetext.getText());
			
	}

}
