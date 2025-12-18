package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        //driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();
        System.out.println(driver.getTitle());
        Set<String> windIds=driver.getWindowHandles();
        System.out.println(windIds);
        List<String> li = new ArrayList<>(windIds);
        String wid1 = li.get(0);
        String wind2 = li.get(1);
        driver.switchTo().window(wind2);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//input[@name='EmailHomePage']")).sendKeys("Ktantgy@gmail.com");
        driver.switchTo().window(wid1);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Kranthi");
        System.out.println(driver.getTitle());
        driver.quit();
    }

}
