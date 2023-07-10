package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src1 =driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement src2 =driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement src3 =driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement src4 =driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		//--------------------------------------------------------------------
		WebElement Tar1 =driver.findElement(By.xpath("//li[@class='placeholder']/ ancestor :: ol[@id='loan']"));
		WebElement Tar2 =driver.findElement(By.xpath("//li[@class='placeholder']/ ancestor :: ol[@id='amt8']"));
		WebElement Tar3 =driver.findElement(By.xpath("//li[@class='placeholder']/ ancestor :: ol[@id='amt7']"));
		WebElement Tar4 =driver.findElement(By.xpath("//li[@class='placeholder']/ ancestor :: ol[@id='bank']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src2, Tar1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src3, Tar2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src1, Tar4).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src4, Tar3).perform();
		
		WebElement display = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		
		if (display.isDisplayed())
		{
			System.out.println("Test Case Passed !!");
			driver.close();
		}
		
		
	}

}
