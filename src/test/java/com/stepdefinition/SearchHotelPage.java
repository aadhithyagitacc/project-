package com.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass1;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class SearchHotelPage extends Baseclass1 {

	PageObjectManager pom = new PageObjectManager();

	@Then("User should search Hotels{string},{string},{string},{string},{string},{string},{string}and{string}")
	public void userShouldSearchHotels(String Location, String Hotels, String Room_Type, String Number_of_Rooms,
			String Check_In_Date, String Check_Out_Date, String Adults_per_Room, String Children_per_Room)
			throws IOException {
		pom.getSearchpage().SearchHotels(Location, Hotels, Room_Type, Number_of_Rooms, Check_In_Date, Check_Out_Date,
				Adults_per_Room, Children_per_Room);
	}

	@Then("User should verify after Search Hotels {string}")
	public void userShouldVerifyAfterSearchHotels(String expectedSelectHotelMsg) {

		WebElement txtselecthotel = pom.getSelecthotels().getTxtVerifyMessageselecthotel();
		String text = getText(txtselecthotel);
		Assert.assertEquals("Select Hotel", expectedSelectHotelMsg, text);
	}

	@Then("User should enter manatory fields only {string},{string},{string},{string}and{string}")
	public void userShouldEnterManatoryFieldsOnlyAnd(String Location, String Number_of_Rooms, String Check_In_Date,
			String Check_Out_Date, String Adults_per_Room) {
		pom.getSearchpage().SearchHotelManatory(Location, Number_of_Rooms, Check_In_Date, Check_Out_Date,
				Adults_per_Room);

	}

	@Then("User should verify after Search Hotels page checking Error Message {string}and{string}")
	public void userShouldVerifyAfterSearchHotelsPageCheckingErrorMessageAnd(String expectedcheckindateinerror,
			String expectedcheckouterror) {

		WebElement errordatein = pom.getSearchpage().getErrordatein();
		String attribute1 = getText(errordatein);
		System.out.println(attribute1);
		Assert.assertTrue(attribute1.contains(expectedcheckindateinerror));

		WebElement errordateout = pom.getSearchpage().getErrordateout();
		String attribute2 = getText(errordateout);
		System.out.println(attribute2);
		Assert.assertTrue(attribute2.contains(expectedcheckouterror));

		// Assert.assertEquals(expectedcheckindateinerror,
		// getText(pom.getSearchpage().getErrordatein()));
		// Assert.assertEquals(expectedcheackouterror,
		// getText(pom.getSearchpage().getErrordateout()));

	}

	@Then("User should search Hotels without select any fields")
	public void userShouldSearchHotelsWithoutSelectAnyFields() {
		pom.getSearchpage().SearchHotelWithoutfeilds();
	}

	@Then("User should verify after Search Hotel Error message in location {string}")
	public void userShouldVerifyAfterSearchHotelErrorMessageInLocation(String expectedLocationError) {

		WebElement errorLocation = pom.getSearchpage().getErrorLocation();
		String text1 = getText(errorLocation);
		Assert.assertEquals("Please Select a Location", text1, expectedLocationError);

	}

}