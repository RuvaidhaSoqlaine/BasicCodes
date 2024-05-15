import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		
		while(!driver.findElement(By.cssSelector("[class='cur-month']")).getText().contains("April")) {
			driver.findElement(By.cssSelector("span[class='flatpickr-next-month'] [version='1.1']")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.className("dayContainer"));
		
		int count=driver.findElements(By.className("dayContainer")).size();
		 
		
		for(int i=0;i<count;i++) {
			
			String text=driver.findElements(By.className("dayContainer")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("dayContainer")).get(i).click();
				break;				
			}
		}
	}                        
}         
//Grab common attribute & put in a list & iterate