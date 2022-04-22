package seleniumPackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Trail1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowri\\eclipse-workspace\\JavaProject\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		findElement.sendKeys("surya");

		Actions ac = new Actions(driver);
		ac.doubleClick(findElement).perform();
		ac.contextClick(findElement).perform();
		
	}	

}
