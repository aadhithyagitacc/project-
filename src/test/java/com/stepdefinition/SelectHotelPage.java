package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass1;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class SelectHotelPage extends Baseclass1 {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should select a Hotel")
	public void userShouldSelectAHotel() {
		pom.getSelecthotels().clickContinue();
	}

	@Then("User should verify after select Hotel page {string}")
	public void userShouldVerifyAfterSelectHotelPage(String expectedSelectHotelMsg) {

		WebElement errorselectmsg = pom.getSelecthotels().getTxtbookhotel();
		String text3 = getText(errorselectmsg);
		System.out.println(text3);
		Assert.assertTrue(text3.contains(expectedSelectHotelMsg));

	}

	@Then("User should select Hotels without any fields")
	public void userShouldSelectHotelsWithoutAnyFields() {

	}

	@Then("User should click and continue without select any Hotel fields error in select Hotel {string}")
	public void userShouldClickAndContinueWithoutSelectAnyHotelFieldsErrorInSelectHotel(String expectedHotelErrorMsg) {
		pom.getSelecthotels().withoutSelect();
	}

}
