package daily_2_prog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_han {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demoqa.com/frames");
	 	driver.manage().window().maximize();
	 	
	 	driver.switchTo().frame("frame1");
	 	WebElement frame1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	 	System.out.println(frame1.getText());
	 	
	 	driver.switchTo().parentFrame();
	 	driver.switchTo().frame("frame2");
	 	WebElement frame2=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	 	System.out.println(frame2.getText());
	 		
	 	driver.switchTo().parentFrame();
	 	WebElement pagetext=driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page')]"));
	 	System.out.println(pagetext.getText());
	 	
	}

}
