package pages;

import org.openqa.selenium.By;
import utils.Browser;

public class HomePage {

    private static final By itemsTab = By.xpath("//div[@id=\"tabs_objects\"]/a");

    public static void clickItemsTab() {
        Browser.driver.findElement(itemsTab).click();
    }




}
