import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class Property {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver driverlaunch() {
	prop = new Properties();
	
	String browserName = prop.getProperty("browser");
	System.out.println(browserName);
	return null;
	}
	
}