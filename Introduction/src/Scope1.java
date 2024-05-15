import java.awt.AWTException;
		import java.awt.Robot;
		import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		public class Scope1 {

			public static void main(String[] args) throws AWTException, InterruptedException {
				// TODO Auto-generated method stub

				
				System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
				WebDriver driver= new ChromeDriver(); 
				driver.get("https://qaclickacademy.com/practice.php");
				
				System.out.println(driver.findElements(By.tagName("a")).size());
				
				WebElement footerdriver=driver.findElement(By.id("gf-BIG"));  //limiting webdriver scope
				
				System.out.println(footerdriver.findElements(By.tagName("a")).size());
				
				WebElement coloumndriver=footerdriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
				
				System.out.println(coloumndriver.findElements(By.tagName("a")).size());
			
				//click on each link in the coloumn and check if the pages are opening.
				
				for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++) {			
					
					String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
					coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
					Thread.sleep(3000);
				}

					Set<String> windows= driver.getWindowHandles();        //[parentId, childId]
					Iterator<String> It= windows.iterator();
					
					for(int j=0;j<windows.size();j++) {
					
					//driver.switchTo().window(It.next());

						String a= It.next();
						driver.switchTo().window(a);
						System.out.println(driver.getTitle());

					}
					

//					while(It.hasNext()) { // next index is present or not
//						driver.switchTo().window(It.next());  // Actually moves to next index
//						System.out.println(driver.getTitle());
//					}
					
					
					
				
				
			}


	}
