package assignment;
import java.util.*;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatebyTreeSet {

	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/DuplicateMultiSelectedDropDown.html");
		
		WebElement DropDown = driver.findElement(By.id("menu"));
		
		Select Sel=new Select(DropDown);
		
		   TreeSet<String> obj = new TreeSet<String>();
		   
		  List<WebElement> list = Sel.getOptions();
		  
		  
		   for (int i = 0; i < list.size(); i++) {
			   
			   WebElement ops = list.get(i);
			    String text = ops.getText();
			    obj.add(text);
		}
		   
		   for( String set: obj) {
			   
			   System.out.println(set);
		   }

	}

}
