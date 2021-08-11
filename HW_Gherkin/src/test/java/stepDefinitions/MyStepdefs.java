package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterMethod;
import pages.HomePage;
import pages.ItemsPage;
import pages.LogInPage;
import utils.Browser;

public class MyStepdefs {
    @Before
    public void start () {
        Browser.setupBrowser();
    }

    @After
    public void quit() {
        Browser.quit();
    }

    @Given("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        LogInPage.goToPage();
        LogInPage.logInForm();
    }

    @Then("User clicks on Items header button.")
    public void userClicksOnItemsHeaderButton() {
        HomePage.clickItemsTab();
    }

    @When("user clicks on New Item button")
    public void userClicksOnNewItemButton() {
        ItemsPage.clickNewItemButton();
    }

    @And("Fill in required fields to create new item with {string} for name, {string} for price, {string} for quantity")
    public void fillInRequiredFieldsToCreateNewItemWithForNameForPriceForQuantity(String name, String price, String quantity) {
        ItemsPage.fillInForm(name,price,quantity);
    }

    @Then("Click on Add item button")
    public void clickOnAddItemButton() {
        ItemsPage.submitNewItem();
    }

    @And("Confirmation message {string} should be seen")
    public void confirmationMessageShouldBeSeen(String message) {
        ItemsPage.assertConfirmationMessage(message);
    }

    @And("Fill in required fields to create new item with {string} for price, {string} for quantity and leaving mame field blank.")
    public void fillInRequiredFieldsToCreateNewItemWithForPriceForQuantityAndLeavingMameFieldBlank(String price, String quantity) {
    }

    @And("Error message {string} should be seen")
    public void errorMessageShouldBeSeen(String errorMessage) {
        ItemsPage.assertErrorMessage(errorMessage);
    }
}
