package Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");

		//WebDriver driver= new ChromeDriver();
		WebDriver driver= new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();  

  		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();   //round trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();     //one way     
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("display: block; opacity: 0.5")) {
			
			System.out.println("Its disabled");
			Assert.assertTrue(true);                                      
		}
		else {
			System.out.println("Its Enabled");
			Assert.assertTrue(false);
		}
	
	

	driver.findElement(By.id("divpaxinfo")).click();          //to click the passenger btn
	Thread.sleep(2000L);	
 	int i=1;
 	for(i=1;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	WebElement staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown= new Select(staticdropdown);
	//dropdown.selectByIndex(3);
	dropdown.selectByVisibleText("AED");
	Thread.sleep(2000L);	

	driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
	
	Thread.sleep(2000L);	

	driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
		
	}  

}

