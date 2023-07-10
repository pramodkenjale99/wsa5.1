package takesScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ScreenShotAsUsingEventFiringWebDriver {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://open.spotify.com/");
		driver.manage().window().maximize();
		EventFiringWebDriver evdriver = new EventFiringWebDriver(driver);
		
		
		
		 File src = evdriver.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./ScreenShots/Spotify.png");
		 Thread.sleep(3000);
		 Files.copy(src, dest);
		 
		Thread.sleep(5000);
		
		
		

	}

}
