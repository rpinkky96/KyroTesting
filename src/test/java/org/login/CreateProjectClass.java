package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateProjectClass extends BaseClass {
	
	
	public CreateProjectClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createProjectBtn;
	@FindBy(xpath="//h3[text()='Create Project']")
	private WebElement createProjectPopup;
	@FindBy(xpath ="//span[text()='Mark as Public']//preceding-sibling::span//child::input")
	private WebElement markAsPublicCheckBox;
	@FindBy(xpath ="//span[text()='Mark as Non Billable']//preceding-sibling::span//child::input")
	private WebElement markAsNonBillableCheckBox;
	@FindBy(xpath ="//span[text()='Enable Tasks']//preceding-sibling::span//child::input")
	private WebElement enableTaskCheckBox;
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextBtn;
	@FindBy(xpath="//label[text()='Project Name']//following-sibling::div//input")
	private WebElement projectNameTxtBox;
	@FindBy(xpath="//label[text()='Project Manager']//parent::div//child::div//child::input")
	private WebElement projectManagerTextBox;
	@FindBy(xpath="//label[text()='Billing Code']//parent::div//child::div//child::input")
	private WebElement billingCodeTextBox;
	@FindBy (xpath="//label[text()='Description']//following-sibling::div//textarea")
	private WebElement DescriptiontextBox;
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitBtn;
	
	
	public void CreateProjectMarkAsPublic(String projectName,String projectManagerName) {
		createProjectBtn.click();
		WebElement createProjectPopup = webdriverWait("//h3[text()='Create Project']");
		if (createProjectPopup.isDisplayed()) {
			markAsPublicCheckBox.click();
			nextBtn.click();
			projectNameTxtBox.click();
			projectNameTxtBox.sendKeys(projectName);
			projectManagerTextBox.click();
			projectManagerTextBox.clear();
			projectManagerTextBox.sendKeys(projectManagerName+Keys.TAB);
			billingCodeTextBox.click();
			billingCodeTextBox.sendKeys("78678687");
			DescriptiontextBox.sendKeys("test analyze");
			submitBtn.click();
			
		}
		else {
			System.out.println("Create project pop up not displayed");
		}

	}
	public void CreateProjectMarkAsNonBillable(String projectName,String projectManagerName) {
		createProjectBtn.click();
		WebElement createProjectPopup = webdriverWait("//h3[text()='Create Project']");
		if (createProjectPopup.isDisplayed()) {
			markAsNonBillableCheckBox.click();
			nextBtn.click();
			projectNameTxtBox.click();
			projectNameTxtBox.sendKeys(projectName);
			projectManagerTextBox.click();
			projectManagerTextBox.clear();
			projectManagerTextBox.sendKeys(projectManagerName);
			billingCodeTextBox.click();
			billingCodeTextBox.sendKeys("78678687");
			DescriptiontextBox.sendKeys("test analyze");
			submitBtn.click();
			
		}
		else {
			System.out.println("Create project pop up not displayed");
		}

	}
	
	public void CreateProjectEnableTask(String projectName,String projectManagerName) {
		createProjectBtn.click();
		WebElement createProjectPopup = webdriverWait("//h3[text()='Create Project']");
		if (createProjectPopup.isDisplayed()) {
			enableTaskCheckBox.click();
			nextBtn.click();
			projectNameTxtBox.click();
			projectNameTxtBox.sendKeys(projectName);
			projectManagerTextBox.click();
			projectManagerTextBox.clear();
			projectManagerTextBox.sendKeys(projectManagerName);
			billingCodeTextBox.click();
			billingCodeTextBox.sendKeys("78678687");
			DescriptiontextBox.sendKeys("test analyze");
			submitBtn.click();
			
		}
		else {
			System.out.println("Create project pop up not displayed");
		}

	}
	public void CreateProjectByAllCheckboxes(String projectName,String projectManagerName) {
		createProjectBtn.click();
		WebElement createProjectPopup = webdriverWait("//h3[text()='Create Project']");
		if (createProjectPopup.isDisplayed()) {
			markAsPublicCheckBox.click();
			markAsNonBillableCheckBox.click();
			enableTaskCheckBox.click();
			nextBtn.click();
			projectNameTxtBox.click();
			projectNameTxtBox.sendKeys(projectName);
			projectManagerTextBox.click();
			projectManagerTextBox.clear();
			projectManagerTextBox.sendKeys(projectManagerName);
			billingCodeTextBox.click();
			billingCodeTextBox.sendKeys("78678687");
			DescriptiontextBox.sendKeys("test analyze");
			submitBtn.click();
			
		}
		else {
			System.out.println("Create project pop up not displayed");
		}

	}
	

}
