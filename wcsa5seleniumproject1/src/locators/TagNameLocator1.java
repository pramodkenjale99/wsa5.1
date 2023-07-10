package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator1 {
	
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//option 1
		driver.findElement(By.name("pass")).sendKeys("12345");
		//option 2
		WebElement usn=driver.findElement(By.name("pass"));
		usn.sendKeys("12345");
	}

}
