package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//div[text()='Time-Track']//following-sibling:: img") private WebElement timetrackmodule;
	@FindBy(xpath = "//div[text()='Tasks']//following-sibling:: img") private WebElement taskmodule;
	@FindBy(xpath = "//div[text()='Reports']//following-sibling:: img") private WebElement reportsmodule;
	@FindBy(xpath = "//div[text()='Users']/ancestor::a[@class='content users_selected selected']") private WebElement usersmodule;
	@FindBy(xpath = "//div[text()='Work Schedule']//following-sibling:: img") private WebElement workschedulemodule;
	@FindBy(xpath = "//div[text()='Settings']//following-sibling:: img") private WebElement settingsmodule;
	@FindBy(xpath = "//a[text()='Logout']") private WebElement logoutlink;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getTimetrackmodule() {
		return timetrackmodule;
	}

	public WebElement getTaskmodule() {
		return taskmodule;
	}

	public WebElement getReportsmodule() {
		return reportsmodule;
	}

	public WebElement getUsersmodule() {
		return usersmodule;
	}

	public WebElement getWorkschedulemodule() {
		return workschedulemodule;
	}

	public WebElement getSettingsmodule() {
		return settingsmodule;
	}
	
	public WebElement getlogoutlink() {
		return logoutlink;
	}
	
	public void clickOntimetrackmodule() {
		timetrackmodule.click();
	}
	
	public void clickOntaskmodule() {
		taskmodule.click();
	}
	
	public void clickOnreportsmodule() {
		reportsmodule.click();
	}
	
	public void clickOnusersmodule() {
		usersmodule.click();
	}
	
	public void clickOnworkschedulemodule() {
		workschedulemodule.click();
	}
	
	public void clickOnsettingskmodule() {
		settingsmodule.click();
	}
	
	public void clickOnlogoutlink() {
		logoutlink.click();
	}
	
	
}
