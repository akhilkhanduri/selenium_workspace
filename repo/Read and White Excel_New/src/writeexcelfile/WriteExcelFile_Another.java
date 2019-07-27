package writeexcelfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile_Another {
	private static final String FILE_NAME = "C:\\Users\\rishabh\\Desktop\\selenium\\"
			+ "Read and Write Excel_New\\src\\Book2.xlsx";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Employee Details");
		Map<String,Object[]> data = new HashMap<String,Object[]>();
		data.put("1", new Object[] {"Emp No.","Name","Salary"});
		data.put("2", new Object[] {1d, "Jhon",1500000d});
		data.put("3", new Object[] {2d, "Sam",8000000d});
		data.put("4", new Object[] {3d, "Dean",7000000d});
		
		Set<String> Keyset = data.keySet();
		 int rowNum = 0;
		 
		 for(String key : Keyset){
			 Row row = sheet.createRow(rowNum++);
			 Object[] objarray = data.get(key);
			 
			 int cellNum = 0;
			 
			 	for(Object obj : objarray){
			 		Cell cell = row.createCell(cellNum++);
			 			
			 			if(obj instanceof Date){
			 				cell.setCellValue((Date)obj);
			 			}else if(obj instanceof Boolean){
			 				cell.setCellValue((Boolean)obj);
			 			}else if(obj instanceof String){
			 				cell.setCellValue((String)obj);
			 			}else if(obj instanceof Double){
			 				cell.setCellValue((Double)obj);
			 	}
			 
			 
		 }
			 	try {
					FileOutputStream out = new FileOutputStream(new File("C:\\Users\\rishabh\\Desktop\\selenium\\"
							+ "Read and White Excel_New\\src\\writeexcelfile\\Book3.xlsx"));
					workbook.write(out);
					out.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		   
			   
			   }
}
	}
