package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickChatboxByChildFrame {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
		 WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		 
		 driver.switchTo().frame(frameElement);

		  WebElement chatbox = driver.findElement(By.id("chat-icon"));
		  chatbox.click();
		  
		 
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));  
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("chat-icon")));
		  
		  driver.switchTo().defaultContent();
		  Thread.sleep(2000);
		  driver.findElement(By.id("chat-fc-name")).sendKeys("Swapnil");
		  driver.findElement(By.id("chat-fc-email")).sendKeys("Swapx08@gmail.com");
		  driver.findElement(By.id("chat-fc-phone")).sendKeys("8530250383");

	}

}
