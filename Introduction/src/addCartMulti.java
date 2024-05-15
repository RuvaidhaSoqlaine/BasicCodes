import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addCartMulti {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			
			driver.get("https://rahulshettyacademy.com/seleniumPractise/"); 
			String[] itemNeeded={"Cucumber","Brocolli","Beetroot","Carrot"};		
			addItem(driver,itemNeeded);
			driver.findElement(By.cssSelector("img[alt='Cart']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
			driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
			
			
			
			 //driver.close();  

                                                                                            
		}
	
	public static void addItem(WebDriver driver,String[] itemNeeded) {
		
		
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<products.size();i++) {
			String[] name=products.get(i).getText().split("-");
			String formattedName= name[0].trim();
			
			List itemNeededList=Arrays.asList(itemNeeded);
			
			if(itemNeededList.contains(formattedName)) {
				int j=0;
				j++;
				driver.findElements(By.xpath("//div[@class=\'product-action\']/button")).get(i).click();
				
				if(j==itemNeeded.length) {
					break;
				}
				
			}
		}
	}

}
                                                                                                 
                                                
