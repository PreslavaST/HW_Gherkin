package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;

public class ItemsPage {

    private static final By newItemButton = By.xpath("//div[@id=\"headline2\"]//a");
    private static final By itemNameField = By.xpath("//input[@name=\"name\"]");
    private static final By priceField = By.xpath("//input[@name=\"price\"]");
    private static final By quantityField = By.xpath("//input[@name=\"price_quantity\"]");
    private static final By submitButton = By.xpath("//input[@name=\"do_submit\"]");
    private static final By message = By.xpath("//div[@id=\"okmsg\"]");
    private static final By errorMessage = By.xpath("//div[@id=\"error\"]");

    public static void clickNewItemButton () {
        Browser.driver.findElement(newItemButton).click();
    }

    public static void fillInForm (String itemName, String price, String quantity) {
        Browser.driver.findElement(itemNameField).sendKeys(itemName);
        Browser.driver.findElement(priceField).sendKeys(price);
        Browser.driver.findElement(quantityField).clear();
        Browser.driver.findElement(quantityField).sendKeys(quantity);
    }

    public static void submitNewItem(){
        Browser.driver.findElement(submitButton).click();
    }

    public static void assertConfirmationMessage(String expectedMessage){
        String actualMessage = Browser.driver.findElement(message).getText().trim();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
    public static void assertErrorMessage (String expectedMessage) {
        String actualErrorMessage = Browser.driver.findElement(errorMessage).getText().trim();
        Assert.assertEquals(actualErrorMessage, expectedMessage);
    }

}
