package handlingMultipleDropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/SingleselectDropdown.html");
		
		    WebElement dropdown = driver.findElement(By.id("menu"));
		    
		 Select sel = new  Select(dropdown);
		 Thread.sleep(1000);
		 sel.selectByIndex(2);
		 Thread.sleep(1000);
		 sel.deselectByIndex(2);
		 Thread.sleep(1000);
		 driver.quit();
		   
		   

	}

}
