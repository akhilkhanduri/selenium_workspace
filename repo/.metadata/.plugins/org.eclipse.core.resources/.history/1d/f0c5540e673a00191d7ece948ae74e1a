package read_data_from_Excel_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	
	
	public static void main(String[] args)throws IOException{
		ReadExcelFile  objExcelFile = new ReadExcelFile();
		String filepath = System.getProperty("user.dir")+"\\src\\read_data_from_Excel_file";
		objExcelFile.ReadExcel(filepath,"Book1.xlsx","Sheet1");
		}
	
	public void ReadExcel(String filepath, String filename, String sheetname)throws IOException{
		
		File file = new File(filepath+"\\"+filename);
		System.out.println(file);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook TestDataWorkbook = null;
		
		String fileExtensionName = filename.substring(filename.indexOf("."));
		
		if(fileExtensionName.equals(".xlsx")){
			TestDataWorkbook = new XSSFWorkbook(inputStream);
		}
		Sheet sheet1 = TestDataWorkbook.getSheet(sheetname);
		int rowCount = sheet1.getLastRowNum()-sheet1.getFirstRowNum();
		
		for(int i = 0; i <rowCount+1; i++){
			Row row = sheet1.getRow(i);
			
			for(int j = 0; j < row.getLastCellNum(); j++){
				System.out.println(row.getCell(j).getStringCellValue()+ "  ");
			}
			System.out.println();
			}
		}
		

	}


