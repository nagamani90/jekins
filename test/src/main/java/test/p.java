package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p {
@Test

public void u() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
}
