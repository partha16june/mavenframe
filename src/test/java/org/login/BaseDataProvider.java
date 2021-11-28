package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BaseDataProvider {

	
	@DataProvider(name="mydatas")
	public static Object[][] getData() throws IOException {
		File f = new File("C:\\Users\\parthi\\eclipse-workspace\\MavenFrame\\TestData\\datapro.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheet("Sheet1");
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String x = cell.getStringCellValue();
		System.out.println(x);
		Row row2 = sheet.getRow(0);
		Cell cell2 = row2.getCell(1);
		String y = cell2.getStringCellValue();
		System.out.println(y);
		
		
		return new Object[][] {
			{"x","y"}
		};
		

	}
}
