package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotificationClass extends BaseClass{

	
	public NotificationClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[contains(@class,'MuiBadge-root css')])[1]")
	private WebElement notificationBellIcon;
	@FindBy(xpath="//div[text()='Notifications']")
	private WebElement NotificationPopup;
	
	
	
	public void validateNotificationPresentOrNot() {
		notificationBellIcon.click();
		WebElement webdriverWait = webdriverWait("//div[text()='Notifications']");
		if (webdriverWait.isDisplayed()) {
			System.out.println("Notification is present");
		}

	}
}
