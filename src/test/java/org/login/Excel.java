package org.login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.formula.functions.NumericFunction;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
public static void main(String[] args) throws IOException {
	
	File f = new File("C:\\Users\\parthi\\eclipse-workspace\\MavenFrame\\TestData\\Book1.xlsx");
	
	FileInputStream fi = new FileInputStream(f);
	
	Workbook wk = new XSSFWorkbook(fi);
	
	Sheet sheet = wk.getSheet("corejava");
	
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		
		Row row = sheet.getRow(i);
		
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			
			Cell cell = row.getCell(j);
	 		
			int cellType = cell.getCellType();
			
			if(cellType==1) {
				String x = cell.getStringCellValue();
				System.out.println(x);
				
			}else {
				double t = cell.getNumericCellValue();
				
			
			long l = (long)t;
			
			System.out.println(l);
				
			
				
			
				
			}	
				
				
				
				
		    
		}

	}
	
}
}
