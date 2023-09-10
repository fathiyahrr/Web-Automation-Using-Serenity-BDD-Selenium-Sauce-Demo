package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CheckoutPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutSteps {

    private final WebDriver driver = Hooks.driver;

    CheckoutPage checkoutPage = new CheckoutPage (driver);

    @Then("User already on checkout:Your Information")
    public void verifycheckoutPage1(){
        Assert.assertTrue(checkoutPage.verifycheckoutPage1());
    }

    @When("User input {string} as a firstName {string} as a lastName {string} as a postalCode")
    public void inputCredential(String frstName, String lstName, String pstalCode){
        checkoutPage.setFirstName(frstName);
        checkoutPage.setLastName(lstName);
        checkoutPage.setPostalCode(pstalCode);
    }
    @And("User click button continue")
    public void clicktButtonContinue(){
        checkoutPage.clickButtonContinue();
    }
}
