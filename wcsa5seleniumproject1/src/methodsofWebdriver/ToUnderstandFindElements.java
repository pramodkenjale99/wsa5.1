package methodsofWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandFindElements {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("buggati");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		for(int i=1;i<list.size();i++) {
			
			String Buggati = list.get(i).getText();
			System.out.println(Buggati);
			Thread.sleep(1000);
			
		}
		
		
	}

}
