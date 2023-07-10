package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagnameMethod {

	public static void main(String[] args) {

		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.instagram.com/");
		 
		 String tag = driver.findElement(By.xpath("//input[@name='username']")).getTagName();
		 
	}

}
