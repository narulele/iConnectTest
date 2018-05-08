package com.iConnectTest.stepDefinations;

import org.openqa.selenium.WebDriver;

import com.iConnectTest.page.HomePage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepDef {

	HomePage homePage;
	WebDriver driver;

	private Context context;

	public HomePageStepDef(Context context) {
		this.context = context;
	}

	@When("^User Click on Menu Option$")
	public void User_Click_on_Menu_Option() {
		driver = context.getDriver();
		homePage = new HomePage(driver);
		homePage.ClickOnLinks();
	}

	@Then("^Verify all links from the Delivery menu option")
	public void Verify_all_links_from_the_Delivery_menu_option() {
		homePage.getAllVisibleLinkText();
	}

	@When("^User able to see the all Menu options$")
	public void user_able_to_see_the_all_Menu_options() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^Verify label of all menu options$")
	public void verify_label_of_all_menu_options() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}