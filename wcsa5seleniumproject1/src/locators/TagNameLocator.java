package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/Username.html");
		//option 1
		driver.findElement(By.tagName("input")).sendKeys("Zgod");
		//option 2
		WebElement usn=driver.findElement(By.tagName("input"));
		usn.sendKeys("zgod");

	}

}
