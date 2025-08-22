package day18;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicDataIntoExcelFile {

	public static void main(String[] args) throws IOException {
		// Here we are creating a workbook and file 
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\createdfile.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();			//here no need to pass any file as we are creating new one
		
		XSSFSheet sheet=workbook.createSheet("createdsheetname");
		
		XSSFRow row1=sheet.createRow(0);
			row1.createCell(0).setCellValue("Java");
			row1.createCell(1).setCellValue(1234);
			row1.createCell(2).setCellValue("Automation");
		XSSFRow row2=sheet.createRow(1);
			row2.createCell(0).setCellValue("Python");
			row2.createCell(1).setCellValue(3421);
			row2.createCell(2).setCellValue("Automation");
		XSSFRow row3=sheet.createRow(2);
			row3.createCell(0).setCellValue("C#");
			row3.createCell(1).setCellValue(3421);
			row3.createCell(2).setCellValue("Automation");
			
			
		//now attach the workbook to file
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
		
	}

}
