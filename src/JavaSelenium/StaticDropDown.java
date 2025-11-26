package JavaSelenium;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Scanner;

public class StaticDropDown {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        Scanner sc = new Scanner(System.in);
        Actions act= new Actions(driver);


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement ele= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        ele.click();
        Select sel = new Select(ele);
        sel.selectByValue("USD"); act.sendKeys(Keys.ENTER);
        System.out.println(sel.getFirstSelectedOption().getText());
        System.out.println("pls enter how many passengers");
        int a=sc.nextInt();
        driver.findElement(By.id("divpaxinfo")).click();
        for(int i=0;i<a;i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        System.out.println("pls enter how many child");
        int c= sc.nextInt();
        if(c>0)
        {
            for(int i=0;i<c;i++)
            {
                driver.findElement(By.id("hrefIncChd")).click();
            }
        }

        driver.findElement(By.id("btnclosepaxoption")).click();

    }
}
