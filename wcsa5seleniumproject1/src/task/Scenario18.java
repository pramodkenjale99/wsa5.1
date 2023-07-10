package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario18 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[text()='Gold Coins']")).click();
		Thread.sleep(2000);
		WebElement target2 = driver.findElement(By.xpath("//div[@class='browse-new-title']/ descendant :: span[text()='weight (Gram)']"));
		act.moveToElement(target2).perform();
		
		driver.findElement(By.xpath("//span[text()='2 Gram']")).click();
		driver.findElement(By.xpath("//a[@id='pid_9168']/ descendant :: img[@class='hc img-responsive center-block lazyloaded']")).click();
		driver.get("https://www.bluestone.com/gold+coins/2-gram-24-kt-lakshmi-gold-coin~9168.html?impEvent=browseclick&posEvent=10&sortbyEvent=mostpopular&tagEvent=");
	
		WebElement element = driver.findElement(By.xpath("//a[@id='9168']"));
		
		if (element.isDisplayed())
		{
			Thread.sleep(2000);
			System.out.println("Test Case Passed !!");
			driver.quit();
		}
	}

}
