package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void f() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("java", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}
}
