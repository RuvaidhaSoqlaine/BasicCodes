import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Multiple Windows")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Click Here")).click();
		//driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> windows= driver.getWindowHandles();        //[parentId, childId]
		Iterator<String> It= windows.iterator();
		String parentId=It.next();
		String childId=It.next();
		driver.switchTo().window(childId);
		
//		Set<String> abc=driver.getWindowHandles();
//		Iterator<String> it=abc.iterator();
//      String parentWindow=it.next();
//      driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		
//		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());


		driver.switchTo().window(parentId);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());

//		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());



		

		
		
	}

}
