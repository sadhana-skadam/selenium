package TestNg_program;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation1 {
	public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("frist test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method test");
  }
  
  @Test
  public void s() 
  {System.out.println("second test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method test");
  }
  @Test
  public void ss() 
  {
	  System.out.println("third test");
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before tests  test");
  }

  @AfterTest
  public void afterTest() { 
	  System.out.println("After tests test");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suit test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suit test");
  }

}
