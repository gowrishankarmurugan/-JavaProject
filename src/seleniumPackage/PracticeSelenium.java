
package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowri\\eclipse-workspace\\JavaProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = ("https://chercher.tech/practice/frames-example-selenium-webdriver?msclkid=ea95fb2aba4e11ecb1afe0e34de61bd5");
		driver.get(url);
////		String currentUrl = driver.getCurrentUrl();
////		System.out.println(currentUrl);
////		String title = driver.getTitle();
////		System.out.println(title);
//		WebElement user = driver.findElement(By.id("email"));
//		WebElement pass = driver.findElement(By.id("pass"));
//		WebElement login = driver.findElement(By.xpath("//button[@value = '1']"));
//		
//		
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute('value','gowrii')", user);
//		js.executeScript("arguments[0].setAttribute('value','123654789')", pass);
//		
//		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')",user);
//		System.out.println(executeScript);
//		WebElement down = driver.findElement(By.linkText("Careers"));
////		Thread.sleep(5000);
//		js.executeScript("arguments[0].scrollIntoView(true)", down);
//		Thread.sleep(5000);
//		js.executeScript("arguments[0].scrollIntoView(false)",user);
//		js.executeScript("arguments[0].click()", login);
		driver.switchTo().frame("frame1");
		WebElement findElement = driver.findElement(By.xpath("//b[text()='Topic :']/following-sibling::input"));
		findElement.sendKeys("gowriii");
//		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame3");
		WebElement findElement2 = driver.findElement(By.xpath("//input[@id=\"a\"]"));
		findElement2.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement findElement4 = driver.findElement(By.xpath("//select[@id=\"animals\"]"));
		
        Select s = new Select(findElement4);
		s.selectByIndex(2);
		
		
		
		
		
		
	
}
}
