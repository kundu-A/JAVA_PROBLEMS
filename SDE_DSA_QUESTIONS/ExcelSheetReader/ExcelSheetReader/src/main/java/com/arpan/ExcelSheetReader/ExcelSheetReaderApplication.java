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
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your excel file path: ");
		String filePath=sc.nextLine();
		try{
			FileInputStream fis=new FileInputStream(filePath);
			Workbook workbook=new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator= sheet.iterator();
			System.out.println("-----------------------------------------------------------------------" +
					"----------------------------------------------------------------------------" +
					"--------------------------------------------------------------------------------------");
			while (rowIterator.hasNext()){
				Row row= rowIterator.next();
				StringBuilder sb = getStringBuilder(row);
				System.out.println(sb);
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

	private static StringBuilder getStringBuilder(Row row) {
		StringBuilder sb=new StringBuilder("| ");
		for(Cell cell: row){
			String value="";
			switch (cell.getCellType()){
				case STRING:
						value= cell.getStringCellValue();;
						break;
				case NUMERIC:
						double numericValue= cell.getNumericCellValue();
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
			sb.append(String.format("%-15s | ",value));
		}
		return sb;
	}
}
