package Utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseTest {

//For Locators
	    public static String getLocator(String locatorName,String pageName) throws Exception {
	        String filePath = System.getProperty("user.dir") + "/Locators/MobileLocators.xlsx";
	        FileInputStream fis = new FileInputStream(filePath);
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        
	        // 1. Target the specific sheet from your image
	        XSSFSheet sheet = workbook.getSheet(pageName);
	        String xpathValue = "";

	        // 2. Loop through rows (start at 1 to skip header "LocatorName")
	        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
	            String currentLocatorName = sheet.getRow(i).getCell(0).getStringCellValue();
	            
	            if (currentLocatorName.equalsIgnoreCase(locatorName)) {
	                xpathValue = sheet.getRow(i).getCell(1).getStringCellValue();
	                break;
	            }
	        }

	        workbook.close();
	        fis.close();
	        return xpathValue;
	    }
	    
	   
}
