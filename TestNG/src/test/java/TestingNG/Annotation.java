package TestingNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Annotation {
@Test
public void verifytitle() {
	System.setProperty("Chrome.driver.exe", "\"C:\\Users\\91860\\eclipse-workspace\\TestNG\\chromedriver.exe\"");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	String ExpectedTitle = "Google";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, ExpectedTitle);
}
}
