package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass1;
/**
 * 
 * @author aadhi
 * Description: To perform Bookingconfirmation page
 * Date: 07/07/2022
 */
public class BookingConfirmation extends Baseclass1 {
	
	
	 /**
	  * Description:To perform Bookingconfirmation page using locaters 
	  * Date: 07/07/2022
	  * 
	  */
	
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement txtbookingconfirmation;
	
	
	@FindBy(id="order_no")
	private WebElement getorderno;
	
	public WebElement getTxtbookingconfirmation() {
		return txtbookingconfirmation;
	}
	@FindBy(xpath="//a[text()=\"Booked Itinerary\"]")
	private  WebElement booked;	
	
	
	public WebElement getBooked() {
		return booked;
	}

	public WebElement getGetorderno() {
		return getorderno;
	}
	
	/**
	 * Description: perform bookingconfirmation page using getAttribute for get orderid
	 * @return String
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public String BookingConfirmation1() throws IOException, InterruptedException {
		Thread.sleep(8000);
		String attribute = getAttribute(getorderno, "value");
	System.out.println(attribute);
	clicklogin(getBooked());
	return attribute;
	
	}
	
	
	
}