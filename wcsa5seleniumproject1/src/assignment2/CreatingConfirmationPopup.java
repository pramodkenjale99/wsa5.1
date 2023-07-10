package assignment2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingConfirmationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/Disabled%20Element.html");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("return confirm('Please Confirm')");
		
		 Robot robot = new Robot();
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 robot.keyRelease(KeyEvent.VK_TAB);
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 driver.findElement(By.id("i1")).sendKeys("admin");
		 Thread.sleep(2000);
		jse.executeScript("document.getElementById('i2').value='manager'");

	}

}
