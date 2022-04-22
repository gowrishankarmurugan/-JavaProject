package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtbl {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowri\\eclipse-workspace\\JavaProject\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement fE = driver.findElement(By.tagName("table"));
		List<WebElement> tr = fE.findElements(By.tagName("tr"));
		for (int i = 0; i < tr.size(); i++) {
			WebElement rows = tr.get(i);
			List<WebElement> tdata = rows.findElements(By.tagName("td"));
			for (int j = 0; j < tdata.size(); j++) {
				WebElement data = tdata.get(j);
				Thread.sleep(5000);
				String text = data.getText();
				System.out.println(text);
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
