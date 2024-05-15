import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		String path = System.getProperty("user.dir") +File.separator + "Chromedriver" + File.separator
//				+ "chromedriver.exe";
//		System.out.println(path);
		System.out.println(System.getProperty("user.dir"));
		//System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver(options);
		driver.get("https://www.path2usa.com/travel-companions");
		
	}

}
