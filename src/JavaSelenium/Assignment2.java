package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
       driver.findElement(By.linkText("Nested Frames")).click();
       driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
       String output = driver.findElement(By.xpath("//div[@id='content']")).getText();
        System.out.println(output);
        driver.switchTo().defaultContent();
        driver.close();
    }

}
