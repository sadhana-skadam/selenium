package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class javascript_Excutor_method {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","Binary\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://demoqa.com/text-box'");
		driver.manage().window().maximize();
		WebElement usernme=driver.findElement(By.xpath("//input[@id='userName']"));
		js.executeScript("arguments[0].value='sadhnakadam'",usernme);
		
		//this method use for we have id
		//js.executeScript("document.getElementById('username').value='sadhana kadam'");
		WebElement submitbtn=driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].click()",submitbtn);
		js.executeScript("alert('welcome to excutor')");
		driver.switchTo().alert().accept();
		
		//retuen the domain name
		String Domainname=js.executeScript("return document.domain;").toString();
		System.out.println("Domain of the site="+Domainname);
		
		//return the url
		String url=js.executeScript("return document.URL;").toString();
		System.out.println("URL of the site="+url);
		
		//retuern the title name
		String TitleName=js.executeScript("return document.title;").toString();
		System.out.println("Title of page="+TitleName);
		
		//to scroll the element
		
		WebElement links=driver.findElement(By.xpath("//span[text()='Links']"));
		js.executeScript("arguments[0].scrollIntoView(true)", links);
		
		//for page refresh
		
		js.executeScript("location.reload()");
		//js.executeScript("location.reload()");
		
		//tyepes inner text
		
		String sText=js.executeScript("return document.documentElement.innerText").toString();
		System.out.println("inner text of the page="+sText);
		
		WebElement logo=driver.findElement(By.xpath(" //img[@src='/images/Toolsqa.jpg']"));
		System.out.println(logo.isDisplayed());
		
		
		
		
		
		
	}

}
