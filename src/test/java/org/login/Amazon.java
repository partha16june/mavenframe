package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
public static void main(String[] args) throws FileNotFoundException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("iphone",Keys.ENTER);
	
	List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	
	for (int i = 0; i < list.size(); i++) {
		WebElement element = list.get(i);
		String text = element.getText();
		System.out.println(text);
	
	
	
	File f= new File("C:\\maven.xlsx");
	
	FileOutputStream fo = new FileOutputStream(f);
	
	Workbook w = new XSSFWorkbook();
	
	Sheet sheet = w.createSheet();
	
	Row row = sheet.createRow(i);
	
	Cell cell = row.createCell(0);
	
	String x = cell.getStringCellValue();
	
	System.out.println(x);
	System.out.println(x);
	System.out.println(x);
	System.out.println(x);
	
	

	
}
}}
