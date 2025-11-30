package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPresentDate {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
        System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
       // System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
       String ele= driver.findElement(By.id("Div1")).getDomAttribute("style");
      if(ele.contains("0.5"))
      {
          System.out.println("disabled");
      }
      else {
          System.out.println("enabled");
      }
    }

}
