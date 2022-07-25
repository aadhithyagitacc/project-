package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE, strict = true, dryRun = false, plugin = {
		"json:target/output.json" }, monochrome = true, features = {
				"src\\test\\resources" }, glue = { "com.stepdefinition" })
/**
 * Description:To perform Testrunnerclass
 * Date:07/07/2022
 * @author aadhi
 *
 */
public class TestRunnerClass {

	@AfterClass
	/**
	 * Description:To perform the afterclass using json path to generate the jvm report
	 */
	public static void afterClass() {
		Reporting.generateJVMReport("C:\\Users\\aadhi\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\output.json");
	}

}
