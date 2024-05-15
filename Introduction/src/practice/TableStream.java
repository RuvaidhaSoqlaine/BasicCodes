package practice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Sorting
		
		WebDriver driver= new ChromeDriver();
		//enter into url
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click the first coloumn
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Get text of the coloumn
		List<WebElement> elementlist=driver.findElements(By.xpath("//tr/td[1]"));
		
		//Capture text of all element into original list
		List<String> originallist=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
	
		//sort the original list
		List<String>sortedlist=originallist.stream().sorted().collect(Collectors.toList());
		
		//compare original list to sorted list
		Assert.assertTrue(originallist.equals(sortedlist));
	
		
		//scan the name coloumn with gettext  ->Rice ->print the price of the rice
		List<String> priceofbeans= elementlist.stream().filter(s->s.getText().contains("Beans")).
		map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		priceofbeans.forEach(a->System.out.println(a));
		
		//for particular product to take we use filter
		
		List<String> priceofrice;
		
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			 priceofrice= rows.stream().filter(s->s.getText().contains("Rice")).
					map(s->getPriceVeggie(s)).collect(Collectors.toList());
			
			priceofrice.forEach(a->System.out.println(a));

			if(priceofrice.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while(priceofrice.size()<1);
				
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
