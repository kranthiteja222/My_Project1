package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.findElement(By.className("blinkingText")).click();
        Set<String> windowids=driver.getWindowHandles();
        Iterator<String> it = windowids.iterator();
        String parentID = it.next();
        String childID= it.next();

        driver.switchTo().window(childID);
        String data=driver.findElement(By.cssSelector(".im-para.red")).getText();
        System.out.println(data);
        String emaid=data.split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentID);
        driver.findElement(By.id("username")).sendKeys(emaid);
    }

}
