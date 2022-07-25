package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass1 {

	public static WebDriver driver;

	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void implicitwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void loadurl(String url) {
		driver.get(url);
	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public WebElement usernamefindElementById(String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public static void cleartxt(WebElement element) {
		element.clear();

	}

	public static void closeAllWindows() {
		driver.quit();
	}

	public void usenamesendkey(WebElement element, String data) {
		element.sendKeys(data);
	}

	public WebElement passwordfindElementById(String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public void passwordtype(WebElement element, String data) {
		element.sendKeys(data);
	}

	public WebElement loginfindElementById(String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;

	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void clicklogin(WebElement element) {
		element.click();
	}

	public WebElement locationfindElementById(String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;

	}

	public WebElement userfinfElementByXpath(String Xpath) {
		WebElement element = driver.findElement(By.xpath(Xpath));
		return element;
	}

	public void locationselect(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public static void selectbyVisibilityText(WebElement target, String visibilityText) {
		Select el = new Select(target);
		el.selectByVisibleText(visibilityText);
	}

	public WebElement hotelfindElementById(String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;

	}

	// public void acceptAlert(WebElement element) {
	// clicklogin(element);
	//
	// }

	public void hotelselect(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public WebElement roomtypefindElementById(String AttributeValue) {
		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public void roomtypeselect(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public WebElement roomnofindElementById(String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public void roomnopselect(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public WebElement roomdateinfindElementById(String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public WebElement findElementByname(String AttributeValue) {

		WebElement element = driver.findElement(By.name(AttributeValue));
		return element;
	}

	public void dateInsendkey(WebElement element, String data) {
		element.sendKeys(data);
	}

	public WebElement roomdateoutfindElementById(String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getAttribute(WebElement element, String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;
	}

	public void alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void dateoutsendkey(WebElement element, String data) {
		element.sendKeys(data);
	}

	public WebElement adultfindElementById(String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public void adultselect(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public WebElement childfindElementById(String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}

	public void childselect(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public void submitbutton(WebElement element) {
		element.click();
	}

	public void radiobutton(WebElement element) {
		element.click();
	}

	public WebElement firstnamefindElementById(WebElement element, String AttributeValue, String data) {

		WebElement element1 = driver.findElement(By.id(AttributeValue));
		element.sendKeys(data);
		return element1;
	}

	public WebElement lastnamefindElementById(WebElement element, String AttributeValue, String data) {

		WebElement element1 = driver.findElement(By.id(AttributeValue));
		element.sendKeys(data);
		return element1;
	}

	public WebElement AddressfindElementById(WebElement element, String AttributeValue, String data) {

		WebElement element1 = driver.findElement(By.id(AttributeValue));
		element.sendKeys(data);
		return element1;
	}

	public WebElement creditnofindElementById(WebElement element, String AttributeValue, String data) {

		WebElement element1 = driver.findElement(By.id(AttributeValue));
		element.sendKeys(data);
		return element1;
	}

	public WebElement creditcardtypefindElementById(WebElement element1, int index, String AttributeValue) {

		WebElement element = driver.findElement(By.id(AttributeValue));
		Select select = new Select(element1);
		select.selectByIndex(index);
		return element;
	}

	public String worksheetgetdata(String name, int rowno, int cellno) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\aadhi\\eclipse-workspace\\frameday1task1\\excel\\base.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(name);

		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

				res = date.format(dateCellValue);
			}
			// else if(getnumericcellvalue)
			else {
				double numericCellValue = cell.getNumericCellValue();
				long d = (long) numericCellValue;
				BigDecimal valueOf = BigDecimal.valueOf(d);

				res = valueOf.toString();
			}
			break;
		default:
			break;
		}
		return res;
	}

	public void workbookWritedata(String sheetName, int rowno, int cellno, String data) throws IOException {
		File file = new File("C:\\Users\\aadhi\\eclipse-workspace\\frameday1task1\\excel\\base.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowno);
		Cell cell = row.createCell(cellno);
		cell.setCellValue(data);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}

	public String txtclear(WebElement element) {
		element.clear();
		return toString();

	}

	public String getPropertyFileValue(String key) throws IOException {
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		Object name = properties.get(key);
		String value = (String) name;
		return value;
	}

	public static void getDriverType(String browserType) {
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}

}