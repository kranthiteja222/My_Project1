package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LocatorsPrac {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.className("gLFyf"));
        element.sendKeys("amazon.com");
        Actions action;
        action=new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);


        driver.close();

    }
}
