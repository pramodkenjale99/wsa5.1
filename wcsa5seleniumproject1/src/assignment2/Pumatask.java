package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pumatask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://in.puma.com/in/en/mens/mens-shoes?utm_source=GGL-SEA&utm_medium=PS&utm_aud=OTH&utm_obj=OLC&utm_campaign=PS_GGL_IN_PS_GGL_SEA_TXT_Brand_Category_FTW_agency_1000067495857508873&gclid=CjwKCAjwv8qkBhAnEiwAkY-ahtth2PHdDmdp-HAKpe41ffO-nDyOieqDcoT_kCqYYavv58nUJloYaxoC8pEQAvD_BwE");
		 Point loc = driver.findElement(By.xpath("//span[text()='Dark Denim-Palace Blue-PUMA White']")).getLocation();
		  
		  int xaxis= loc.getX();
		  int yaxis = loc.getY();
		  
		  System.out.println("xaxis is : "+xaxis +" , yaxis is : "+yaxis);
		  
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
		   jse.executeScript("window.ScrollBy(447,2034");

	}

}
