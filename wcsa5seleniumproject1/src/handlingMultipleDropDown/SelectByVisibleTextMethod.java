package handlingMultipleDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleTextMethod {
	
	public static void main(String[] args) {
		
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/DynamicDropdown.html");
		   WebElement dropDown = driver.findElement(By.id("menu"));
		   
		   Select sel=new Select(dropDown);
		   
		   sel.selectByVisibleText("Zgod");
	}

}
