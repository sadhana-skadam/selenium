package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//for frame1
		driver.switchTo().frame("frame1");
		
		WebElement samplehandling=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(samplehandling.getText());
		
		//for frame2
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame2");
		WebElement sampleheading1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(sampleheading1.getText());
		
		driver.switchTo().parentFrame();
		WebElement pagetext=driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page')]"));
		System.out.println(pagetext.getText());
		
	
		
		
			
	}

}
