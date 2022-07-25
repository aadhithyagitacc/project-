package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass1;
/**
 * 
 * @author aadhi
 *Description:To perform search hotel page
 *Date:07/07/2022
 */
public class SearchPage extends Baseclass1 {
	/**
	 * Description:perform search hotel with locaters
	 * Date:07/07/2022
	 */
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="location_span")
	private WebElement errorLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotels;
		
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnRoomNo;
		
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
		
	@FindBy(xpath = "//span[@id='checkin_span']")
	private WebElement errordatein;
		
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	

	@FindBy(xpath = "//span[@id='checkout_span']")
	private WebElement errordateout;
	
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultPerRoom;
	
	
	@FindBy(id="child_room")
	private WebElement dDnChildPerRoom;	
	
	@FindBy(id="Submit")
	private WebElement btnSearch;
	
	@FindBy(xpath="//input[@id='username_show']")
	private WebElement txtusername;
	 
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement verifyselecthotel;
	 
	
	
	public WebElement getErrorLocation() {
		return errorLocation;
	}

	public WebElement getErrordatein() {
		return errordatein;
	}

	public WebElement getErrordateout() {
		return errordateout;
	}

	

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultPerRoom() {
		return dDnAdultPerRoom;
	}

	public WebElement getdDnChildPerRoom() {
		return dDnChildPerRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getTxtusername() {
		return txtusername;
	}
	
/**
 * Description:To perform the search hotel using all fields 
 * Date:07/07/2022
 * @param location
 * @param hotels
 * @param roomType
 * @param roomnos
 * @param checkInDate
 * @param checkOutDate
 * @param adultPerRoom
 * @param childPerRoom
 */
	public void SearchHotels(String location,String hotels,String roomType,String roomnos,String checkInDate,String checkOutDate,String adultPerRoom,String childPerRoom) {
		
		selectbyVisibilityText(getdDnLocation(),location);
		selectbyVisibilityText(getdDnHotels(),hotels);
		selectbyVisibilityText(getdDnRoomType(),roomType);
		selectbyVisibilityText(getdDnRoomNo(),roomnos);
		cleartxt(getTxtCheckInDate());
		usenamesendkey(getTxtCheckInDate(),checkInDate);
		cleartxt(getTxtCheckOutDate());
		usenamesendkey(getTxtCheckOutDate(),checkOutDate);
		selectbyVisibilityText(getdDnAdultPerRoom(),adultPerRoom);
		selectbyVisibilityText(getdDnChildPerRoom(),childPerRoom);
		clicklogin(btnSearch);
				
	}
	/**
	 * Description:To perform the search hotel page using only manatory fields
	 * Date:07/07/2022
	 * @param location
	 * @param roomnos
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultPerRoom
	 */
	
	public void SearchHotelManatory(String location,String roomnos,String checkInDate,String checkOutDate,String adultPerRoom) {
		selectbyVisibilityText(getdDnLocation(),location);
		selectbyVisibilityText(getdDnRoomNo(),roomnos);
		cleartxt(getTxtCheckInDate());
		usenamesendkey(getTxtCheckInDate(),checkInDate);
		cleartxt(getTxtCheckOutDate());
		usenamesendkey(getTxtCheckOutDate(),checkOutDate);
		selectbyVisibilityText(getdDnAdultPerRoom(),adultPerRoom);
		clicklogin(btnSearch);

	}
	/**
	 * Description:To perform the search hotel page without using fields
	 * Date:07/07/2022
	 */
	public void SearchHotelWithoutfeilds() {
		clicklogin(btnSearch);
		
	}





	

	

}
