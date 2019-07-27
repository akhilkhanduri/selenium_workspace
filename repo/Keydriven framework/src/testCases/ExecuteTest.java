package testCases;
import java.util.Properties;
import operation.ReadObject;
import operation.UIOperation;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import excelExportAndFileIO.ExcelFile;

/*THIS IS THE EXAMPLE OF KEYWORD DRIVEN TEST CASE*/

public class ExecuteTest {
    @Test
	public void testLogin() throws Exception {
		// TODO Auto-generated method stub
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vikrant Nandan\\Desktop\\SQT\\"
    			+ "Selenium WebDriver\\Selenium Drivers\\Browser Driver\\geckodriver.exe");
    	WebDriver webdriver = new FirefoxDriver();
    	
    	ExcelFile file = new ExcelFile();
        ReadObject object = new ReadObject();
        Properties allObjects =  object.getObjectRepository();
        UIOperation operation = new UIOperation(webdriver);
       
        //Read keyword sheet
        Sheet Sheet = file.readExcel(System.getProperty("user.dir")+"\\","TestCase.xlsx" , "KeywordFramework");
        
        //Find number of rows in excel file
    	int rowCount = Sheet.getLastRowNum()-Sheet.getFirstRowNum();
    	
    	//Create a loop over all the rows of excel file to read it
    	for (int i = 1; i < rowCount+1; i++) {
    		
    		//Loop over all the rows
    		Row row = Sheet.getRow(i);
    		
    		//Check if the first cell contain a value, if yes, That means it is the new testcase name
    		if(row.getCell(0).toString().length()==0){
    		
    			//Print testcase detail on console
    			System.out.println(row.getCell(1).toString()+"----"+ row.getCell(2).toString()+"----"+
    			row.getCell(3).toString()+"----"+ row.getCell(4).toString());
    		
    			//Call perform function to perform operation on UI
    			operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
    				row.getCell(3).toString(), row.getCell(4).toString());
    	    }
    		else{
    			
    			//Print the new  testcase name when it started
    				System.out.println("New Testcase->"+row.getCell(0).toString() +" Started");
    			}
    		}
	}

}

