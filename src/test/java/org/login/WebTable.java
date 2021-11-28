package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	driver.manage().window().maximize();
	
	List<WebElement> listTable = driver.findElements(By.tagName("tr"));

	for (int i = 0; i < listTable.size(); i++) {
		WebElement x = listTable.get(i);
		String text = x.getText();
		System.out.println("\n"+"\n"+"\n"+text);
		
		File f = new File("C:\\frames\\data.xlsx");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet sheet = w.createSheet();

       Row row = sheet.createRow(1);
       
       Cell cell = row.createCell(1);
       
       cell.setCellValue(text);
       
       w.write(fo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
}
