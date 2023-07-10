package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethods {
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement element = driver.findElement(By.xpath("//a[text()='Coins ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		driver.findElement(By.xpath("(//span[text()='1 gram'])[1]")).click();
		WebElement gold = driver.findElement(By.xpath("//div[@class='mousetrap']"));
		boolean target = gold.isDisplayed();
		
		if (target)
		{
			System.out.println("Test Case Passed !!!");
			driver.close();
		}
		else {
			System.out.println("Exception occured !!");
		}
		
	}

}


