package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {
	
	public String fetchDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_SatJuly2023\\Automation\\commonData.properties");

		Properties prop = new Properties();
		prop.load(fis);

		return prop.getProperty(key);
		
	}
	
	
	public String fetchDataFromExcelSheet(String sheetname, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_SatJuly2023\\actitime123\\src\\test\\resources\\studentData.xlsx");
		
		return WorkbookFactory.create(fis).getSheet(sheetname).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}

}
