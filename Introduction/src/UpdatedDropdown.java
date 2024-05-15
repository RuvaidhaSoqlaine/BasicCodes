import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); //print true
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
      		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("display: block; opacity: 1")) {
			
			System.out.println("Its Enabled");
			Assert.assertTrue(true);                                      
		}
		else {
			System.out.println("Its Disabled");
			Assert.assertTrue(false);
		}

  

		
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());  //print 6
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);	
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());   //print 1 adult

		
		
     	int i=1;
//		while(i<5) {
//			
//			driver.findElement(By.id("hrefIncAdt")).click();
//			i++;
//		}
		for(i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());   //print 5 adult


	}

}
