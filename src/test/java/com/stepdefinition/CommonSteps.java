package com.stepdefinition;



import org.junit.Assert;
import org.openqa.selenium.WebElement;

//import org.junit.Assert;

import com.baseclass.Baseclass1;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class CommonSteps extends Baseclass1 {


	PageObjectManager pom =new PageObjectManager();

	@Then("User should verify after login {string}")
	public void userShouldVerifyAfterLogin(String expectedLoginSuccessfully) {
	WebElement txtusername = pom.getSearchpage().getTxtusername();
	String actualtext = txtusername.getAttribute("value");
	System.out.println(actualtext);
	Assert.assertEquals("verify username", expectedLoginSuccessfully,actualtext);
		
	 
		
	}
	
	
	
	
	
}
