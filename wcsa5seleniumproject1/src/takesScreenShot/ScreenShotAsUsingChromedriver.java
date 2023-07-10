package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotAsUsingChromedriver {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		
	    ChromeDriver cdriver = new ChromeDriver();
	    
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cdriver.get("https://twitter.com/i/flow/login");
		
		 File src = cdriver.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./ScreenShots/Twitter.png");
		 
		 Files.copy(src, dest);
		 Thread.sleep(5000);
		 
		 

	}

}
