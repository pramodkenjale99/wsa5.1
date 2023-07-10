package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation2 {

	public static void main(String[] args) {
		 System.setProperty("driver.chrome.driver", "./drivers/chromedriver.exe");
		 
		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   
		   driver.get("https://www.selenium.dev/");
		   
		 Point loc = driver.findElement(By.xpath("//h2[@class='selenium']")).getLocation();
		  
		  int xaxis= loc.getX();
		  int yaxis = loc.getY();
		  
		  System.out.println("xaxis is : "+xaxis +" , yaxis is : "+yaxis);

	}

}
