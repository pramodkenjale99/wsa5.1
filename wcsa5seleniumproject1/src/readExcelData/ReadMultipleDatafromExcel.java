package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDatafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
		 
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Fifa");
			for (int i = 0; i <10 ; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(1);
			String data = cell.getStringCellValue();
			Thread.sleep(1000);
			System.out.println(data);
			}

	}

}
