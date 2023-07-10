package windowHandleMethods;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1Amazon {
	static WebDriver op;
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("boat airdopes 413 anc");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("(//span[text()='boAt Airdopes 413ANC True Wireless in Ear Earbuds with Active Noise Cancellation, 2 Mics ENx Tech, Signature Sound, Touch Gesture, 20 Hours Playback, ASAP Charge & Ambient Mode(Verve Purple)'])[1]")).click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		
		for (String wh:child)
		{
			if (!parent.equals(child))
			{
				op = driver.switchTo().window(wh);
			}
		}
		op.findElement(By.xpath("//div[@id='contextualIngressPtLabel_deliveryShortLine']")).click();
		op.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']")).sendKeys("411033");
		WebElement element = op.findElement(By.xpath("//span[@id='GLUXZipUpdate-announce']"));
		JavascriptExecutor jse = (JavascriptExecutor)op;
		
		}
}
