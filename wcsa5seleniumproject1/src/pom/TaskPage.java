package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	@FindBy(xpath="//*[@name='username']") private WebElement usnTB;
	@FindBy(xpath="//*[@name='pwd']") private WebElement pssTB;
	@FindBy(xpath="//*[contains(@class,'initial')]") private WebElement loginButton;
	@FindBy(xpath = "//a[@class='content tasks_selected selected']") private WebElement taskTb;
	@FindBy(xpath = "//a[text()='Projects & Customers']") private WebElement procus;
	@FindBy(xpath = "//input[@value='Create New Tasks']") private WebElement cnc;
	@FindBy(xpath = "//*[@name='name']") private WebElement custname;
	@FindBy(xpath = "//*[@name='createCustomerSubmit']") private WebElement submit;
//	@FindBy(linkText = "Logout")private WebElement LogoutButton;
	
	public TaskPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getTaskTb() {
		return taskTb;
	}

	public WebElement getProcus() {
		return procus;
	}

	public WebElement getCnc() {
		return cnc;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void validLoginMethod(String validUsername, String validPassword) throws InterruptedException
	{
		usnTB.sendKeys(validUsername);
		pssTB.sendKeys(validPassword);
		loginButton.click();
		Thread.sleep(2000);
		taskTb.click();
		procus.click();
		cnc.click();
		custname.sendKeys("ActiTime");
		submit.click();
		
	}
	
	
	


}
