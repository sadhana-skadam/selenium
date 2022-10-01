package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_loc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	WebElement useremail=driver.findElement(By.id("email"));
	useremail.sendKeys("sadhanakadam198@gmail.com");
	
	//Locater-name
	WebElement password=driver.findElement(By.name("pass"));
	password.sendKeys("12345");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	if(links.size() !=0);
	{
		for (WebElement linkname:links);
		{
			System.out.println("linkname.getText()");
		}
	}
	
	//loginbtn.click();
	
	//Locater=linkText
	/*Thread.sleep(5000);
	
	WebElement fp=driver.findElement(By.linkText("Forgotten password?"));
	fp.click();
	
	// Locater =a
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	if(links.size()!=0);
	{
		for(WebElement linkname:links);
	System.out.println("linkname.getText()");}
	
	driver.get("https://kite.zerodha.com");
	//WebElement loginbtn1=driver.findElement(By.className("button-orange"));
	//loginbtn.click();
	WebElement email = driver.findElement(By.id("userid"));
		email.sendKeys("SSG@12");
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("ss@1998");
		
		WebElement loginbtn1= driver.findElement(By.className("button-orange"));
		loginbtn1.click();
		
		
		
		//WebElement loginbtn1=driver.findElement(By.tagName("button"));
		//loginbtn1.click();
		
		
		//WebElement fp1=driver.findElement(By.linkText("Forgot user ID or password?"));
		//fp1.click();
		//WebElement fpass= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/form/div[1]/div[2]/label"));
		//fpass.click();*/
		
		
	
	
	

	

	}

}
