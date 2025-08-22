package day18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcelFile {

	public static void main(String[] args) throws IOException {
		// Here we are creating a workbook and file 
		
		
		
		XSSFWorkbook workbook=new XSSFWorkbook();			//here no need to pass any file as we are creating new one
		
		XSSFSheet sheet=workbook.createSheet("dynamicsheet");
		
		//accecpt the data from user in run time
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows?");
		int rows=sc.nextInt();
		
		System.out.println("Enter coloumns");
		int cols=sc.nextInt();
		
		//now we are going to add data
		
		for(int r=0;r<=rows;r++) {
			XSSFRow rowcreated=sheet.createRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell createdcell=rowcreated.createCell(c);
				//add dynamic data from use
				createdcell.setCellValue(sc.next()); 		//here we are taking any input from user so using sc.next()
			}
		}
	
		//now attach the workbook to file
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\dynamicdatacreatedfile.xlsx");
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created");
		
	}

}
