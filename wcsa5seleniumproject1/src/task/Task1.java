package task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/DynamicDropdown.html");
		
		WebElement DropDown = driver.findElement(By.xpath("//select[@id='menu']"));
		
		Select sel=new Select(DropDown);
		
		List<WebElement> elements = sel.getOptions();
		
		for(int i=0;i<9;i++)
		{
			 System.out.println(elements.get(i).getText());
		}
	}
			
		
	

}
