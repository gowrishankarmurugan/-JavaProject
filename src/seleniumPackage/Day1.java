package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gowri\\eclipse-workspace\\JavaProject\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		String tle = driver.getTitle();
		System.out.println(tle);
		String printurl = driver.getCurrentUrl();
		System.out.println(printurl);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
