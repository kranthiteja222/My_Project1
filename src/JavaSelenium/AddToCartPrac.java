package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToCartPrac {

    public static void main(String[] args) {

        String Items[]={"Brocolli","Cucumber","Beetroot","Tomato"};
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        addItems(driver,Items);
        proccedCart(driver);

    }
    public static void addItems(WebDriver driver,String[] Items)
    {
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        List<WebElement> ele =  driver.findElements(By.xpath("//h4[@class='product-name']"));
        for(int i = 0;i<ele.size();i++) {
            String names[] = ele.get(i).getText().split("-");
            String formatedName = names[0].trim();
            List<String> str = Arrays.asList(Items);
            if(str.contains(formatedName))
            {
                System.out.println(formatedName);
                // this below locator is throwing an error because this Add to cart is changing to added after clickin
                //driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                // so we will use diff locator which is static one
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

            }


        }
    }
    public static void proccedCart(WebDriver driver)
    {
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Code applied ..!']")));
        System.out.println(driver.findElement(By.xpath("//span[normalize-space()='Code applied ..!']")).getText());
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();


    }

}

