package framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1GoogleMaps {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		WebElement Map = driver.findElement(By.xpath("//iframe[@cd_frame_id_='71f46043b2199be123e600547cf85a15']"));
		driver.switchTo().frame(Map);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='tX9u1b']/span[text()='Maps']")).click();
	}
}
