import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//WebDriverWait w= new WebDriverWait(driver,5);
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='okayBtn")));
 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[id='okayBtn']")).click();
		driver.findElement(By.className("form-control")).click();
		driver.findElement(By.xpath("//div/select/option[3]")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class=\"btn btn-info\"]")));

		Thread.sleep(3000);

		List<WebElement> products= driver.findElements(By.xpath("//div[@class=\"card-footer\"]"));
		Thread.sleep(2000);
		for(int i=0;i<products.size();i++) {
			
			products.get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();

	}

}
