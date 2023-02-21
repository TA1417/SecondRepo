package TestingNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
//	1.India QutubMinar
//	2.Agra TajMahal
//	3. Hyderabad Charminar
	
		@DataProvider(name = "SearchDataSet")
		public Object [][] searchdata (){		
			Object[][] searchkeyword = new Object[3][2];
			searchkeyword [0][0] = "India";
			searchkeyword [0][1] = "QutubMinar";
			
			searchkeyword [1][0] = "Agra";
			searchkeyword [1][1] = "TajMahal";
			
			searchkeyword [2][0] = "Hyderabad";
			searchkeyword [2][1] = "Charminar";
			return searchkeyword;
		}
	
		@Test(dataProvider = "SearchDataSet")
		public void data (String country, String monument) {
		//Launch browser
		System.setProperty("Chrome.driver.exe","\\\"C:\\\\Users\\\\91860\\\\eclipse-workspace\\\\TestNG\\\\chromedriver.exe\\\"");
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("https://www.google.com/");
		//Enter keyword
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys(country +" "+ monument);
		//click on google search
		driver.findElement(By.xpath("//input[@name='btnK']")).submit();
	}
}
