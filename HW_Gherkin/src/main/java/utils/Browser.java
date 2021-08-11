package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;

    public static void setupBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\WEB Browser Drivers\\chromeNew92\\chromedriver.exe");
        driver = new ChromeDriver();
//        driver.get("https://ava-qa-plc.inv.bg/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public static void quit () {
     driver.quit();
    }
}
