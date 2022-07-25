package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass1;

/**
 * Description:To perform the select hotel page
 * Date:07/07/2022
 * @author aadhi
 *
 */
public class SelectHotels extends Baseclass1{
	/**
	 * Description:To perform the select hotel page with locaters
	 * Date:07/07/2022
	 */
	public SelectHotels() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement rbtSelect;
		
	@FindBy(id="continue")
	private WebElement BtnClick;
	
	@FindBy(xpath = "//label[text()='Please Select a Hotel']")
	private WebElement errorselectmsg;
	
    @FindBy(xpath = "//td[@class='login_title']")
	private WebElement txtVerifyMessageselecthotel;
	
    @FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement txtbookhotel;
	
   
	public WebElement getTxtbookhotel() {
		return txtbookhotel;
	}

	public WebElement getRbtSelect() {
		return rbtSelect;
	}

	public WebElement getBtnClick() {
		return BtnClick;
	}

	public WebElement getErrorselectmsg() {
		return errorselectmsg;
	}


	public WebElement getTxtVerifyMessageselecthotel() {
		return txtVerifyMessageselecthotel;
	}
/**
 * Description:To perform the select hotel page using click continue
 * Date:07/07/2022
 */
	public void clickContinue( ) {
		clicklogin(getRbtSelect());
		clicklogin(getBtnClick());
	
	}
	/**
	 * Description:perform the select hotel page without 
	 * Date:07/07/2022
	 */
	public void withoutSelect() {
		clicklogin(getBtnClick());
	

	}
}
