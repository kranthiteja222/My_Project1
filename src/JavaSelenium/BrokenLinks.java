package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.net.ssl.HttpsURLConnection;
import java.time.Duration;

public class BrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       String url= driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href*='soapui']")));
        System.out.println(url);
        /*URL urlobj = new URL(url);

        HttpsURLConnection conn= (HttpsURLConnection)url.

        driver.close();*/
    }


}
