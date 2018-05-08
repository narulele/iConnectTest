package com.iConnectTest.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class HomePage extends PageBase {

	@FindBy(xpath = "//span[contains(@id,'ctl00_cphMainContent_lblWelcome')]")
	WebElement welcomeMsg;

	@FindBy(xpath = "//div[@id='TabbedPanels1']//li/table/tbody/tr[2]")
	private List<WebElement> applicationLinksText;

	@FindBy(xpath = "//div[@id='TabbedPanels1']//li")
	private List<WebElement> applicationLinks;

	@FindBy(xpath = "//div[contains(@class,'TabbedPanelsContentVisible')]//a[contains(@class,'applistField')]")
	// @FindBy(xpath =
	// "//div[contains(@class,'TabbedPanelsContentVisible')]//a[contains(@id,'ctl00_cphMainContent')]")
	private List<WebElement> visibleLink;

	public HomePage(final WebDriver Driver) {
		super(Driver);
		PageFactory.initElements(Driver, this);
	}

	public void verifyHomepage() {

		Assert.assertTrue("User is not on Homepage", welcomeMsg.getText().contentEquals("Welcome"));

	}

	public void ClickOnLinks() {
		for (int i = 0; i < applicationLinks.size(); i++) {
			applicationLinks.get(i).click();
			System.out.println("User Clicked on" + applicationLinksText.get(i).getText());
		}
	}

	public boolean verifyMenuOptionsIsClickable() {
		boolean enableFlag = false;
		for (int i = 0; i < applicationLinks.size(); i++) {
			if (Assert.applicationLinks.get(i).isEnabled())
				enableFlag = true;
			else
				enableFlag = true;
			System.out.println("User Clicked on" + applicationLinksText.get(i).getText());
		}
		return enableFlag;
	}

	public void getAllVisibleLinkText() {
		for (int i = 0; i < visibleLink.size(); i++) {
			if ((visibleLink.get(i).getText()) != null) {
				Assert.assertFalse("" + visibleLink.get(i).getText() + "Link is not clickable",
						visibleLink.get(i).isDisplayed());
				System.out.println("Link text is" + visibleLink.get(i).getText() + "");
			} else {
				Assert.assertFalse("Link" + visibleLink.get(i).getAttribute("title") + "",
						visibleLink.get(i).isEnabled());
			}
		}
	}
}