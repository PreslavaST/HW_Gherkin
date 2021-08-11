package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class LogInPage {

    private static final By usernameField = By.id ("loginusername");
    private static final By passwordField = By.id ("loginpassword");
    private static final By submitButton = By.id ("loginsubmit");

    public static void logInForm() {
        Browser.driver.findElement(usernameField).sendKeys("preslavast@gmail.com");
        Browser.driver.findElement(passwordField).sendKeys("Parola123!");
        Browser.driver.findElement(submitButton).click();
    }
    public static void goToPage () {
        Browser.driver.get("https://ava-qa-plc.inv.bg/login");

    }

}
