
package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Ruvaidha");
		driver.findElement(By.name("email")).sendKeys("ruvaidha@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234asdf"); 
		driver.findElement(By.id("exampleCheck1")).click(); 
		Thread.sleep(1000);
		
		
		WebElement gender= driver.findElement(By.id("exampleFormControlSelect1"));
		Select gen= new Select(gender);
		gen.selectByVisibleText("Female");
		Thread.sleep(1000);

		
		driver.findElement(By.id("inlineRadio1")).click(); 
		Thread.sleep(1000);

		driver.findElement(By.name("bday")).sendKeys("27-07-2000");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click(); 
		//driver.close();
		
		//System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).getText());
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());




		
		

		
		

		

	}

}





