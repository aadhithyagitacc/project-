package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass1;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends Baseclass1 {
	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the Adactin page")
	public void userIsOnTheAdactinPage() throws IOException {
		getDriverType(getPropertyFileValue("browserType"));
		maximize();
		loadurl(getPropertyFileValue("url"));
	}

	@When("User should perform login{string},{string}")
	public void userShouldPerformLogin(String username, String password) {
		pom.getLoginpage().login(username, password);
	}

	@When("User should perform login{string},{string} with enter key")
	public void userShouldPerformLoginWithEnterKey(String username, String password) throws AWTException {
		pom.getLoginpage().LoginWithEnter(username, password);
	}

	@Then("User should verify after login error msg {string}")
	public void userShouldVerifyAfterLoginErrorMsg(String expectedErrorMsg) {

		WebElement element = pom.getLoginpage().getTxtlogin();
		String errormsg = getText(element);
		System.out.println(errormsg);
		Assert.assertTrue(errormsg.contains(expectedErrorMsg));

	}
}
