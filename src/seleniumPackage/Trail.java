package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trail {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\gowri\\eclipse-workspace\\JavaProject\\drivers\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
WebElement findElement = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
findElement.sendKeys("surya");
WebElement findElement2 = driver.findElement(By.xpath("//input[@type='password']"));
findElement2.sendKeys("123456");
WebElement findElement3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
findElement3.click();

	}

}
