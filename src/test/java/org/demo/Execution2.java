package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.helperclass.BaseClass;



public class Execution2 extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\src\\test\\resources\\sheet\\Login.xlsx");
		
		FileInputStream fi = new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook();
		
		Sheet sheet=book.createSheet();
		
		Row row = sheet.createRow(0);
		
		
		Cell c1=row.createCell(0);
		Cell c2= row.createCell(1);
		
		
		
		c1.setCellValue("Selenium");
		c2.setCellValue("Maven");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		book.write(fo);
		System.out.println("Finish");
		
		
	
	


	}
	
		
	}


