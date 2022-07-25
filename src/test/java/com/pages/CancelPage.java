package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass1;
/**
 * 
 * @author aadhi
 *Description:To perform cancel page 
 *Date: 07/07/2022
 */
public class CancelPage extends Baseclass1 {
/**
 * Description:To perform cancel page with locaters 
 * Date: 07/07/2022
 */
	public CancelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement OrderId;
	
	@FindBy(id="search_hotel_id")
	private WebElement hotelId;
	
	@FindBy(xpath = "//label[@id='search_result_error']")
	private WebElement cancelerrormsg;
	
	@FindBy(xpath= "//input[@id='order_id_text']")
	private WebElement txtbox;
	
	@FindBy(xpath = "//input[@id='search_hotel_id']")
	private WebElement Clickgo;
	
	@FindBy(xpath ="(//input[@name='ids[]'])[1]")
	private WebElement btnorderid;
	
	
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement btncancelselect;
	
	@FindBy(id="check_all")
	private WebElement CliclCheckBox;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement CliclCancel;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedHistory;
	
	
	public WebElement getCliclCheckBox() {
		return CliclCheckBox;
	}

	public WebElement getCliclCancel() {
		return CliclCancel;
	}

	public WebElement getBookedHistory() {
		return bookedHistory;
	}


	public WebElement getCancelerrormsg() {
		return cancelerrormsg;
	}

	public WebElement getTxtbox() {
		return txtbox;
	}

	public WebElement getClickgo() {
		return Clickgo;
	}

	public WebElement getBtnorderid() {
		return btnorderid;
	}

	public WebElement getBtncancelselect() {
		return btncancelselect;
	}

	public WebElement getOrderId() {
		return OrderId;
	}
	
	public WebElement getHotelId() {
		return hotelId;
	}

	/**
	 * Description:perform the cancelbooking page using sendkeys,click and alert 
	 * Date: 07/07/2022
	 * @param Order_id
	 */
	public void CancelBookings(String Order_id) {
	clicklogin(getBookedHistory());
	usenamesendkey(getOrderId(), Order_id);
	clicklogin(getClickgo());
	clicklogin(getBtnorderid());
	clicklogin(getBtncancelselect());
    alert();
	
	
	}
	
	}
	
	
	
