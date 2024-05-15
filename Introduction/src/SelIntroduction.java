import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\\\drivers\\\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\drivers\\\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		}

}


