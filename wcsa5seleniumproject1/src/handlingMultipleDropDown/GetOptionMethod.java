package handlingMultipleDropDown;

import java.util.Iterator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/DynamicDropdowncar.html");
		
	    WebElement multiSelectDD = driver.findElement(By.id("menu"));
	    
	     Select sel = new Select(multiSelectDD);
	      
	      List<WebElement> getOP = sel.getOptions();
	      
	      Iterator var = getOP.iterator();
	    
	     for(int i = 0 ; i<getOP.size() ; i++) {
	    	  
	      String OP = getOP.get(i).getText();
	      System.out.println(OP);
    	  Thread.sleep(1000);
	      
	     }
	}

}
