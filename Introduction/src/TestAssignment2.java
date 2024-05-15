import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption3")).click();
		
		String option= (driver.findElement(By.xpath("//label[@for='honda']")).getText());
		
		System.out.println(option);
		
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select opt= new Select(dropdown);
		opt.selectByVisibleText(option);
		
		
		driver.findElement(By.id("name")).sendKeys(option);
		
		
		driver.findElement(By.id("alertbtn")).click();
		
		String text=  driver.switchTo().alert().getText();

	     if(text.contains(option))

	     {

	    System.out.println("Alert message success");

	     }

	     else

	    System.out.println("Something wrong with execution");
		
		
//		String text1="Hello"+option+", share this practice page and share your knowledge";
//		Assert.assertEquals(text, text1);

	}

}
