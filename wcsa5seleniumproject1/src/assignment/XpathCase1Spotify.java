package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase1Spotify {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.spotify.com/en/login?continue=https");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='phone-login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='inputPhoneNumber']")).sendKeys(" 7083066320");
		
		
		driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 cJdEzG encore-bright-accent-set']")).click();
		
		

	}

}
