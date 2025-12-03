package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;

public class MouseActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Actions actions= new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
        actions.moveToElement((driver.findElement(By.id("twotabsearchtextbox")))).click().keyDown(Keys.SHIFT).sendKeys("realme narzo pro").keyUp(Keys.SHIFT).build().perform();
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

}
