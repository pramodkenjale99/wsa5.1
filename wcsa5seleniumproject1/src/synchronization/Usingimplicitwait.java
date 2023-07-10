package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingimplicitwait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.instagram.com/");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("the_deverakonda__99");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Airtel@9120");

		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();

	}
}
