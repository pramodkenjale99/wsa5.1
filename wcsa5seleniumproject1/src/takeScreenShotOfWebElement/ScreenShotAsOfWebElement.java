package takeScreenShotOfWebElement;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShotAsOfWebElement {
      public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		Actions act = new Actions(driver);
		 WebElement element = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		
		 act.moveToElement(element).perform();
		 
		 driver.findElement(By.xpath("//a[text()='Band']")).click();
		 
		 Thread.sleep(2000);
		 WebElement target = driver.findElement(By.xpath("//div[text()='Filter by']"));
	
		for (int i = 0; i < 2; i++) {
			 act.doubleClick(target).perform();
			 act.clickAndHold(target).perform();
			 
		}
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(2000);
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		if (driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed()) {
			Thread.sleep(2000);
			System.out.println("Done!!!");
			driver.quit();
			
		} else {
			System.out.println("Exception");

		}
		
		
		
		
		
	}

}
