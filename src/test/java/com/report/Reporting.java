package com.report;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
/**
 * 
 * @author aadhi
 *Description:To generate the Jvm report
 *Date:07/07/2022
 */
public class Reporting {
	/**
	 * Description:To generate jvm report using json file 
	 * Date:07/07/2022
	 * @param jsonFile
	 */
	public static void generateJVMReport(String jsonFile) {

		File file=new File("C:\\Users\\aadhi\\eclipse-workspace\\OMRBranchAdactinAutomation\\target");
		 Configuration configu=new Configuration(file,"Adactin Automation");
		 configu.addClassifications("Brower", "Chrome");
		 configu.addClassifications("Version", "106");
		 configu.addClassifications("OS", "WIN11");
			
		java.util.List<String>jsonfiles=new ArrayList<String>();
		jsonfiles.add(jsonFile);
		ReportBuilder report=new ReportBuilder(jsonfiles,configu);
		report.generateReports();
		
	}
}
