package Readconfilt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilesclass {
	public static FileInputStream file;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static int getrowcount(String xlsheet) throws IOException {
	   file=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\StaticMethod\\src\\test\\java\\TestData\\New Microsoft Office Excel Worksheet.xlsx");
        wb=new XSSFWorkbook(file);
       sheet  =wb.getSheet(xlsheet);
       int rowcount=sheet.getLastRowNum();
       return rowcount;
       
	}
	public static int getCellcount(String xlsheet,int rownum) throws IOException {
		file=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\StaticMethod\\src\\test\\java\\TestData\\New Microsoft Office Excel Worksheet.xlsx");
	wb=new XSSFWorkbook(file);
	sheet=wb.getSheet(xlsheet);
	row=sheet.getRow(rownum);
	int cellcount=row.getLastCellNum();
	return cellcount;
	
	
	} 
	public static String getcellData(String xlsheet,int rownum,int cellnum) throws IOException {
		file=new FileInputStream("C:\\Users\\User 1\\Desktop\\ecplics\\StaticMethod\\src\\test\\java\\TestData\\New Microsoft Office Excel Worksheet.xlsx");
		wb=new XSSFWorkbook(file);
		sheet=wb.getSheet(xlsheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(cellnum);
	
			DataFormatter formatter=new DataFormatter();
			String cellData=formatter.formatCellValue(cell);
			return cellData;
			
	}

}
