package pom2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage {

	@FindBy(xpath = "//input[@value='Create New User']") private WebElement createusermodule;
	@FindBy(name = "username") private WebElement usnTB;
	@FindBy(name = "passwordText") private WebElement passTB;
	@FindBy(name = "passwordTextRetype") private WebElement retypepassTB;
	@FindBy(name = "firstName") private WebElement fnTB;
	@FindBy(name =  "lastName") private WebElement lnTB;
	@FindBy(xpath = "//*[@id='right9']") private WebElement enterTimeTrack;
	@FindBy(xpath = "//*[@id='right12']") private WebElement modifyTimeTrackofOtherUsers;
	@FindBy(xpath = "//*[@id='right2']") private WebElement ManageCustomersProjects;
	@FindBy(xpath = "//*[@id='right1']") private WebElement GenerateReports;
	@FindBy(xpath = "//*[@id='right5']") private WebElement ManageUsers;
	@FindBy(xpath = "//*[@id='right7']") private WebElement ManageBillingTypes;
	@FindBy(xpath = "//input[@type='submit']") private WebElement Submitbutt;
	@FindBy(xpath = "//input[@onclick=\"cancelForm(messageResource.getMessage('user.add.cancel_button_confirm'), '/administration/userlist.do')\"]") private WebElement cancelbutt;
	public WebElement getCreateusermodule() {
		return createusermodule;
	}
	public WebElement getUsnTB() {
		return usnTB;
	}
	public WebElement getPassTB() {
		return passTB;
	}
	public WebElement getRetypepassTB() {
		return retypepassTB;
	}
	public WebElement getFnTB() {
		return fnTB;
	}
	public WebElement getLnTB() {
		return lnTB;
	}
	public WebElement getEnterTimeTrack() {
		return enterTimeTrack;
	}
	public WebElement getModifyTimeTrackofOtherUsers() {
		return modifyTimeTrackofOtherUsers;
	}
	public WebElement getManageCustomersProjects() {
		return ManageCustomersProjects;
	}
	public WebElement getGenerateReports() {
		return GenerateReports;
	}
	public WebElement getManageUsers() {
		return ManageUsers;
	}
	public WebElement getManageBillingTypes() {
		return ManageBillingTypes;
	}
	public WebElement getSubmitbutt() {
		return Submitbutt;
	}
	public WebElement getCancelbutt() {
		return cancelbutt;
	}
	
	
}
