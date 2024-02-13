package GentricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelUtility {
	/**
	 * This method is used to fetch the single data from the Excel Sheet
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static String fetchData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getRow(row).getCell(cell).toString();
	}
	/**
	 * This method is used to get the row size in the Excel sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int rowSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getPhysicalNumberOfRows();	
	}
	/**
	 * This method is used to get the column size in the Excel sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int columnSize(String sheet) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IConstant.excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		return s.getRow(0).getPhysicalNumberOfCells();
	}
	/**
	 * This method is used to fetch all the data from the Excel sheet
	 * @param sheet
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static Object[][] fetchAllData(String sheet) throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(IConstant.excel_path);
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet(sheet);
		int rowSize = s.getPhysicalNumberOfRows();
		int columnSize = s.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rowSize][columnSize];
		
		for(int i = 0; i<rowSize; i++) {
			for(int j = 0; j<columnSize; j++) {
				data[i][j] = s.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	

}
