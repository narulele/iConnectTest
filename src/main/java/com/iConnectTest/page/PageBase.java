package com.iConnectTest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	WebDriver driver;
	WebDriverWait driverWait;

	public PageBase(WebDriver driver) {
		this.driver = driver;
		this.driverWait = new WebDriverWait(driver, 10);
	}

	public void waitForVisiblityOfElement(WebElement element) {
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForClickablityOfElement(WebElement element) {
		driverWait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
