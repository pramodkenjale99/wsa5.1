package task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario18 {
		static WebDriver Op;
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
		WebElement target2 = driver.findElement(By.xpath("//span[text()='weight (Gram)']"));
		act.moveToElement(target2).perform();
		
		driver.findElement(By.xpath("//span[text()='2 Gram']")).click();
		driver.findElement(By.xpath("//a[@id='pid_9168']/ descendant :: img[@class='hc img-responsive center-block lazyloaded']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> pcWindow = driver.getWindowHandles();
		for (String wh:pcWindow)
		{
		if (!parentWindow.equals(wh))
		{
			Op=driver.switchTo().window(wh);
			
		}
		}
		WebElement element = Op.findElement(By.xpath("//a[@id='9168']"));
		
		if (element.isDisplayed())
		{
			Thread.sleep(2000);
			System.out.println("Test Case Passed !!");
			driver.quit();
		}
	}

}
