package JavaSelenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleHttpsCerti {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions opt = new ChromeOptions();
        opt.setAcceptInsecureCerts(true);

        WebDriver driver= new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
        Thread.sleep(10000);
        driver.close();
    }

}
