package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutClass extends BaseClass{

	public LogoutClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[contains(@class,'MuiBadge-root css')])[2]")
	private WebElement logouticon;
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement logoutBtn;
	
	
	
	public void logoutFuction() throws InterruptedException {
		logouticon.click();
		Thread.sleep(2000);
		logoutBtn.click();
		Thread.sleep(2000);

	}
}
