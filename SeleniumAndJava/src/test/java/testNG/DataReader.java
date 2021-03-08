package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;

public class DataReader {
	
	@DataProvider(name="data")
	public void readExcel(String filePath,String fileName,String sheetName) throws IOException {
		
	    //Create an object of File class to open xlsx file
		File file = new File("C:\\Users\\Potato\\git\\Selenium\\SeleniumAndJava\\src\\test\\resources\\testData\\TestData.xlsx");
		
		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);
		
				
		
	}

}
