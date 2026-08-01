package com.omrbranch.dd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDClass {
	public static void main(String[] args) throws IOException {
		//How to get the Value from Excel Sheet ?
		
		
		//file Path
		File file=new File("C:\\Users\\User\\eclipse-workspace\\FrameWork\\Class10AM\\TestData\\LoginId.xlsx");
		
		//File Reader   //return type get ---> ctrl+2 , L
		FileInputStream fs = new FileInputStream(file);
		
		//Access the File,          Workbook: I  getSheet: M
		Workbook workbook = new XSSFWorkbook(fs);
		
		//Particular sheet Access   Sheet: I     getRow: M
		Sheet sheet = workbook.getSheet("Login");
		   
		//Handle the particular Row   Row: I      getCell: M
		Row row = sheet.getRow(4);
		
		
		//Access in particular cell value   Cell:I   
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
	}

}
