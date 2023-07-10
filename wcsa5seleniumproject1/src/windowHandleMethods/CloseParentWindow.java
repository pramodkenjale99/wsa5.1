package windowHandleMethods;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParentWindow {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		String parent = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String wh:allwindows)
		{
			if (!parent.equals(wh))
			{
				Thread.sleep(2000);
				driver.switchTo().window(wh).close();
			}
		}
		
		
		
		

}
}
