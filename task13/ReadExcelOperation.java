package task13;

import java.io.IOException; //Importing Exception Class

import org.apache.poi.xssf.usermodel.XSSFCell;   // Importing Apache POI classes
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelOperation {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("E:\\JAT-Guvi\\Java\\task13\\Task13SampleBook.xlsx");  // Opening a book and mentioning the path of the excel file that needs to be read
		XSSFSheet sheet = book.getSheetAt(0); // getSheetAt(0) will read the first sheet present inside the excel file
		
		int rowcount = sheet.getLastRowNum(); // this will determine the number of rows 
		int columncount = sheet.getRow(0).getLastCellNum(); //this will determine number of columns
		
		String[][] data = new String[rowcount][columncount];
		
		for(int i=1; i<=rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i); // this will read the rows
			
			for(int j=0; j<columncount; j++) {
				
				XSSFCell cell = row.getCell(j); //this will read the cells
				
				data[i-1][j] = cell.getStringCellValue(); //this will get the values from the seller and will store it in the variable
				System.out.println(cell.getStringCellValue()); //this will print the elements in the cells
			}
		}
		book.close(); //to close the book
		
	}

}
