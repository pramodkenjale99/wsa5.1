package handlingMultipleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/DynamicDropdowncar.html");
		
	    WebElement multiSelectDD = driver.findElement(By.id("menu"));
	    
	     Select sel = new Select(multiSelectDD);
	     Thread.sleep(1000);
	     
	     // isMultiple Method
	       boolean res = sel.isMultiple();
	       System.out.println(res);
	       
	       
	       driver.close();

	}
	

}
