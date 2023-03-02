package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\sample_01\\Input12.xlsx");
		Workbook wbf=WorkbookFactory.create(file);
		
		String dataString = wbf.getSheet("Sheet2").getRow(3).getCell(1).getStringCellValue();
		System.out.println(dataString);
		
		
	}
}
