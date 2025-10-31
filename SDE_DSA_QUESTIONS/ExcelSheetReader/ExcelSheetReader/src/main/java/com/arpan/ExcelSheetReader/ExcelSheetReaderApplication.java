package com.arpan.ExcelSheetReader;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class ExcelSheetReaderApplication {

	public static void main(String[] args) throws IOException {
		// Create Scanner object to read user input from console
		Scanner sc=new Scanner(System.in);
		// Ask user to enter the full path of the Excel file
		System.out.println("Please enter your excel file path: ");
		// Read file path entered by user
		String filePath=sc.nextLine();
		try{
			FileInputStream fis=new FileInputStream(filePath); // Create FileInputStream to open the Excel file from the given path and convert it into binary data
			Workbook workbook=new XSSFWorkbook(fis);// Create Workbook instance from the FileInputStream & convert binary data into Java object & XSSFWorkbook is used for .xlsx files (Excel 2007 and later)
			Sheet sheet = workbook.getSheetAt(0); // Get the first sheet (index starts from 0)
			Iterator<Row> rowIterator= sheet.iterator(); // Get iterator to iterate through all rows in the sheet
			System.out.println("-----------------------------------------------------------------------" +
					"----------------------------------------------------------------------------" +
					"--------------------------------------------------------------------------------------");
			// Loop through each row one by one
			while (rowIterator.hasNext()){
				Row row= rowIterator.next(); // Get the next row
				StringBuilder sb = getStringBuilder(row); // Call helper method to convert row data into formatted string
				System.out.println(sb);// Print the formatted row data
				System.out.println("--------------------------------------------" +
						"-----------------------------------------------------------" +
						"---------------------------------------------------------------------------" +
						"-----------------------------------------------------");
			}
		} catch (Exception e) {
			System.out.println("Excel sheet not found : "+e);
		}
		finally {
			sc.close();
		}
	}


	// Converts a Row object into a formatted StringBuilder for display
	private static StringBuilder getStringBuilder(Row row) {
		StringBuilder sb=new StringBuilder("| ");// Create a StringBuilder to store formatted row data & Start with a vertical bar for table-like appearance
		// Loop through each cell in the current row
		for(Cell cell: row){
			String value="";
			// Determine the cell type and extract value accordingly
			switch (cell.getCellType()){
				case STRING:
						value= cell.getStringCellValue();;
						break;
				case NUMERIC:
						double numericValue= cell.getNumericCellValue(); // Get numeric value (always as double)
							// Check if numeric value is an integer (no decimal part)
							// If true, cast to int to remove .0
							// Else, format to 2 decimal places
							value=(numericValue==Math.floor(numericValue))
								?String.valueOf((int)numericValue)
								:String.format("%.2f",numericValue);
						break;
				case BOOLEAN:
						value=String.valueOf(cell.getBooleanCellValue());
						break;
				default:
						value="";
			}
			// Append the formatted cell value to StringBuilder
			// %-15s means left-align text within 15-character width
			// Adds " | " as separator between columns
			sb.append(String.format("%-15s | ",value));
		}
		// Return formatted string for this row
		return sb;
	}
}
