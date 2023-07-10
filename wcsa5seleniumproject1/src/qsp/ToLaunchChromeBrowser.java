package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		

	}

}
