package com.pagemanager;

import com.pages.BookHotel;
import com.pages.BookingConfirmation;
import com.pages.CancelPage;
import com.pages.LoginPage;
import com.pages.SearchPage;
import com.pages.SelectHotels;

/**
 * 
 * @author aadhi 
 * Description : To perform pageobjectmanager
 *  Date: 07/07/2022
 */
public class PageObjectManager {
	private LoginPage loginpage;
	private SearchPage searchpage;
	private SelectHotels selecthotels;
	private BookHotel bookhotel;
	private BookingConfirmation bookingconfirmation;
	private CancelPage cancelpage;

	/**
	 * Description: To perform loginpage 
	 * Date: 07/07/2022
	 * 
	 * @return LoginPage
	 */
	public LoginPage getLoginpage() {
		return (loginpage == null) ? loginpage = new LoginPage() : loginpage;
	}

	/**
	 * Description: To perform searchpage
	 *  Date: 07/07/2022
	 * 
	 * @return SearchPage
	 */

	public SearchPage getSearchpage() {
		return (searchpage == null) ? searchpage = new SearchPage() : searchpage;
	}
	/**
	 * Description: To perform selecthotelpage
	 * Date: 07/07/2022
	 * @return SelectHotels 
	 */
	public SelectHotels getSelecthotels() {
		return (selecthotels == null) ? selecthotels = new SelectHotels() : selecthotels;
	}
	/**
	 * Description: To perform bookhotelpage
	 * Date: 07/07/2022
	 * @return BookHotel
	 */

	public BookHotel getBookhotel() {
		return (bookhotel == null) ? bookhotel = new BookHotel() : bookhotel;
	}
	/**
	 *  Description: To perform bookingconfirmationpage
	 *   Date: 07/07/2022
	 * @return BookingConfirmation
	 */

	public BookingConfirmation getBookingconfirmation() {
		return (bookingconfirmation == null) ? bookingconfirmation = new BookingConfirmation() : bookingconfirmation;
	}
	/**
	 * Description: To perform cancelpage
	 * Date:07/07/2022
	 * @return CancelPage
	 */

	public CancelPage getCancelpage() {
		return (cancelpage == null) ? cancelpage = new CancelPage() : cancelpage;
	}

}
