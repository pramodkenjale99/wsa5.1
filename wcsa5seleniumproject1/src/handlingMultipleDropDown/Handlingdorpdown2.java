package handlingMultipleDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdorpdown2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/DynamicDropdowncar.html");
		
	    WebElement multiSelectDD = driver.findElement(By.id("menu"));
	    
	     Select sel = new Select(multiSelectDD);
	      
	      List<WebElement> getOP = sel.getOptions();
	      
	      			

	}

}
