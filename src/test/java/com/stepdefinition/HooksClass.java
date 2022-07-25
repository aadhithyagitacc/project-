package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.Baseclass1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends Baseclass1 {
	
	@Before
	public void beforeScenario() throws Exception{
		getDriverType(getPropertyFileValue("browserType"));
		loadurl(getPropertyFileValue("url"));
		maximize();
	}
	
	@After
	public void afetrScenario(Scenario sc) {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		sc.embed(b, "Evey Scenario");
		closeAllWindows();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
