package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.Baseclass1;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
/**
 * 
 * @author aadhi
 *Description:To perform the bookhotel page using pageobjectmanager
 *Date:07/07/2022
 */
public class BookHotelPage extends Baseclass1 {
	PageObjectManager pom = new PageObjectManager();

	@Then("User should Book A Hotel {string},{string}and{string}")
	public void userShouldBookAHotelAnd(String First_Name, String Last_Name, String Billing_Address,
			io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> l = dataTable.asMaps();
		Map<String, String> m = l.get(0);
		String ccNo = m.get("CreditCardNo");
		String cctype = m.get("CreditCardType");
		String exmonth = m.get("ExpiryMonth");
		String exyear = m.get("ExpiryYear");
		String cvvno = m.get("CvvNumber");
		pom.getBookhotel().bookHotels(First_Name, Last_Name, Billing_Address, ccNo, cctype, exmonth, exyear, cvvno);
	}

	@Then("User should verify the message after Book Hotel in booking confirmation page{string}")
	public void userShouldVerifyTheMessageAfterBookHotelInBookingConfirmationPage(
			String expectedBookingConfirmationMsg) {

		WebElement btnBookNow = pom.getSelecthotels().getTxtbookhotel();
		String text4 = getText(btnBookNow);
		System.out.println(text4);
		Assert.assertEquals("Booking Confirmation", expectedBookingConfirmationMsg);

	}

	@Then("User should Book A Hotel without selecting any fields in Book hotel page")
	public void userShouldBookAHotelWithoutSelectingAnyFieldsInBookHotelPage() {
		pom.getBookhotel().bookHotels();
	}

	@Then("User should Book Hotels without selecting any fields and get error msg in book hotel page{string},{string},{string},{string},{string},{string},{string}")
	public void userShouldBookHotelsWithoutSelectingAnyFieldsAndGetErrorMsgInBookHotelPage(
			String expectedFirstNameErrorMsg, String expectedLastNameErrorMsg, String expectedBillingAdressErrorMsg,
			String expectedCreditCardNumberErrorMsg, String expectedCreditCardTypeErrorMsg,
			String expectedExpiryMonthErrorMsg, String expectedCVVNumberErrorMsg) {

		WebElement txterrorfirstname = pom.getBookhotel().getTxterrorfirstname();
		String text5 = getText(txterrorfirstname);
		System.out.println(text5);
		Assert.assertTrue(text5.contains(expectedFirstNameErrorMsg));

		WebElement txterrorlastname = pom.getBookhotel().getTxterrorlastname();
		String text6 = getText(txterrorlastname);
		System.out.println(text6);
		Assert.assertTrue(text6.contains(expectedLastNameErrorMsg));

		WebElement address = pom.getBookhotel().getTxterroraddress();
		String text7 = getText(address);
		System.out.println(text7);
		Assert.assertTrue(text7.contains(expectedBillingAdressErrorMsg));

		WebElement cardno = pom.getBookhotel().getTxterrorcardno();
		String text8 = getText(cardno);
		System.out.println(text8);
		Assert.assertEquals("Please Enter your 16 Digit Credit Card Number",expectedCreditCardNumberErrorMsg);

		WebElement cardtype = pom.getBookhotel().getTxterrorcardtype();
		String text9 = getText(cardtype);
		Assert.assertEquals("Please Select your Credit Card Type",expectedCreditCardTypeErrorMsg);

		WebElement month = pom.getBookhotel().getTxterrormonth();
		String text10 = getText(month);
		System.out.println(text10);
		Assert.assertTrue(text10.contains(expectedExpiryMonthErrorMsg));

		WebElement cvv = pom.getBookhotel().getTxterrorcvvno();
		String text11 = getText(cvv);
		System.out.println(text11);
		Assert.assertEquals("Please Enter your Credit Card CVV Number", expectedCVVNumberErrorMsg);

	}
}
