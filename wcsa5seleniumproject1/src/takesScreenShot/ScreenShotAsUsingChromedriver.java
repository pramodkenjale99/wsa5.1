package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotAsUsingChromedriver {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://open.spotify.com/");
		TakesScreenshot tsc=(TakesScreenshot)driver;
		
		File src = tsc.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./ScreenShots/Spotify1.png");
		
		Files.copy(src, dest);
		 
		 

	}

}
