package JavaSelenium;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingDataFromExcel {
    public static void main(String[] args) throws IOException {
       // FileInputStream fi = new FileInputStream("C:\\Users\\kranthi\\IdeaProjects\\My_Project1\\External\\Book_Purchase_Data1.xlsx");
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\External\\\\Book_Purchase_Data1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int lastrow = sheet.getLastRowNum();



    }

}
