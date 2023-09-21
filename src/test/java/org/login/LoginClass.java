package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass extends BaseClass{

	
	public LoginClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='yours@example.com']")
	private WebElement username;
	@FindBy(xpath="//input[@placeholder='your password']")
	private WebElement password;
	
	@FindBy(xpath="(//span[text()='Sign In'])[2]")
	private WebElement signInBtn;
	
	
	public void LoginFunction(String user,String pass) {
		username.click();
		username.sendKeys(user);
		password.click();
		password.sendKeys(pass);
		signInBtn.click();

	}
}
