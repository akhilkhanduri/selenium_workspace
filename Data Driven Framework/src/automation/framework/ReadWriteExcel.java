package automation.framework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.CellType;

public class ReadWriteExcel {
	
	WebDriver driver;
	WebDriverWait wait;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;
	int numrow;
	
	@BeforeTest
	public void setup(){
		try {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
					+ "Browser Driver\\geckodriver.exe");	
			driver = new FirefoxDriver();
			driver.navigate().to("http://www.facebook.com");
			
			wait = new WebDriverWait(driver, 30);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	@Test
	public void readdata() throws IOException{
		// Import excel sheet.
		try {
			File file = new File("C:\\Users\\rishabh\\Desktop\\Selenium Class\\"
					+ "Workspace\\Data Driven Framework\\FacebookData.xlsx");
			
			// Load the file.
			FileInputStream input = new FileInputStream(file);	
			
		
			//Load the Workbook 
			workbook = new XSSFWorkbook(input);
			
			// Load the sheet.
			sheet = workbook.getSheetAt(0);
			
			/*int totalRows=sheet.getLastRowNum();*/		
			int cellnum = sheet.getLastRowNum();
			System.out.println(cellnum);
			
			for(int i=1; i<=cellnum; i++){
				
				// Import data for Email.
				cell = sheet.getRow(i).getCell(1);
				cell.setCellType(CellType.STRING);
				driver.findElement(By.cssSelector("#email")).sendKeys(cell.getStringCellValue());
				
				// Import data for password.
				cell = sheet.getRow(i).getCell(2);
				cell.setCellType(CellType.STRING);
				driver.findElement(By.cssSelector("#pass")).sendKeys(cell.getStringCellValue());
				
				driver.findElement(By.xpath("//*[@value='Log In']")).click();
				
				//Write Data on excel file.
				/*FileOutputStream output = new FileOutputStream(file);*/
				
				// Write Data in Excel Sheet
				String message = "Pass";
						
				// Create cell where data need to be written.
				sheet.getRow(i).getCell(3).setCellValue(message);
				
				// Specify the file in which data needs to be written.
				FileOutputStream fileOutput = new FileOutputStream(file);
				
				 // finally write content
				workbook.write(fileOutput);
				// close the file
				fileOutput.close();
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
