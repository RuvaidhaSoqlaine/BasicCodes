package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;


public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
//		//above
//		WebElement nameEditBox= driver.findElement(By.cssSelector("[name='name']"));
//		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
//
//		//below
//		WebElement dob= driver.findElement(By.xpath("//label[@for='dateofBirth']"));
//		driver.findElement(with(By.tagName("input")).below(dob)).click();
//
//		//left
//		WebElement text=driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
//		driver.findElement(with(By.tagName("input")).toLeftOf(text)).click();
		
		//right
		WebElement radio=driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radio)).getText());
	}

}
