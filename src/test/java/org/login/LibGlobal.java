package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public class LibGlobal {
	
	public static WebDriver driver;
	public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\parthi\\eclipse-workspace\\SeleniumDay1\\driver file\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static WebElement id(String value) {
		WebElement element = driver.findElement(By.id(value));
		return element;
	}
	public static WebElement name(String value) {
		WebElement element = driver.findElement(By.name(value));
		return element;
	}
	public static WebElement xpath(String xpathvalue) {
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		return element;
	}
	public static void mouseOverAction(WebElement value) {
		
		Actions action = new Actions(driver);
		action.moveToElement(value).perform();
	
	}
	public static void getText(WebElement refName) {
		refName.getText();
	}
	public static void getAtrribute(WebElement refName,String value) {
		String attribute = refName.getAttribute(value);
		System.out.println(attribute);
	}
	public static void navigate(String url) {
		driver.navigate().to(url);
	}
	public static void naviBack() {
		driver.navigate().back();
	}
	public static void naviFwd() {
		driver.navigate().forward();
	}
	public static void dragAndDrop(WebElement s, WebElement d) {
		Actions action = new Actions(driver);
		action.dragAndDrop(s, d).perform();
	}
	public static WebElement classNam(String value) {
		WebElement element = driver.findElement(By.className(value));
        return element;
	}
	public static void rightClick(WebElement ref) {
	    Actions action = new Actions(driver);
	    action.contextClick(ref).perform();
	}
	public static void keyPress(int value) throws AWTException {
		Robot robo = new Robot();
		robo.keyPress(value);
		
	}
	public static void keyRelease(int value) throws AWTException {
	Robot robo = new Robot();
	robo.keyRelease(value);

	}
	public static void doubleClick(WebElement ref) {
	  Actions action = new Actions(driver);
	  action.doubleClick(ref).perform();
	}
	
	public static void simpleAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	public static void promptAlert(String value) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(value);
		al.accept();
	}
	public static void confirmAlert() {
	    Alert al = driver.switchTo().alert();
	    al.dismiss();
	}
	public static void screenShot(WebElement refName,String location) throws IOException {
		TakesScreenshot shot = (TakesScreenshot)driver;
	    File s = shot.getScreenshotAs(OutputType.FILE);
	    File d = new File("D:\\selenium\\shot.png");
	    FileUtils.copyFile(s, d);
	}
	public static void javaScript(String value,WebElement refname) {
		JavascriptExecutor ref = (JavascriptExecutor)driver;
		ref.executeScript(value, refname);
	}
	public static void txtSender(WebElement refname,String value) {
		refname.sendKeys(value);

	}
	public static void btnClick(WebElement refname) {
		refname.click();

	}
	public static void select(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	public static void selectIndex(WebElement element,int value) {
		Select s = new Select(element);
		s.selectByIndex(value);
	}
	public static void selectValue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

	

}