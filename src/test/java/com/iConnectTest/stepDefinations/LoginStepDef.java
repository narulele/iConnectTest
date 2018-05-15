package com.iConnectTest.stepDefinations;

import org.openqa.selenium.WebDriver;

import com.iConnectTest.page.HomePage;
import com.iConnectTest.page.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	WebDriver driver;
	LoginPage loginpage;
	HomePage homePage;

	private Context context;

	public LoginStepDef(Context context) {
		this.context = context;
	}
	/*
	 * public LoginStepDef(final LoginPage commanloginPage, final LoginStepDef
	 * commanLoginstepdef) { this.loginpage = commanloginPage;
	 * 
	 * }
	 */

	@Given("^Navigate to iConnect page$")
	public void navigate_to_iConnect_page() throws Throwable {
		driver = context.getDriver();
		driver.get("https://iconnect.fs.capgemini.com");
		loginpage = new LoginPage(driver);
		homePage=new HomePage(driver);
		
	}

	@When("^I Enter valid login credentails$")
	public void i_Enter_valid_login_credentails() throws Throwable {

		loginpage.loginSubmit();
	}

	@And("^User is able to login$")
	public void User_is_able_to_login() throws Throwable {

		loginpage.loginSubmit();
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		homePage.verifyHomepage();
	}

}
