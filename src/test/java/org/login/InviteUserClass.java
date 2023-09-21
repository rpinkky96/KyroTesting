package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InviteUserClass extends BaseClass{

	public InviteUserClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Organization']")
	private WebElement organizationmainMenu;
	@FindBy(xpath="//div[text()='Users']")
	private WebElement usersSubMenu;
	@FindBy(xpath="//button[text()='Invite User']")
	private WebElement inviteUserBtn;
	@FindBy(xpath="//h3[text()='Invite User']")
	private WebElement inviteUserPopup;
	@FindBy(name="firstName")
	private WebElement firstName;
	@FindBy(name="lastName")
	private WebElement lastName;
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//div[@aria-haspopup='listbox']")
	private WebElement roleDropDown;
	@FindBy(xpath="//li[text()='Project Manager']")
	private WebElement projectManager;
	@FindBy(xpath="//button[text()='Send Invite']")
	private WebElement sendInviteBtn;
	
	public void InviteFunction(String Name,String LastN) throws AWTException, InterruptedException {
		organizationmainMenu.click();
		usersSubMenu.click();
		Thread.sleep(5000);
		inviteUserBtn.click();
		firstName.click();
		firstName.sendKeys(Name+Keys.TAB);
		lastName.click();
		lastName.sendKeys(LastN);
		email.sendKeys("test123@gmail.com");
		roleDropDown.click();
		projectManager.click();
		sendInviteBtn.click();
		
		}
		
	
}
