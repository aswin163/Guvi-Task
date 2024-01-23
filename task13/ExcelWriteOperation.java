package task13;

import java.io.FileNotFoundException; // Importing exception classes
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;  //Importing Apache POI classes
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperation {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		XSSFWorkbook TaskBook = new XSSFWorkbook(); //This statement opens a book
		XSSFSheet Sheet1 = TaskBook.createSheet(); //This statement creates a sheet inside the book
		
		Object[][] data = {
				
				{"Name","Age","Email"},
				{"John Doe",30,"john@test.com"},       // Entering the data that needs to be written into the book
				{"Jane Doe",28,"jane@test.com"},
				{"Bob Smith",35,"jacky@example.com"},
				{"Swapnil",37,"swapnil@example.com"}
		};
		
		int RowCount = 0; // Initializing rows
		
		for(Object[] row1 : data) { //for each loop
			
			XSSFRow row = Sheet1.createRow(RowCount++); // Creating rows
			
			int ColumnCount = 0; // Initializing columns
			
			for(Object col : row1) { //for each loop
				
				XSSFCell cell = row.createCell(ColumnCount++); // Creating columns
				
				if(col instanceof String) {
					
					cell.setCellValue((String) col);   // This nested if will compare the data types of the cells and data 
					
				}else if(col instanceof Integer) {
					
					cell.setCellValue((Integer) col);
					
				}
			}
			
		}
		
		try(   // Using a try since FileOutPutStream is a checked exception and  it may throw exception if the file does not exist
				FileOutputStream output = new FileOutputStream("TaskBook.xlsx");){ //this will create the excel file
				TaskBook.write(output); // this will write the date to the excel file created
		} 

	}

}
