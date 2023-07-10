package handlingMultipleDropDown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates {
	
	public static void main(String[] args) {
		
	System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/DuplicateMultiSelectedDropDown.html");
		
		WebElement DropDown = driver.findElement(By.id("menu"));
		
		Select Sel=new Select(DropDown);
		
		 HashSet <String>obj=new HashSet<String>();
		 
		 List<WebElement> ops = Sel.getOptions();
		 
		for (int i = 0; i < ops.size(); i++) {
			
			   WebElement op = ops.get(i);
			     String text = op.getText();
			     obj.add(text);
		}
		
		
		    for(  String element : obj) {
		    	System.out.println(element);
		    }
		    	
		 
	}

}
