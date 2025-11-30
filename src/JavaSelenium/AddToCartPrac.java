package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class AddToCartPrac {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
       List<WebElement> ele =  driver.findElements(By.xpath("//h4[@class='product-name']"));
       for(int i=0;i<ele.size();i++)
       {
           String name = ele.get(i).getText();
           System.out.println(name);
           if(name.contains("Cucumber"))
           {
               driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

           } else if (name.contains("Brocolli")) {
               driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
           } else if (name.contains("Beetroot")) {
               driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
           }

       }


    }

}
