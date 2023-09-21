package org.login;

import java.awt.AWTException;

import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

public class ExecutionClass extends BaseClass{

	
	@Test(priority=1)
	public void method1() throws InterruptedException {
		LaunchURl("https://stage.kyro.ai/.");
		Thread.sleep(5000);
		LoginClass loginClass = new LoginClass();
	    LogoutClass logout= new LogoutClass();
		loginClass.LoginFunction("rpinkky96@gmail.com", "Pinkky@1810");
		Thread.sleep(10000);
		CreateProjectClass createProjectClass = new CreateProjectClass();
		createProjectClass.CreateProjectMarkAsPublic("Testing987", "Priya");
	    logout.logoutFuction();
	}
	
	@Test(priority=2)
	public void method2() throws InterruptedException, AWTException {
		LaunchURl("https://stage.kyro.ai/.");
		Thread.sleep(5000);
		LoginClass loginClass = new LoginClass();
		LogoutClass logout= new LogoutClass();
		loginClass.LoginFunction("rpinkky96@gmail.com", "Pinkky@1810");
		Thread.sleep(5000);
		InviteUserClass inviteUserClass = new InviteUserClass(); 
		 inviteUserClass.InviteFunction("Priya", "R");
		 logout.logoutFuction();
	}
	@Test(priority=3)
	public void validateNotificationInProjectManagerCredential() throws InterruptedException {
		LaunchURl("https://stage.kyro.ai/.");
		Thread.sleep(5000);
		LoginClass loginClass = new LoginClass();
	    LogoutClass logout= new LogoutClass();
	    NotificationClass notificationClass= new NotificationClass();
		loginClass.LoginFunction("priya96moorthy@gmail.com", "Pinkky@1810");
		Thread.sleep(10000);
		notificationClass.validateNotificationPresentOrNot();
	}
}
