package com.utils;
	import java.io.IOException;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelUtil {
		public static final String currentDir  = System.getProperty("user.dir");
		public static String filePath = currentDir + "\\src\\test\\resources";
		static XSSFWorkbook workbook; 
		static XSSFSheet sheet;
		
		public ExcelUtil(String fileName, String sheetName)throws IOException {
			String excelPath = filePath+fileName;
		    workbook = new XSSFWorkbook(excelPath);
		    sheet = (XSSFSheet) workbook.getSheet(sheetName);
		}
		
		
		public ExcelUtil() {
			// TODO Auto-generated constructor stub
		}


		/**
		 * method to get rowsCount
		 */
		public static int getRowCount() {
			int rowCount = 0;
			try {
				rowCount = sheet.getPhysicalNumberOfRows();
			}catch (Exception e) {
				e.printStackTrace();
			}
			return rowCount;
		}
		
		/**
		 * method to get columnCount
		 */
		public static int getColCount() {
			int colCount = 0;
		try {
			colCount = sheet.getRow(0).getLastCellNum();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return colCount;
	}
		
		public String readStringData(String fileName,String sheetname, int rowNum,int colNum) throws IOException
		{
			String excelPath = filePath+fileName;

			workbook=new XSSFWorkbook(excelPath);
			sheet=workbook.getSheet(sheetname);
			Row row=sheet.getRow(rowNum);
			Cell c=row.getCell(colNum);
			
			return c.getStringCellValue();
		}
		public static int readIntegerData(String fileName,String sheetname,int rowNum,int colNum) throws IOException
		{
			String excelPath = filePath+fileName;
			workbook=new XSSFWorkbook(excelPath);
			sheet=workbook.getSheet(sheetname);
			Row row=sheet.getRow(rowNum);
			Cell c=row.getCell(colNum);
			int a=(int) c.getNumericCellValue();
			return a;
		}
	
}
