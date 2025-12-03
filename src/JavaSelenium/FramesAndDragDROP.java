package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class FramesAndDragDROP {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        Actions Ac= new Actions(driver);
        WebElement Source=driver.findElement(By.id("draggable"));
        WebElement Target= driver.findElement(By.id("droppable"));
        Ac.dragAndDrop(Source,Target).build().perform();
        driver.switchTo().defaultContent();
    }
}
