package handlingMultipleDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	
			public static void main(String[] args) {
		
			System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/DuplicateMultiSelectedDropDown.html");
		   
		   WebElement dropDown = driver.findElement(By.id("menu"));
		   
		   Select sel = new Select(dropDown);
		   
		   for (int i=0;i<9;i++)
		   {
			   sel.selectByIndex(i);
		   }
		   
		   List<WebElement> allops = sel.getAllSelectedOptions();
		  
		  
		 for(WebElement op :allops)
		 {
			 System.out.println(op.getText());
		 }
	}

}
