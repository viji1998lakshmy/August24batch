package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.helperclass.BaseClass;

public class Executions1 extends BaseClass {
	
	public static void main(String[] args) throws IOException {
	 //Declare FIle Path:
	  File f = new File("src\\test\\resources\\sheet\\VijiSheet2.xlsx");
	 //To create obj for FileInputStream
	   FileInputStream fi = new FileInputStream(f);
	 //Downcasting for WorkBook-->I
	   Workbook book = new XSSFWorkbook(fi);
	   
	   Sheet sheet = book.getSheet("Data");
	   Row row = sheet.getRow(4);
	   int a = row.getPhysicalNumberOfCells();
	   System.out.println(a);
	   
	   Cell cell = row.getCell(2);
	   System.out.println(cell);
		
	}

}
