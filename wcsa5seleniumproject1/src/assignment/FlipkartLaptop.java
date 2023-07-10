package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptop {
	
	public static void main(String[] args) throws InterruptedException {
		
	  WebDriver	driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("HP Victus Core i5 11th Gen");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[contains(text(),'HP Victus Core i5 11th Gen ..')]")).click();
	  
		
	}
 
}
