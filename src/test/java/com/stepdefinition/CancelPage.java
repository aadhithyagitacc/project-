package com.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass1;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class CancelPage extends Baseclass1 {
	PageObjectManager pom = new PageObjectManager();

	@Then("User should cancel the order id")
	public void userShouldCancelTheOrderId() throws IOException, InterruptedException {

		String bookingConfirmation1 = pom.getBookingconfirmation().BookingConfirmation1();
		pom.getCancelpage().CancelBookings(bookingConfirmation1);
	}

	@Then("User should verify the order id cancelled msg in Booked Itinerary page{string}")
	public void userShouldVerifyTheOrderIdCancelledMsgInBookedItineraryPage(String expectedCancelBookingMsg) {

		WebElement btnBookNow1 = pom.getCancelpage().getCancelerrormsg();
		String tex = btnBookNow1.getText();
		System.out.println(tex);
		Assert.assertEquals("The booking has been cancelled.", expectedCancelBookingMsg);

	}

	@Then("User should cancel the booked order id{string}")
	public void userShouldCancelTheBookedOrderId(String Order_id) {
		pom.getCancelpage().CancelBookings(Order_id);
	}

}
