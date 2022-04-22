package seleniumPackage;

import java.util.List;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	 
      public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowri\\eclipse-workspace\\JavaProject\\drivers\\chromedriver.exe");	
      WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();  	   
	  String url = ("https://www.facebook.com/");
	  driver.get(url);
	  WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
	  findElement.sendKeys("gowri Shankar");
	  
//	  WebElement findElement = driver.findElement(By.xpath("//select[@id=\"first\"]"));
//	  
//	  Select s = new Select(findElement);
////      s.selectByIndex(2); 
////	  s.selectByValue("Google");
//	  s.selectByValue("Yahoo");
//	  
//	  List<WebElement> options = s.getOptions();
////      System.out.println(options);
//      for (int i = 0; i < options.size(); i++) {
//    	  WebElement webElement = options.get(i);
//    	  String text = webElement.getText();
//    	  System.out.println(text);
  
//      WebElement findElement = driver.findElement(By.xpath("//select[@id=\"second\"]"));
//      
//      Select s = new Select(findElement);
//      s.selectByIndex(0);
//      s.selectByIndex(1);
//      s.selectByIndex(2);
//      
//      List<WebElement> options = s.getOptions();
//      for (int i = 0; i < options.size(); i++){
//		WebElement webElement = options.get(i);
//    	  String text = webElement.getText();
//    	  System.out.println(text);
//    	  
//    	  WebElement firstSelectedOption = s.getFirstSelectedOption();
//    	  String text2 = firstSelectedOption.getText();
//    	  System.out.println(text2);
//    	  
    	  
	}
      
      
      
      
	}
        	   
        	   
        	   
        	   
        	   
        	   
        	   
        	   
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

