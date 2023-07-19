package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleMapWindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame("app");	
		driver.findElement(By.xpath("//a[@class='tX9u1b']/span[text()='Maps']")).click();
		driver.switchTo().activeElement().sendKeys("Kolhapur",Keys.ENTER);
		driver.quit();
		
		
		
	}

}
