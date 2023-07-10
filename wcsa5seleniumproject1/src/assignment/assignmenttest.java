package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmenttest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	       WebDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.get("https://accounts.spotify.com/en/login?continue=https");
	       	
	       driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("swapnil");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("swapnil789");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	}

}
