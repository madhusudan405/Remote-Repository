package com.ReadFromExcel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LibraryReadExcelData {
	FileInputStream fin;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	
	public LibraryReadExcelData(String excelPath) {
		File src=new File(excelPath);
		try {
			fin=new FileInputStream(src);
			wb=new XSSFWorkbook(fin);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	
		
	public Object ReadExceldata(int sheetNum,int row,int column) {
		sheet=wb.getSheetAt(sheetNum);
		Object data=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

}
