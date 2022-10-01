package interview_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_method {

	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", "Binary\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.location='https://demoqa.com/text-box'");
	driver.manage().window().maximize();
	
	WebElement usernm=driver.findElement(By.xpath("//input[@id='userName']"));
	js.executeScript("arguments[0].value='sadhana dattarao kadam'",usernm);
	
	//for Alert
	//js.executeScript("alert('welcome to excutor')");

	js.executeScript("alert('welcome to Excutor')");
	driver.switchTo().alert().accept();
	
	js.executeScript("alert('welcome to selenium')");
	driver.switchTo().alert().accept();
	
	
	//for print domain name
	 String domainname=js.executeScript("return document.domain").toString();
	 System.out.println("domain name="+domainname);
	 
	 //for print url
	 String URL=js.executeScript("return document.URL").toString();
	 System.out.println("URL name="+URL);
	 
	 
	 //refresh
	// js.executeScript("location.reload()");
		js.executeScript("location.reload()");


	 //for inner text
	 
	 String sText=js.executeScript("return document.documentElement.innerText").toString();
		System.out.println("inner text of the page="+sText);
		//String sText=js.executeScript("return documnet.documentElement.innerText").toString();
		//System.out.println("Inner TText="+sText);
		
	 //for titlename
	String Titlename=js.executeScript("return document.title;").toString();
	System.out.println("Title name="+Titlename);

	//retuern the title name
	//String TitleName=js.executeScript("return document.title;").toString();
	//System.out.println("Title of page="+TitleName);
	

	}

}
