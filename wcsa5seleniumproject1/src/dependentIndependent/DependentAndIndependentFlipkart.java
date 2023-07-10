package dependentIndependent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentAndIndependentFlipkart {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("HP laptops");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='Brand']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='HP']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[contains(text(),'HP Omen Core i5 7th ')]/../..//div[text()='₹87,490']")).click();
		  
		
	}

}
