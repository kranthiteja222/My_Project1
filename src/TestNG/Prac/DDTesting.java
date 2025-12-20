package TestNG.Prac;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class DDTesting {
    private static Object password;

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        File src= new File("C:\\Users\\kranthi\\IdeaProjects\\My_Project1\\External\\Untitled spreadsheet.xlsx");
        FileInputStream file = new FileInputStream(src);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);
        String username="";
        String password="";
        int row = sheet.getLastRowNum();
        XSSFRow row1 = sheet.getRow(0);
        int cell_size = row1.getLastCellNum();
        for(int i=1;i<=row;i++) {
            for (int j = 0; j < cell_size; j++) {
                DataFormatter formatter = new DataFormatter();
                if (j == 0) {
                    XSSFCell cell = sheet.getRow(i).getCell(j);
                    username = formatter.formatCellValue(cell);
                } else if (j == 1) {
                    XSSFCell cell1 = sheet.getRow(i).getCell(j);
                    password = formatter.formatCellValue(cell1);
                }
            }
                driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
                driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
                driver.findElement(By.xpath("//input[@name='submit']")).click();
                driver.findElement(By.xpath("//input[@name='submit']")).click();
                driver.findElement(By.linkText("SIGN-OFF")).click();

        }
        driver.quit();
    }

    }
