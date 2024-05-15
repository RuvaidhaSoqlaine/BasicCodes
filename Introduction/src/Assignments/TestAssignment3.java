package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		
		List<WebElement> row= driver.findElements(By.cssSelector(".table-display tr"));
		int Row=row.size();
		System.out.println(Row);
		
		List<WebElement> col= driver.findElements(By.cssSelector(".table-display th"));
		int Coloumn=col.size();
		System.out.println(Coloumn);
		

		List<WebElement> Row2= driver.findElements(By.cssSelector(".table-display tr:nth-child(3) td"));
		for(int i=0;i<Row2.size();i++) {
			 System.out.println(Row2.get(i).getText());
		}

		
//		
//		WebElement table= driver.findElement(By.id("product"));
//		
//		List<WebElement>Row2 = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//		
//		//List<WebElement>Row2= Rows.get(2).findElements(By.tagName("td"));
//		
//		for(int i=0;i<Row2.size();i++) {
//			System.out.println(Row2.get(i).getText());
//		}
		
		
	}

}
