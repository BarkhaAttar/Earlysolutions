package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrerization {
public static String getData(int row,int cell) throws EncryptedDocumentException, IOException{
		
		FileInputStream file=new FileInputStream("C:\\Users\\BAttar\\eclipse-workspace\\EarlyResolution\\src\\test\\resources\\XLData.xlsx");
	
		String value=WorkbookFactory.create(file).getSheet("Parameter").getRow(row).getCell(cell).getStringCellValue();
		
		return value;

}
}
