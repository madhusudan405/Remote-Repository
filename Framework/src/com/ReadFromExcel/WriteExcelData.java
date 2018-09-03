package com.ReadFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Users\\India-HCL-ME\\Desktop\\ExcelData\\Testdata.xlsx");
		FileInputStream fin=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		
		//how read excell data using for loop
		/*System.out.println(sheet.getLastRowNum());
		
		for(int i=0;i<sheet.getLastRowNum();i++) {
			String data1=sheet.getRow(i).getCell(0).getStringCellValue();
			String data2=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data1);
			System.out.println(data2);
		}
		*/
		
		sheet.getRow(0).createCell(2).setCellValue("Pass");
		sheet.getRow(1).createCell(2).setCellValue("Fail");
		sheet.getRow(2).createCell(2).setCellValue("hi");
		sheet.getRow(3).createCell(2).setCellValue("14.5");
		FileOutputStream fout=new FileOutputStream(src);
		wb.write(fout);
		System.out.println("done with excel write operation");
		wb.close();

	}

}
