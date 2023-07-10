package task;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethod2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
	
		WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
	
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(// span[text()='1 gram'])[1]")).click();
		
	    boolean coin = driver.findElement(By.xpath("//div[@class='mousetrap']")).isDisplayed();
		if (coin==true) {
			System.out.println("1 gram coin is displayed : "+coin);
			Thread.sleep(1000);
			driver.quit();
		}
		
	 
		
		
	}
}
