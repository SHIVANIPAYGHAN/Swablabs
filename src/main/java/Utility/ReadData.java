package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static String readPropertyFile(String value) throws Exception
	{
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Frame25June\\TestData\\config.property");
		prop.load(file);
		return prop.getProperty(value);
	}
	public static String readExcelFile(int rownum,int colNum) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Frame25June\\TestData\\Test Data Framework.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(rownum).getCell(colNum).getStringCellValue();
		return value;
	}
	
}
