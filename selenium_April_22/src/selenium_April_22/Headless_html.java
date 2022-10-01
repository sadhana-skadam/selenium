package selenium_April_22;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless_html {

	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());}

}
