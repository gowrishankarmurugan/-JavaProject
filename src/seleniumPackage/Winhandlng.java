package seleniumPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winhandlng {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowri\\eclipse-workspace\\JavaProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement fe = driver.findElement(By.xpath("//input[@type='text']"));
		fe.sendKeys("iphone 11",Keys.ENTER);
		
	    driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base a-text-normal')])[1]")).click();
	    String cwin = driver.getWindowHandle();
	    Set<String> pwin = driver.getWindowHandles();
	    for (String s : pwin) {
			if (!cwin.equals(s)) {
				driver.switchTo().window(s);
			}
		}
	    
		WebElement findElement = driver.findElement(By.id("add-to-cart-button"));
		findElement.click();
		
		
		
		
		
		
		
		
	}

}
