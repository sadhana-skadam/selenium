package interview_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes_han {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		WebElement samheading1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(samheading1.getText());
	
	driver.switchTo().parentFrame();
	driver.switchTo().frame("frame2");
	
	WebElement sampleheading=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	System.out.println(sampleheading.getText());
		driver.switchTo().parentFrame();
		
		WebElement text=driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page')]"));
		System.out.println(text.getText());
	

	}

}
