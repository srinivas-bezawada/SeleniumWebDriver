package day18;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		//Excel -->Workbook-->sheet-->Row-->column
		
		// we need to open the file in reading mode
		FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		//to open the workbook
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//to access specific sheet from workbook--here we have to give sheetname
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//-----------or---------
		//XSSFSheet sheet=workbook.getSheetAt(0);			//based on index
		
		//to access row -- to get count of rows
		
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(0).getLastCellNum();
		
		System.out.println(totalRows);
		System.out.println(totalCells);
		
		//loopng to get all the data in excel and print
		
		for(int r=0;r<=totalRows;r++) {
			XSSFRow currentRow=sheet.getRow(r);
			for(int c=0;c<totalCells;c++) {
				XSSFCell currentCell=currentRow.getCell(c);
				System.out.print(currentCell.toString()+"\t");			//prints row data in single line
			}
			System.out.println();										//Jumps to another line
		}
		
		//cloase workbook
		
		workbook.close();
		//close file
		
		file.close();
		
	}

}
