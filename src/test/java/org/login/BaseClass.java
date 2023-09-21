package org.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	static WebDriver driver;
	public  static void LaunchURl(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PriyaDivya\\eclipse-workspace\\KyroTest\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
      public static WebElement webdriverWait(String locator) {
    	  WebDriverWait wait = new WebDriverWait(driver, 10);
  		WebElement elemnet = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
  		return elemnet;
	}
}
