package handlingMultipleDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/DynamicDropdowncar.html");
		   WebElement dropDown = driver.findElement(By.id("menu"));
		   
		   Select sel=new Select(dropDown);
		   
		   for(int i = 0 ; i<7 ; i++ ) {
			   sel.selectByIndex(i);
			   Thread.sleep(1000);
			   
		   }
		   Thread.sleep(1000);
		   for(int i= 0 ; i<7 ; i++) {
			   
			   sel.deselectByIndex(i);
			   Thread.sleep(1000);
		   }
		   

	}

}
