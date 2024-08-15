package org.gang;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class JayaCodes {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\sindh\\OneDrive\\Documents\\JAYABARATHI.xlsx");
		
		Workbook book = new XSSFWorkbook();
		
		Sheet createSheet = book.createSheet("Debts");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("DEBTS");
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		book.write(fileOutputStream);
		
		System.out.println("Work done by Dev");
		System.out.println("Dev work completed");

		
	}
}
