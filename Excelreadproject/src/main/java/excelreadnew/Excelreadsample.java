package excelreadnew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreadsample {
	public static FileInputStream x ;//read excel file 
	public static XSSFWorkbook d; // 
	public static XSSFSheet s;
	 
public static String getStringData(int a , int b) throws 
IOException

{
x =new FileInputStream("\\Users\\Meera Rupak\\Documents\\meeraexcel.xlsx");//
d = new XSSFWorkbook(x); // to add data 
s= d.getSheet("Sheet1"); // copy sheetname
XSSFRow r = s.getRow(a); // now to get row use Row interface
XSSFCell m = r.getCell(b); // get coloumn
return m.getStringCellValue();// 

}
public static String getIntegerData(int a , int b) throws 
IOException

{
x =new FileInputStream("\\Users\\Meera Rupak\\Documents\\meeraexcel.xlsx");// to specify path of excelfile‪
d= new XSSFWorkbook(x); // to add data 
s= d.getSheet("Sheet1"); // copy sheetname
XSSFRow r = s.getRow(a); // now to get row use Row interface
XSSFCell m = r.getCell(b);

int p = (int)m.getNumericCellValue();
return String.valueOf(p);


}


}