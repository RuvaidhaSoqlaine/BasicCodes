package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://qaclickacademy.com/practice.php");		
		System.out.println(driver.findElements(By.tagName("a")).size());		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));  //limiting webdriver scope		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());		
		List<WebElement> Links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));		
		
		SoftAssert a= new SoftAssert();
		
		for(WebElement link : Links) {
			String url=link.getAttribute("href");			
			HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int rescode = conn.getResponseCode();
		    System.out.println(rescode);
		    a.assertTrue(rescode<400, "The link with Text"+link.getText()+"is broken with code" +rescode);			
	}
		a.assertAll();
	}
}
