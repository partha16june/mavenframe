package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
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

public class DataDriven {

	public static void main(String[] args) throws IOException  {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone",Keys.ENTER);
		List<WebElement> allElements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		File f=new File("C:\\sample\\new.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		Workbook wb=new XSSFWorkbook();
		Sheet createSheet = wb.createSheet();
		
		for (int i = 0; i < allElements.size(); i++) {
			WebElement alltext = allElements.get(i);
			String text = alltext.getText();
			
			Row row = createSheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
			
		}
		wb.write(fo);
		
		
	}
}
