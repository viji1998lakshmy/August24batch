package org.helperclass;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;
	public static TakesScreenshot ts;
	public static List type;
	public static FileInputStream fi;
	public static Workbook book;

	public static void launchChromeBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchEdgeBrowser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void launchIEDriver() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();

	}

	public static void windowMaximize() {
		driver.manage().window().maximize();

	}

	public static void launchUrl(String Url) {

		driver.get(Url);
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static void sendText(WebElement element, String text) {
		element.sendKeys(text);

	}
    
	public static void enterText(WebElement enter) {
		enterText(enter);

	}
	public static void btnClick(WebElement element) {
		element.click();

	}

	public static void windowMinimize() {
		driver.manage().window().minimize();

	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;

	}
	
	

	public static String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;

	}

	public static void close() {
		driver.close();

	}

	public static void closeAll() {
		driver.quit();

	}

	public static void dragAndDrop(WebElement src, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(src, target);

	}

	public static void doubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();

	}

	public static void rightClick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();

	}

	public static void keyUp(CharSequence element) {
		a = new Actions(driver);
		a.keyUp(element).perform();

	}

	public static void keyDown(CharSequence element) {
		a = new Actions(driver);
		a.keyDown(element).perform();

	}

	public static void moveToElement(WebElement target) {
		a = new Actions(driver);
		a.moveToElement(target).perform();

	}

	public static void keyPress(int keycode) throws AWTException {
		r = new Robot();
		r.keyPress(keycode);

	}

	public static void keyRelease(int keycode) throws AWTException {
		r = new Robot();
		r.keyRelease(keycode);

	}

	public static void takeScreenShot(String img, String path) {
		ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path + img);

		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void switchWindow(String windowId) {
		driver.switchTo().window(windowId);

	}

	public static String getParentWindow() {
		String windowID = driver.getWindowHandle();
		return windowID;

	}

	public static Set<String> getAllWindow() {
		Set<String> handles = driver.getWindowHandles();
		return handles;

	}

	public static void windowUrl(String url) {
		driver.switchTo().window("url");

	}

	public static void windowTitle(String title) {
		driver.switchTo().window("title");

	}

	public static void defaultWindow() {
		driver.switchTo().defaultContent();

	}

	public static void switchAlert() {
		al = driver.switchTo().alert();

	}

	public static void alertAccept() {
		al.accept();

	}

	public static void alertDismiss() {
		al.dismiss();

	}

	public static void alertSend(String txt) {
		al.sendKeys(txt);

	}

	public static String alertText() {
		String text = al.getText();
		return text;

	}

	public static void selectBYValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void selectByIndex(WebElement element, int type) {
		s = new Select(element);
		s.selectByIndex(type);
	}

	public static void isMultiple(WebElement element, Boolean bool) {
		s = new Select(element);
		s.isMultiple();
	}

	public static List getOptions(WebElement element) {
		s = new Select(element);
		java.util.List<WebElement> list = s.getOptions();
		return type;
	}

	public static java.util.List<WebElement> getAllSelectedOptions(WebElement element) {
		s = new Select(element);
		java.util.List<WebElement> allSelect = s.getAllSelectedOptions();
		return allSelect;
	}

	public static WebElement getFirstSelectedOptions(WebElement element) {
		s = new Select(element);
		WebElement first = s.getFirstSelectedOption();
		return first;
	}

	public static void deslectByIndex(WebElement element, int num) {
		s = new Select(element);
		s.deselectByIndex(num);
	}

	public static void deselectByValue(WebElement element, String value) {
		s = new Select(element);
		s.deselectByValue(value);
	}

	public static void deselectByVisibleText(WebElement element, String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void deSelectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	public static void scrollUp(WebElement element, Boolean bool) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + true + ")", element);

	}

	public static void scrollDown(WebElement element, Boolean bool) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + false + ")", element);

	}

	public static void highLightElement(String attname, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute(" + attname + ")", element);

	}

	public static void highLightValue(String attvalue, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute(" + attvalue + ")", element);

	}

	
	public static String passDataFromExcel(String name, int rowNo, int cellNo) {

		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\src\\test\\resources\\sheet\\VijiSheet2.xlsx");

		try {
			 fi = new FileInputStream(f);
		} catch (FileNotFoundException e) {}
		
		try {
		    book = new XSSFWorkbook(fi);
		} catch (IOException e) {
		}
		
		Sheet sheet = book.getSheet(name);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		
		int cellType= cell.getCellType();
		
		String value = null;
		
		if (cellType==1) {
			value = cell.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
		   	Date d =cell.getDateCellValue();
		   	
		   	SimpleDateFormat s = new SimpleDateFormat("MM-DD-YYYY");
		   	value =s.format(d);
		}
		else {
			double d =cell.getNumericCellValue();
			//Downcasting:
			long l = (long)d;
			value =String.valueOf(l);
		}
		return value;
			
			
	}	
	
	public static void dateAndTime() {
		Date d = new Date();
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String format = s.format(d);
		System.out.println(format);
		
	
	}
}



