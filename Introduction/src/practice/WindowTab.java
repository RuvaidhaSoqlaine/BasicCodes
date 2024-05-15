package practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Initialize driver
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//switch to next tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//switch to next window
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		//collecting all the windows and storing into one set named as handles
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		String parentwindow=it.next();
		String childwindow=it.next();
		
		//switch to child window
		driver.switchTo().window(childwindow);
		
		//get url in the child window
		driver.get("https://rahulshettyacademy.com/");
		
		String courseName= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentwindow);
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		
		//Take screenshot and keep it in a file 
		File file=name.getScreenshotAs(OutputType.FILE);
		
		//copy ss from file to new file
		FileUtils.copyFile(file, new File("logo.png"));
		
		//get height and width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getWidth());
	}

}
