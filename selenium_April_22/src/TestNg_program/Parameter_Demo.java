package TestNg_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Demo {
  private static final String mul = null;
@Test
  @Parameters({"val1","val2"})
  public void add(int v1, int v2) {
	  int sum=v1+v2;
	  System.out.println("Additin is="+sum);
	 
  }
  @Test
  @Parameters({"val1","val2",})
  public void diff(int v1, int v2) {
	  int diff=v1-v2;
	  System.out.println("Additin is="+diff);
	 
  }
 
}
