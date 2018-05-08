package com.iConnectTest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginPage extends PageBase {

	WebDriver driver;

	@FindBy(xpath = "//span[contains(@class,'LblLev2Txt')]//input[contains(@value,'SafeWord')]")
	private WebElement capgeminiEmployee;

	@FindBy(xpath = "//div[@class='logTxtSvrNam']")
	private WebElement LoginCopy;

	@FindBy(linkText = "Single Sign On")
	private WebElement loginPageHeading;

	@FindBy(xpath = "//input[@id='IDToken1']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='IDToken2']")
	private WebElement passwordToken;

	@FindBy(xpath = "//input[(@class='Btn1Def') and contains(@name,'Login.Submit')]")
	private WebElement Submit;

	public LoginPage(final WebDriver Driver) {
		super(Driver);
		PageFactory.initElements(Driver, this);

	}

	public void verifyLoginPage() {
		waitForVisiblityOfElement(capgeminiEmployee);
		if (capgeminiEmployee.isEnabled()) {
			capgeminiEmployee.click();
			waitForVisiblityOfElement(LoginCopy);
			Assert.assertTrue(LoginCopy.getText(), LoginCopy.isDisplayed());
		}
	}

	public void loginSubmit() throws InterruptedException {
		Thread.sleep(10000);
		verifyLoginPage();
		userName.sendKeys("nalele");
		Thread.sleep(15000);
		Submit.click();
	}
}