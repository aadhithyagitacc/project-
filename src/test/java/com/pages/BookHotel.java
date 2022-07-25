package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass1;

/**
 * Description: To perform bookHotelpage with locators
 *  Date:07/07/2022
 * 
 * @author aadhi
 *
 */
public class BookHotel extends Baseclass1 {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(xpath = "//label[text()='Please Enter your First Name']")
	private WebElement txterrorfirstname;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(xpath = "//label[text()='Please Enter you Last Name']")
	private WebElement txterrorlastname;

	@FindBy(id = "address")
	private WebElement txtBillingAddress;

	@FindBy(xpath = "//label[text()='Please Enter your Address']")
	private WebElement txterroraddress;

	@FindBy(id = "cc_num")
	private WebElement DdnCreditCardNo;

	@FindBy(xpath = "//label[text()='Please Enter your 16 Digit Credit Card Number']")
	private WebElement txterrorcardno;

	@FindBy(id = "cc_type")
	private WebElement DdnCreditCardType;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement txterrorcardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement DdnExpiryMonth;

	@FindBy(xpath = "//label[text()='Please Select your Credit Card Expiry Month']")
	private WebElement txterrormonth;

	@FindBy(id = "cc_exp_year")
	private WebElement DdnExpiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement txtCvvNumber;

	@FindBy(xpath = "//label[text()='Please Enter your Credit Card CVV Number']")
	private WebElement txterrorcvvno;

	@FindBy(xpath = "//input[@id='order_no']")
	private WebElement txtorderid;

	public WebElement getTxtorderid() {
		return txtorderid;
	}

	@FindBy(id = "book_now")
	private WebElement BtnBookNow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtBillingAddress() {
		return txtBillingAddress;
	}

	public WebElement getDdnCreditCardNo() {
		return DdnCreditCardNo;
	}

	public WebElement getDdnCreditCardType() {
		return DdnCreditCardType;
	}

	public WebElement getDdnExpiryMonth() {
		return DdnExpiryMonth;
	}

	public WebElement getDdnExpiryYear() {
		return DdnExpiryYear;
	}

	public WebElement getTxtCvvNumber() {
		return txtCvvNumber;
	}

	public WebElement getBtnBookNow() {
		return BtnBookNow;
	}

	public WebElement getTxterrorfirstname() {
		return txterrorfirstname;
	}

	public WebElement getTxterrorlastname() {
		return txterrorlastname;
	}

	public WebElement getTxterroraddress() {
		return txterroraddress;
	}

	public WebElement getTxterrorcardno() {
		return txterrorcardno;
	}

	public WebElement getTxterrorcardtype() {
		return txterrorcardtype;
	}

	public WebElement getTxterrormonth() {
		return txterrormonth;
	}

	public WebElement getTxterrorcvvno() {
		return txterrorcvvno;
	}

	public void bookHotels() {
		clicklogin(getBtnBookNow());

	}

	/**
	 * Description: To perform bookhotels using all fields 
	 * Date:07/07/2022
	 * 
	 * @param First_Name
	 * @param Last_Name
	 * @param Billing_Address
	 * @param CreditCardNo
	 * @param CreditCardType
	 * @param ExpiryMonth
	 * @param ExpiryYear
	 * @param CvvNumber
	 */

	public void bookHotels(String First_Name, String Last_Name, String Billing_Address, String CreditCardNo,
			String CreditCardType, String ExpiryMonth, String ExpiryYear, String CvvNumber) {
		usenamesendkey(getTxtFirstName(), First_Name);
		usenamesendkey(getTxtLastName(), Last_Name);
		usenamesendkey(getTxtBillingAddress(), Billing_Address);
		usenamesendkey(getDdnCreditCardNo(), CreditCardNo);
		selectbyVisibilityText(getDdnCreditCardType(), CreditCardType);
		selectbyVisibilityText(getDdnExpiryMonth(), ExpiryMonth);
		selectbyVisibilityText(getDdnExpiryYear(), ExpiryYear);
		usenamesendkey(getTxtCvvNumber(), CvvNumber);
		clicklogin(getBtnBookNow());

	}

}
