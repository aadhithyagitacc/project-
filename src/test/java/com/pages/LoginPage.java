package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass1;
/**
 * 
 * @author aadhi
 *Description:To perform the login page
 *Date:07/07/2022
 */
public class LoginPage extends Baseclass1 {
	/**
	 * Description:perform the login page with locaters
	 * Date:07/07/2022
	 */
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtuserName;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	
	@FindBy(id="login")
	private WebElement btnlogin;

	
	@FindBy(xpath="//div[@class='auth_error']")
	private WebElement Txtlogin;

	public WebElement getTxtuserName() {
		return txtuserName;
	}


	public WebElement getTxtpassword() {
		return txtpassword;
	}


	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public WebElement getTxtlogin() {
		return Txtlogin;
	}

	/**
	 * Description:perform the login using username and password
	 * Date:07/07/2022
	 * @param username
	 * @param password
	 */
	public void login(String username,String password) {
		usenamesendkey(getTxtuserName(),username);
		usenamesendkey(getTxtpassword(),password);
		clicklogin(getBtnlogin());
	}
	/**
	 * Description:To perform the login with enter using username and password
	 * Date:07/07/2022
	 * @param username
	 * @param password
	 * @throws AWTException
	 */
	public void LoginWithEnter(String username ,String password) throws AWTException {
		usenamesendkey(getTxtuserName(),username);
		usenamesendkey(getTxtpassword(),password);
		
		Robot robot =new Robot();
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	

	}
	
	
}