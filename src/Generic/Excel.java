
package Generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author CHANDAN KR. MALHOTRA
 */

public class Excel {
	
	
	public static String getCellValue(String path, String sheet, int r, int c){
		
		String value = "";
		try{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			value = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}
	
	public static int getRowCount(String path, String Sheet){
		
		int row = 0;
		try{
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			row  = wb.getSheet(Sheet).getLastRowNum();
		}catch(Exception e){
			e.printStackTrace();
		}
		return row;
		
	}
	
}
