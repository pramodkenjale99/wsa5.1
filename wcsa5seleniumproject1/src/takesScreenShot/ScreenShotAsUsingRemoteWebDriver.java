package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotAsUsingRemoteWebDriver {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");

		RemoteWebDriver chdriver = new ChromeDriver();
		chdriver.manage().window().maximize();
		chdriver.get("https://www.selenium.dev/");
		File src = chdriver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShots/Selenium.png");
		Files.copy(src, dest);
		Thread.sleep(5000);

	}

}
