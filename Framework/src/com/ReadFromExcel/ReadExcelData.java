package com.ReadFromExcel;

public class ReadExcelData {

	public static void main(String[] args)  {
		
		LibraryReadExcelData lib=new LibraryReadExcelData("C:\\Users\\India-HCL-ME\\Desktop\\ExcelData\\Testdata.xlsx");
		System.out.println(lib.ReadExceldata(0, 2, 0));
		
	}

}
