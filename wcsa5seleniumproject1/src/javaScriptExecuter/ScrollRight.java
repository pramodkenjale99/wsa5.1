package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("");
		
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,500)");
		jse.executeScript("window.scrollBy(0,500)");
		jse.executeScript("window.scrollBy(0,-500)");
		jse.executeScript("window.scrollBy(0,-500)");

	}

}
