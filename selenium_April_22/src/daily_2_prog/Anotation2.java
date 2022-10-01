package daily_2_prog;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Anotation2 {
  @Test
  public void f() {
	  System.out.println("first test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method test");
}

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class Test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Bfore tests Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After tests Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suit test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suit Test");
  }

}
