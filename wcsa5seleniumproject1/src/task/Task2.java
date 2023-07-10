package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/Pramod/Desktop/Wcsa5/DuplicateMultiSelectedDropDown.html");
		WebElement DropDown = driver.findElement(By.xpath("//select[@id='menu']"));

		Select sel = new Select(DropDown);

		for (int i = 2; i < 9; i++) {
			sel.selectByIndex(i);
		}
		WebElement Ops = sel.getFirstSelectedOption();
		System.out.println("The First selected Option is : " + Ops.getText());

	}

}