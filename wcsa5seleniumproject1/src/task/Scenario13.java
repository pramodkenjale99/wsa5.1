package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario13 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement source = driver.findElement(By.xpath("//span[text()='Offers ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(source).perform();
		driver.findElement(By.xpath("//span[text()='Up To 20% Off Making Charges']")).click();
		WebElement target = driver.findElement(By.xpath("//div[@id='mainContent']/ descendant :: img[@alt='The Aponi Watch Charm']"));
		
		if (target.isDisplayed())
		{
			Thread.sleep(2000);
			System.out.println("Test Case Passed !!!");
			driver.close();
		}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}
}
